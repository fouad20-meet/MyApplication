package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    private EditText name,pass,email;
    private Button login,clear;
    private CheckBox check;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.etName);
        pass = findViewById(R.id.etPassword);
        email = findViewById(R.id.etEmail);
        login = findViewById(R.id.login);
        login.setOnClickListener(this);
        clear = findViewById(R.id.clear);
        check = findViewById(R.id.savedetails);
        clear.setOnLongClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (login == view) {
            if (name.getText().toString().equals("") && pass.getText().toString().equals("") && email.getText().toString().equals(""))
                Toast.makeText(this,"Error! Empty Fields", Toast.LENGTH_LONG).show();
            else {
                if (email.getText().toString().contains("@") && email.getText().toString().contains(".com")) {
                    Intent intent = new Intent(this, SecActivity.class);
                    Person person = new Person(name.getText().toString(), email.getText().toString(), pass.getText().toString(), 1, check.isChecked());
                    intent.putExtra("Person", person);
                    startActivity(intent);
                }
                else
                    Toast.makeText(this,"Not a Viable Email!",Toast.LENGTH_LONG).show();
            }
        }
    }
    @Override
    public boolean onLongClick(View view) {
        if(view == clear){
            name.setText("");
            email.setText("");
            pass.setText("");
        }
        return true;
    }
}