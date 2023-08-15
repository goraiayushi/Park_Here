package com.example.parkhere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup_guard extends AppCompatActivity {
//variables
    Button login_guard,g_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_guard);

        login_guard=findViewById(R.id.login_guard);
        g_signup=findViewById(R.id.g_signup);

        login_guard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(signup_guard.this, guard_login.class);
                startActivity(intent);
            }
        });
        g_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(signup_guard.this, guard_login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}