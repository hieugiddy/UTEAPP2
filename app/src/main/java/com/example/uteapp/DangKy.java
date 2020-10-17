package com.example.uteapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DangKy extends AppCompatActivity {
    TextView dn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangky);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Đăng ký tài khoản");
        String title = actionBar.getTitle().toString();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        dn=(TextView) findViewById(R.id.text_dangnhap);
        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                function_dangnhap();
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:break;
        }

        return super.onOptionsItemSelected(item);
    }

    void function_dangnhap(){
        Intent intent=new Intent(this,MainActivity.class);
        this.startActivity(intent);
    }
}
