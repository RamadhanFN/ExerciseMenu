package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ednama, edpass;
    Button btekan;
    String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent in = getIntent();

        ednama = findViewById(R.id.editUN);
        edpass = findViewById(R.id.editPass);
        btekan = findViewById(R.id.btnok);
        btekan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Membaca input dari editText
                user = ednama.getText().toString();
                pass = edpass.getText().toString();

                //Menampilkan Pesan
                if (pass.equals("123") & user.equals("admin")){
                    Intent in = new Intent(MainActivity.this, MainHalaman_Utama.class);

                    startActivity(in);
                } else {
                    Toast.makeText(getApplicationContext(), "Password Salah",
                            Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}