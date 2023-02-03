package com.example.listviewpro.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listviewpro.MainActivity;
import com.example.listviewpro.R;
import com.example.listviewpro.model.Product;

import java.util.List;

public class ProductAdapter extends BaseAdapter {


    private Context context;
    private List<Product> list;

    public ProductAdapter(Context context, List<Product> list) {
        this.context = context;
        this.list = list;
    }



    @Override
    public int getCount() {
        return list.size();
    }

    //lấy thành phần tại vị trí mà chúng ta truyền vào
    @Override
    public Object getItem(int position) {
        if(position < 0) return null;


        return list.get(position);
    }

    // trả về chính vị trí mà position đưa vào
    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null) {
            //inflate thổi hay tạo view
            view = LayoutInflater.from(context).inflate(R.layout.layout_product_item, null);
        }

        ImageView ivImage = view.findViewById(R.id.ivImage);
        TextView tvProductId = view.findViewById(R.id.tvProductId);
        TextView tvProductName = view.findViewById(R.id.tvProductName);
        TextView tvQuantity = view.findViewById(R.id.tvQuantity);
        TextView tvPrice = view.findViewById(R.id.tvPrice);
        TextView tvMaker = view.findViewById(R.id.tvMaker);

        Product product = list.get(i);
        ivImage.setImageResource(product.getImageId());
        tvProductId.setText(Integer.toString(product.getProductId()));
        tvProductName.setText(product.getName());
        tvQuantity.setText(Integer.toString(product.getQuantity()));
        tvPrice.setText(product.getPrice());
        tvMaker.setText(product.getMaker());


        return view;
    }
}
