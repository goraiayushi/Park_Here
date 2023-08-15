package com.example.parkhere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup_Admin extends AppCompatActivity {
    //variable
    Button login_admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_admin);

        login_admin=findViewById(R.id.login_admin);
        login_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Signup_Admin.this, admin_login.class);
                startActivity(intent);
            }
        });


    }
}