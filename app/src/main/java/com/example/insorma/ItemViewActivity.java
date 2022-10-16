package com.example.insorma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.insorma.modelSet.Furniture;

public class ItemViewActivity extends AppCompatActivity {

    ImageView imageView;
    TextView tvName, tvRate, tvPrice;
    Furniture furniture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view);

        imageView = findViewById(R.id.imageViewItem);
        tvName = findViewById(R.id.tvNameItem);
        tvRate = findViewById(R.id.tvRatingItem);
        tvPrice = findViewById(R.id.tvPriceItem);

        Intent intent = getIntent();

        if (intent.getExtras() != null){
            furniture = (Furniture) intent.getSerializableExtra("item");
            imageView.setImageResource(furniture.getCover());
            tvName.setText(furniture.getTitle());
            tvRate.setText(furniture.getRating());
            tvPrice.setText(furniture.getPrice());
        }
    }
}