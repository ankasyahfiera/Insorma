package com.example.insorma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.insorma.databaseSet.Databases;
import com.example.insorma.modelSet.UserSession;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener{

    TextView emailProfile, usernameProfile, phoneProfile;
    EditText changeUsername;
    Button btnSave, btnDelete, btnLogout;
    Databases databases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        emailProfile = findViewById(R.id.tvEmailProfile);
        usernameProfile = findViewById(R.id.tvUsernameProfile);
        phoneProfile = findViewById(R.id.tvPhoneProfile);
        changeUsername = findViewById(R.id.etNewUserAdd);

        btnSave = findViewById(R.id.btnProfileSave);
        btnDelete = findViewById(R.id.btnProfileDelete);
        btnLogout = findViewById(R.id.btnProfileLogout);

        emailProfile.setText(databases.getUserLogin().getEmail());
        usernameProfile.setText(databases.getUserLogin().getUsername());
        phoneProfile.setText(databases.getUserLogin().getPhone());

        btnLogout.setOnClickListener(this);
        btnDelete.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view == btnLogout){
            Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        } else if(view == btnDelete){
            Intent intent2 = new Intent(ProfileActivity.this, MainActivity.class);
            startActivity(intent2);
            finish();
        }

    }
}