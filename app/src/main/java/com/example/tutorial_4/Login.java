package com.example.tutorial_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText u1, p1;
    Button l1;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        u1 = findViewById(R.id.email);
        p1 = findViewById(R.id.pass);
        l1 = findViewById(R.id.lo1);


        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = u1.getText().toString().trim();
                String pass = p1.getText().toString().trim();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

                if (email.matches(emailPattern)) {
                    //next screen
                    if (email !="" || pass !="") {
                        Toast.makeText(Login.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this, welcome.class);
                        intent.putExtra("hello",email);
                        startActivity(intent);

                    } else {
                        Toast.makeText(Login.this, "Username or Password is incorrect", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(Login.this, "Email is not Proper", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}