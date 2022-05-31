package com.example.point_of_sale.activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.point_of_sale.R
import com.example.point_of_sale.adapters.OrderItemsAdapter
import com.example.point_of_sale.models.OrderItem

class OrderActivity : AppCompatActivity() {
    private var items = arrayListOf<OrderItem>(
        OrderItem("A", 3, 1.0,3.0),
        OrderItem("A", 3, 1.0,3.0),
        OrderItem("A", 3, 1.0,3.0)
    )
    private var adapter : RecyclerView.Adapter<OrderItemsAdapter.ViewHolder>? = null
    private var layoutManager : RecyclerView.LayoutManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        layoutManager = LinearLayoutManager(this)
        var recyclerView = findViewById<RecyclerView>(R.id.orderItemRecyclerView)
        recyclerView.layoutManager = layoutManager
        adapter = OrderItemsAdapter(items)
        recyclerView.adapter = adapter
        val addBtn = findViewById<Button>(R.id.addProductBtn)
        val deleteBtn = findViewById<ImageView>(R.id.deleteItemBtn)
        addBtn.setOnClickListener{
            val newItem = OrderItem("A", 3, 1.0,3.0)
            insertItem(newItem)
        }


    }
    fun insertItem(newItem : OrderItem){

        items.add(newItem)
        adapter?.notifyDataSetChanged()

    }
    fun removeItem(view : View){

    }



}