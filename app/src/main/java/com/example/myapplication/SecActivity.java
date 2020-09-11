package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView text,email,pass;
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        Person person = (Person)getIntent().getSerializableExtra("Person");
        text = findViewById(R.id.text);
        email = findViewById(R.id.tvemail);
        pass = findViewById(R.id.tvpass);
        back = findViewById(R.id.back);
        text.setText(person.getName());
        email.setText(person.getEmail());
        pass.setText(person.getPassword());
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (back == view){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }
}