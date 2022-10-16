package com.example.insorma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TransactionActivity extends AppCompatActivity {

    TextView transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        transaction = findViewById(R.id.tvTransaction);

        transaction.setText("No Transaction Data");
    }
}