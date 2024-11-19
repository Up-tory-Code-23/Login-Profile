package com.example.uptory_yj

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class OrderHistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order_history)

        val recyclerView: RecyclerView = findViewById(R.id.orderHistoryRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // 예시 데이터
        val orderList = listOf(
            OrderItem("주문 1", "배송 중", 30000, R.drawable.ic_order_placeholder),
            OrderItem("주문 2", "배송 완료", 25000, R.drawable.ic_order_placeholder),
            OrderItem("주문 3", "취소됨", 10000, R.drawable.ic_order_placeholder)
        )

        val adapter = OrderHistoryAdapter(orderList)
        recyclerView.adapter = adapter
    }
}