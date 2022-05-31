package com.example.point_of_sale.models

data class OrderItem(val productName : String, val quantity : Int, val unitPrice : Double,val totalCost : Double)