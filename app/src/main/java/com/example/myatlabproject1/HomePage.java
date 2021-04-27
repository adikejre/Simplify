package com.example.myatlabproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class HomePage extends AppCompatActivity {
    private Button lgout;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        lgout=findViewById(R.id.logout);
        auth=FirebaseAuth.getInstance();
        lgout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth.signOut();
                Toast.makeText(HomePage.this, "Logged Out!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomePage.this,MainActivity.class));
            }
        });
    }
}