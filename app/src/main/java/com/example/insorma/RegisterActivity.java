package com.example.insorma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.insorma.databaseSet.Databases;
import com.example.insorma.modelSet.UserSession;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editTextEmail, editTextUsername, editTextPhone, editTextPassword;
    Button buttonRegister, buttonLogin;
    Databases databases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextEmail = findViewById(R.id.editTextRegisterEmail);
        editTextUsername = findViewById(R.id.editTextRegisterUsername);
        editTextPhone = findViewById(R.id.editTextRegisterPhone);
        editTextPassword = findViewById(R.id.editTextRegisterPassword);
        buttonRegister = findViewById(R.id.buttonRegister);
        buttonLogin = findViewById(R.id.buttonLoginRegister);

        buttonRegister.setOnClickListener(this);
        buttonLogin.setOnClickListener(this);

//        buttonRegister.setOnClickListener(v -> {
//            String email = editTextEmail.getText().toString();
//            String username = editTextUsername.getText().toString();
//            String phone = editTextPhone.getText().toString();
//            String password = editTextPassword.getText().toString();
//
//            UserSession nUser = new UserSession(email, username, phone, password);
//
//            if(email.isEmpty()){
//                Toast.makeText(getApplicationContext(), "All fields must be filled", Toast.LENGTH_SHORT).show();
//            } else if(username.isEmpty()){
//                Toast.makeText(getApplicationContext(), "All fields must be filled", Toast.LENGTH_SHORT).show();
//            } else if(phone.isEmpty()){
//                Toast.makeText(getApplicationContext(), "All fields must be filled", Toast.LENGTH_SHORT).show();
//            } else if(password.isEmpty()){
//                Toast.makeText(getApplicationContext(), "All fields must be filled", Toast.LENGTH_SHORT).show();
//            }
//
//            databases.getUserList().add(nUser);
//
//            for(UserSession users : databases.getUserList()){
//                Log.wtf("registeredUser", users.getEmail() + "/" + users.getUsername()
//                        + "/" + users.getPhone() + "/" + users.getPassword());
//            }
//
//            editTextEmail.setText("");
//            editTextUsername.setText("");
//            editTextPhone.setText("");
//            editTextPassword.setText("");
//        });

    }

    @Override
    public void onClick(View view) {
        if(view == buttonRegister){
            String email = editTextEmail.getText().toString();
            String username = editTextUsername.getText().toString();
            String phone = editTextPhone.getText().toString();
            String password = editTextPassword.getText().toString();

            UserSession nUser = new UserSession(email, username, phone, password);

            if(email.isEmpty()){
                Toast.makeText(getApplicationContext(), "All fields must be filled", Toast.LENGTH_SHORT).show();
            } else if(username.isEmpty()){
                Toast.makeText(getApplicationContext(), "All fields must be filled", Toast.LENGTH_SHORT).show();
            } else if(phone.isEmpty()){
                Toast.makeText(getApplicationContext(), "All fields must be filled", Toast.LENGTH_SHORT).show();
            } else if(password.isEmpty()){
                Toast.makeText(getApplicationContext(), "All fields must be filled", Toast.LENGTH_SHORT).show();
            }

            databases.getUserList().add(nUser);

            for(UserSession users : databases.getUserList()){
                Log.wtf("registeredUser", users.getEmail() + "/" + users.getUsername()
                        + "/" + users.getPhone() + "/" + users.getPassword());
            }

//            editTextEmail.setText("");
//            editTextUsername.setText("");
//            editTextPhone.setText("");
//            editTextPassword.setText("");
        } else if(view == buttonLogin){
            Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}