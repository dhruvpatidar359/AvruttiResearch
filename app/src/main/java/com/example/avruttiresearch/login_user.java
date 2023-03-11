package com.example.avruttiresearch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.security.auth.login.LoginException;

public class login_user extends AppCompatActivity {
CardView cardUser;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

        cardUser = findViewById(R.id.carduser);
        button = findViewById(R.id.elevatedButton);

        cardUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),SignUp.class);
                startActivity(i);

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new  Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}