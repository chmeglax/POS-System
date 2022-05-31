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

class OrderItemsAdapter(private val items : List<OrderItem>) : RecyclerView.Adapter<OrderItemsAdapter.ViewHolder>() {



    // TODO Change static values
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.order_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) { //populate data to cardview
        holder.itemName.text = items[position].productName
        holder.quantity.text = "Quantity : ".plus(items[position].quantity)
        holder.totalItemCost.text = "Total cost : ".plus(items[position].totalCost)
        holder.unitPrice.text = "Unit Price :".plus(items[position].unitPrice)
    }

    override fun getItemCount(): Int {
        return items.size
    }



    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var itemName : TextView
        var quantity : TextView
        var unitPrice : TextView
        var totalItemCost : TextView
        init{ //Initialization code for the instance
            itemName = itemView.findViewById(R.id.itemName)
            quantity = itemView.findViewById(R.id.quantity)
            unitPrice = itemView.findViewById(R.id.unitPrice)
            totalItemCost = itemView.findViewById(R.id.totalItemCost)

            itemView.setOnClickListener{
                val position : Int = adapterPosition
                Toast.makeText(itemView.context, "itemName ${items[position].productName} quantity ${items[position].quantity} " +
                        "unitPrice ${items[position].unitPrice} totalItemCost ${items[position].totalCost}", Toast.LENGTH_SHORT).show()
            }


        }
    }
}