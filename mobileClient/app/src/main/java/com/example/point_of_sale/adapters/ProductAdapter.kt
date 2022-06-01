package com.example.point_of_sale.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.point_of_sale.R
import com.example.point_of_sale.models.OrderItem
import com.example.point_of_sale.models.Product

class ProductAdapter(private val items : List<Product>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {



    // TODO Change static values
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.order_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) { //populate data to cardview
        holder.id = items[position].id
        holder.name.text = items[position].name
        holder.quantity.text = "Quantity : ".plus(items[position].quantity)
        holder.totalItemCost.text = "Total cost : ".plus(items[position].quantity?.times(items[position].price))
        holder.price.text = "Unit Price :".plus(items[position].price)
    }

    override fun getItemCount(): Int {
        return items.size
    }



    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var id : String? = null
        var name : TextView
        var quantity : TextView
        var price : TextView
        var totalItemCost : TextView
        init{ //Initialization code for the instance
            name = itemView.findViewById(R.id.itemName)
            quantity = itemView.findViewById(R.id.quantity)
            price = itemView.findViewById(R.id.unitPrice)
            totalItemCost = itemView.findViewById(R.id.totalItemCost)
        }
    }
}