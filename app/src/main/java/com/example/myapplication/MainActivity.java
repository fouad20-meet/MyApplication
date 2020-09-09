package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button b0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button bc;
    private Button bequ;
    private Button bplu;
    private Button bmin;
    private Button bdiv;
    private Button bmul;
    private EditText text;
    private int num1;
    private int num2;
    private boolean plus;
    boolean minus;
    private boolean multi;
    private boolean divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bc = findViewById(R.id.bc);
        bequ = findViewById(R.id.bequ);
        bplu = findViewById(R.id.bplu);
        bmin = findViewById(R.id.bmin);
        bdiv = findViewById(R.id.bdiv);
        bmul = findViewById(R.id.bmul);
        text = findViewById(R.id.text);
        plus = false;
        minus = false;
        multi = false;
        divide = false;
hgshd
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "9");
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(null);
            }
        });

        bplu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text != null){
                    num1 = Integer.parseInt(text.getText().toString());
                    plus = true;
                    text.setText(null);
                }
            }
        });

        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text != null){
                    num1 = Integer.parseInt(text.getText().toString());
                    minus = true;
                    text.setText(null);
                }
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text != null){
                    num1 = Integer.parseInt(text.getText().toString());
                    multi = true;
                    text.setText(null);
                }
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text != null){
                    num1 = Integer.parseInt(text.getText().toString());
                    divide = true;
                    text.setText(null);
                }
            }
        });

        bequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text != null){
                    num2 = Integer.parseInt(text.getText().toString());
                    if (plus){
                        text.setText(""+(num1+num2));
                        plus = false;
                    }
                    if (minus){
                        text.setText(""+(num1-num2));
                        minus = false;
                    }
                    if (multi){
                        text.setText(""+(num1*num2));
                        multi = false;
                    }
                    if (divide){
                        text.setText(""+(num1/num2));
                        divide = false;
                    }
                }
            }
        });

    }
}