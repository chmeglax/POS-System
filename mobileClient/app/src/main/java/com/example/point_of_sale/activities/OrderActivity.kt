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
import com.example.point_of_sale.adapters.OrderItemsAdapter
import com.example.point_of_sale.helpers.SwipeToDeleteCallback
import com.example.point_of_sale.models.OrderItem
import com.example.point_of_sale.network.ApiInterface
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class OrderActivity : AppCompatActivity() {
    private var items = arrayListOf<OrderItem>()
    private var adapter : RecyclerView.Adapter<OrderItemsAdapter.ViewHolder>? = null
    private var layoutManager : RecyclerView.LayoutManager? = null
    private var totalCostView : TextView? = null
    private var totalCost : Double = 0.0
    private var apiInterface: ApiInterface? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        CoroutineScope(Dispatchers.IO).launch {
            try{
                val apiInterface = ApiInterface.create()
                var response=apiInterface.getProductById("6294ea4e84bcaa3fef995d7b")
                if (response.isSuccessful && response.body() != null) {
                    val content = response.body()
                    System.out.println(content?.toString())
                } else {
                    System.out.println(response.message())
                    Toast.makeText(
                        this@OrderActivity,
                        "Error Occurred: ${response.message()}",
                        Toast.LENGTH_LONG
                    ).show()
                }

            } catch (e: Exception) {
                System.err.println(e.message)
                Toast.makeText(
                    this@OrderActivity,
                    "Error Occurred: ${e.message}",
                    Toast.LENGTH_LONG
                ).show()
            }

        }
        //----
        layoutManager = LinearLayoutManager(this)
        var recyclerView = findViewById<RecyclerView>(R.id.orderItemRecyclerView)
        recyclerView.layoutManager = layoutManager
        adapter = OrderItemsAdapter(items)
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

                    Toast.makeText(this, "Product Added", Toast.LENGTH_SHORT)
                    val productName = "BBBB"
                    val quantity = Integer.parseInt(quantityEditText.text.toString())
                    val unitPrice = 1.0
                    insertItem(OrderItem(productName, quantity , unitPrice,quantity * unitPrice))

                })
                .setNegativeButton("Cancel",DialogInterface.OnClickListener { _, _ ->  })
                .create()
                .show()
        }
    }
    private fun insertItem(newItem : OrderItem){




        items.add(newItem)
        totalCost += newItem.quantity * newItem.unitPrice
        totalCostView?.text = "$totalCost"

        adapter?.notifyDataSetChanged()
    }
    fun removeItem(position : Int){
        val removedItem  = items[position]
        items.removeAt(position)
        totalCost -= removedItem.unitPrice * removedItem.quantity
        totalCostView?.text = "$totalCost"
        adapter?.notifyItemRemoved(position)

    }



}