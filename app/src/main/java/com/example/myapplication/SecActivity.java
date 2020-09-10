package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        Person person = (Person)getIntent().getSerializableExtra("Person");
        text = findViewById(R.id.text);
        text.setText(person.getFirst() +" " + person.getLast());
    }
}