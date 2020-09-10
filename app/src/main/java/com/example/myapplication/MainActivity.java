package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText first,last;
     Button enter;
     Person person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = findViewById(R.id.first);
        last = findViewById(R.id.last);
        enter = findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!first.getText().toString().equals("") && !last.getText().toString().equals(""))
                    MainActivity.this.person = new Person(first.getText().toString(),last.getText().toString());
                else
                    MainActivity.this.person = new Person("Error","");
                Intent intent = new Intent(getApplicationContext(),SecActivity.class);
                intent.putExtra("Person", person);
                startActivity(intent);
            }
        });
    }
}