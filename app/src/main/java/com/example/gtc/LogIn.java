package com.example.gtc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.paswword);
        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {  Toast.makeText(LogIn.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                ;
            }else
                    Toast.makeText(LogIn.this, "Login Unsuccessfull", Toast.LENGTH_SHORT).show();


            }
        });
    }
}