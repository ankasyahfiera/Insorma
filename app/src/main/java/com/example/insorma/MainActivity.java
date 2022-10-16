package com.example.insorma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.insorma.databaseSet.Databases;
import com.example.insorma.modelSet.UserSession;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextEmail, editTextPassword;
    Button buttonLogin, buttonRegister;
    Databases databases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = findViewById(R.id.editTextLoginEmail);
        editTextPassword = findViewById(R.id.editTextLoginPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonRegister = findViewById(R.id.buttonRegisterLogin);

        buttonLogin.setOnClickListener(this);
        buttonRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == buttonLogin) {
            String email = editTextEmail.getText().toString();
            String password = editTextPassword.getText().toString();

            for(UserSession users : databases.getUserList()){
                if(email.equals(users.getEmail()) && password.equals(users.getPassword())){
                    databases.setUserLogin(users);
                    Intent i = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(i);
                    return;
                }
            }
            Toast.makeText(getApplicationContext(), "User not found", Toast.LENGTH_SHORT).show();
        } else if(view == buttonRegister){
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        }
    }

}