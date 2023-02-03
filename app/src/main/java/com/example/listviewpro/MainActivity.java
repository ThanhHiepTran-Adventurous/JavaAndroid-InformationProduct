package com.example.listviewpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.listviewpro.adapter.ProductAdapter;
import com.example.listviewpro.model.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ProductAdapter adapter;
    private List<Product> list;
    Button btnAddProduct;

    public MainActivity() {

        list = new ArrayList<>();


        list.add(new Product(1, R.drawable.fruitsjpg,
                "Trái cây", 12, "16.000", "Cheng"));
        list.add(new Product(2, R.drawable.tra_sua,
                "Hồng trà sữa", 12, "16.000", "trần bảo ngọc"));
////        list.add(new Product(3, R.drawable.ic_baseline_build_24,
//                "Tran chau duong den", 12, "18.000", "Viet Nam"));
//        list.add(new Product(4, R.drawable.ic_baseline_build_24,
//                "Che khuc bach", 12, "20.000", "Cheng"));
        //truyền list vào adapter
        adapter = new ProductAdapter(this, list);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = findViewById(R.id.lvProducts);
        btnAddProduct = findViewById(R.id.btnAddProduct);
        lv.setAdapter(adapter);
        btnAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Khai báo intent
                Intent myIntent = new Intent(MainActivity.this, Nhap_Product.class);

                //khởi động
                startActivity(myIntent);
            }
        });

    }

}