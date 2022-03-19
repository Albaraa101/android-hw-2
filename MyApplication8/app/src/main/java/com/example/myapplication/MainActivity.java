package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.myname);
        EditText age = findViewById(R.id.myage);
        EditText job = findViewById(R.id.myjob);
        EditText num = findViewById(R.id.mynumber);
        EditText email = findViewById(R.id.myemail);
        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String data = name.getText().toString();
                int data2 = Integer.parseInt(age.getText().toString());
                String data3 = job.getText().toString();
                int data4 = Integer.parseInt(num.getText().toString());
                String data5 = email.getText().toString();


                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("data", data);
                intent.putExtra("data2", data2);
                intent.putExtra("data3", data3);
                intent.putExtra("data4", data4);
                intent.putExtra("data5", data5);
                startActivity(intent);
            }

            });

    }
}