package com.example.insorma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.insorma.databaseSet.Databases;
import com.example.insorma.modelSet.Furniture;

public class HomeActivity extends AppCompatActivity {

    Databases databases;
    RecyclerView rvFurniture;
    FurnitureAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("Halo " + databases.getUserLogin().getUsername());

        databases = new Databases();

        rvFurniture = findViewById(R.id.rvFurniture);
        adapter = new FurnitureAdapter(databases.getFurnitures(), new FurnitureAdapter.ItemClickListener() {
            @Override
            public void onItemClick(Furniture furniture) {
                showToast(furniture.getTitle() + " Clicked");
            }
        });

        rvFurniture.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvFurniture.setAdapter(adapter);

    }

    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.homePage:
                Intent intent1 = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity(intent1);
                return true;
            case R.id.transaction:
                Intent intent2 = new Intent(HomeActivity.this, TransactionActivity.class);
                startActivity(intent2);
                return true;
            case R.id.profile:
                Intent intent3 = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}