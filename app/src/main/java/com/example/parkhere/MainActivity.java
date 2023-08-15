package com.example.parkhere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//variables
    Button button_admin, button_guard, about_us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_admin=findViewById(R.id.button_admin);
        button_guard=findViewById(R.id.button_guard);
        about_us=findViewById(R.id.about_us);

        button_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, admin_login.class);
                startActivity(intent);
            }
        });
        button_guard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, guard_login.class);
                startActivity(intent);
            }
        });
        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, AboutUs.class);
                startActivity(intent);
            }
        });



    }
}