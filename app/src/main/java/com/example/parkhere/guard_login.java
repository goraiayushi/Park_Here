package com.example.parkhere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class guard_login extends AppCompatActivity {
//variable
    Button signup_guard,g_login;
    TextInputLayout systemid, guardid,g_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guard_login);

        signup_guard = findViewById(R.id.signup_guard);
        g_login = findViewById(R.id.g_login);
        systemid = findViewById(R.id.systemid);
        guardid= findViewById(R.id.guardid);
        g_password = findViewById(R.id.g_password);


        signup_guard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(guard_login.this, signup_guard.class);
                startActivity(intent);
            }
        });

        g_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String systemid_=systemid.getEditText().getText().toString();
                String guardid_=systemid.getEditText().getText().toString();
                String g_password=systemid.getEditText().getText().toString();

                Intent intent=new Intent(guard_login.this, guard.class);
                startActivity(intent);
                finish();
            }
        });
    }
}