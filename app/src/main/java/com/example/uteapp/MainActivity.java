package com.example.uteapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button login;
    TextView dk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide(); //Ẩn ActionBar
        login=(Button) findViewById(R.id.dangnhap);
        dk=(TextView) findViewById(R.id.text_dangky);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                function_dn();
            }
        });
        dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                function_dk();
            }
        });


    }
    void function_dk(){
        Intent intent=new Intent(this,DangKy.class);
        this.startActivity(intent);
    }
    void function_dn(){
        Intent intent=new Intent(this,Home.class);
        this.startActivity(intent);
    }
}