package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;



public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView name = findViewById(R.id.name);
        TextView age = findViewById(R.id.age);
        TextView job = findViewById(R.id.job);
        TextView num = findViewById(R.id.number);
        TextView email = findViewById(R.id.mail);

        Bundle bundle = getIntent().getExtras();

        String Name = bundle.getString("data");
        int Age = bundle.getInt("data2");
        String Job = bundle.getString("data3");
        int Num = bundle.getInt("data4");
        String Email = bundle.getString("data5");

        name.setText(Name);
        age.setText(Age+"");
        job.setText(Job);
        num.setText(Num+"");
        email.setText(Email);



    }
}