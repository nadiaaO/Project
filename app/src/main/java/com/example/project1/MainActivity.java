package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnmasuk, btntodaftar;
    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmasuk = findViewById(R.id.bt_masuk);
        btntodaftar = findViewById(R.id.bt_todaftar);
        email = findViewById(R.id.login_email);
        password = findViewById(R.id.login_password);

        btntodaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void postLogin(View view) {
                // Validasi input email dan password kosong
                if(TextUtils.isEmpty(email.getText().toString().trim()) &&
                        TextUtils.isEmpty(password.getText().toString().trim())) {
                    Toast.makeText(view.getContext(), "Email dan Password tidak boleh kosong!",
                            Toast.LENGTH_LONG).show();
                }
                else if(TextUtils.isEmpty(email.getText().toString().trim())) {
                    Toast.makeText(view.getContext(), "Email tidak boleh kosong!", Toast.LENGTH_LONG).show();
                }
                else if(TextUtils.isEmpty(password.getText().toString()) {
                    Toast.makeText(view.getContext(), "Password tidak boleh kosong!", Toast.LENGTH_LONG).show();
                }else {
                    Intent i = new Intent(MainActivity.this, Register.class);
                    startActivity(i);
                }
            }
        });





    }
}