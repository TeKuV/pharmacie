package com.mapharmacie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SigninActivity  extends AppCompatActivity {
    private Button signup_btn, button_forgot_password, button_signin;
    private EditText et_username, et_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        signup_btn = findViewById(R.id.signup_btn);
        button_forgot_password = findViewById(R.id.button_forgot_password);
        button_signin = findViewById(R.id.button_signin);


        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SigninActivity.this,  SignupActivity.class);
                startActivity(intent);
            }
        });
        button_forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SigninActivity.this,  ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });
        button_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_username = findViewById(R.id.et_username);
                et_password = findViewById(R.id.et_password);

                if (et_username.getText().equals("")){
                    Toast.makeText(SigninActivity.this, "Veuillez inserer votre nom d'utilisateur", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (et_password.getText().equals("")){
                    Toast.makeText(SigninActivity.this, "Veuillez inserer votre mot de passe", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(SigninActivity.this, "connecté", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SigninActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
