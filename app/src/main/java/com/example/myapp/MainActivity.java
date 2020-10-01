package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import models.User;
import sqlite.Database;
import validations.Validations;

public class MainActivity extends Activity
        implements IActivity {
//    public static String TAG_MAIN_ACTIVITY = "MainActivity";
    private EditText txtEmail;
    private EditText txtPassword;
    private TextView txtErrorEmail;
    private Button btnLogin;
    private Boolean isValidEmail = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Map properties in .xml file
        setupUI();
        setupActions();
    }

    @Override
    public void setupUI() {

        txtEmail = findViewById(R.id.txtEmail);
        txtErrorEmail = findViewById(R.id.txtErrorEmail);
        txtPassword= findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);

    }

    @Override
    public void setupActions() {
//        btnLogin.setOnClickListener((View view)-> {
//            // Log.d(TAG_MAIN_ACTIVITY,"Hello");
//            Toast.makeText(this, "Bam vao login", Toast.LENGTH_SHORT).show();
//
//            });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User foundUser =  new Database(MainActivity.this).getLoginUser();
                if(MainActivity.this.isValidEmail && foundUser != null){

                }else{
                    new Database(MainActivity.this).insertUser(
                            txtEmail.getText().toString(),
                            "1234567aa",
                            "aa12bb"
                    );
                }
                //navigate
                Intent intent = new Intent(MainActivity.this,BooksActivity.class);
                intent.putExtra("x",10);
                intent.putExtra("y","Hoang");
                MainActivity.this.startActivity(intent);
            }
        });

        txtEmail.addTextChangedListener(new TextWatcher() {
            //validate kieu realtime
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String email = charSequence.toString();
                isValidEmail = Validations.isValidEmail(email);
                txtErrorEmail.setText(isValidEmail == false  && !email.isEmpty() ? "Invalid email address":"");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}