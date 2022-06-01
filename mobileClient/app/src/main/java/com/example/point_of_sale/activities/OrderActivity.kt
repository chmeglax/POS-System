package com.example.point_of_sale.activities

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.point_of_sale.R
import com.example.point_of_sale.adapters.ProductAdapter
import com.example.point_of_sale.helpers.SwipeToDeleteCallback
import com.example.point_of_sale.models.OrderItem
import com.example.point_of_sale.models.Product
import com.example.point_of_sale.network.ApiInterface
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class OrderActivity : AppCompatActivity() {
    private var items = arrayListOf<Product>()
    private var adapter : RecyclerView.Adapter<ProductAdapter.ViewHolder>? = null
    private var layoutManager : RecyclerView.LayoutManager? = null
    private var totalCostView : TextView? = null
    private var totalCost : Double = 0.0
    private var apiInterface: ApiInterface? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        //----
        layoutManager = LinearLayoutManager(this)
        var recyclerView = findViewById<RecyclerView>(R.id.orderItemRecyclerView)
        recyclerView.layoutManager = layoutManager
        adapter = ProductAdapter(items)
        recyclerView.adapter = adapter
        totalCostView = findViewById(R.id.totalCostValue)

        listenerSetup()




        val swipeToDeleteCallback = object : SwipeToDeleteCallback(){
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.adapterPosition
                removeItem(position)

                Log.e("items content", items.toString())
            }
        }
        val itemTouchHelper = ItemTouchHelper(swipeToDeleteCallback)
        itemTouchHelper.attachToRecyclerView(recyclerView)
    }


    private fun listenerSetup(){
        val addBtn = findViewById<Button>(R.id.addProductBtn)
        addBtn.setOnClickListener{
            val intentIntegrator = IntentIntegrator(this)
            intentIntegrator.setDesiredBarcodeFormats(listOf(IntentIntegrator.QR_CODE))
            intentIntegrator.setOrientationLocked(false)
            intentIntegrator.initiateScan()


            //val newItem = OrderItem("A", 3, 1.0,3.0)
            //insertItem(newItem)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        var result = IntentIntegrator.parseActivityResult(resultCode, data) // INtegrator is specific to zxing
        if (result != null) {
            val quantityEditText = EditText(this)
            quantityEditText.inputType = InputType.TYPE_CLASS_NUMBER
            quantityEditText.setText("1")
            quantityEditText.gravity = Gravity.CENTER_HORIZONTAL
            val alDialog = AlertDialog.Builder(this)
            alDialog.setView(quantityEditText)
            alDialog
                .setMessage("Set the quantity")
                //.setMessage(result.contents)
                .setPositiveButton("Confirm", DialogInterface.OnClickListener { _, _ ->
                    //TODO Api CALL
                    val productId = result.contents
                    var newProduct : Product? = null
                    CoroutineScope(Dispatchers.IO).launch {
                        try {
                            val apiInterface = ApiInterface.create()
                            var response = apiInterface.getProductById(productId)
                            if (response.isSuccessful && response.body() != null) {
                                val content = response.body()
                                if (content != null) {
                                    val productName = content.name
                                    val quantity =
                                        Integer.parseInt(quantityEditText.text.toString())
                                    val unitPrice = content.price
                                    newProduct = Product(productId, productName, unitPrice, quantity)
                                    withContext(Dispatchers.Main){ // Calls the main thread
                                        insertItem(newProduct!!)
                                    }
                                }
                            } else {
                                Log.e("HI", response.message())
                            }
                        } catch (e: Exception) {
                            System.err.println(e.message)
                        }
                    }



                })
                .setNegativeButton("Cancel",DialogInterface.OnClickListener { _, _ ->  })
                .create()
                .show()
        }
    }
    private fun insertItem(newItem : Product){
        items.add(newItem)
        println(items)
        adapter?.notifyItemInserted(items.size)
        totalCost += (newItem.quantity?.times(newItem.price)!! ?: 0) as Double
        totalCostView?.text = "$totalCost"

    }
    fun removeItem(position : Int){
        val removedItem  = items[position]
        items.removeAt(position)
        totalCost -= (removedItem.quantity?.times(removedItem.price)!! ?: 0) as Double
        totalCostView?.text = "$totalCost"
        adapter?.notifyItemRemoved(position)

    }



}