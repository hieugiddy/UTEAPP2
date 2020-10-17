package com.example.uteapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Home extends AppCompatActivity {
    CardView photos,videos,musics,traSua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Profile");
        String title = actionBar.getTitle().toString();
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        photos=(CardView) findViewById(R.id.card_photos);
        videos=(CardView) findViewById(R.id.card_videos);
        musics=(CardView) findViewById(R.id.card_musics);
        traSua=(CardView) findViewById(R.id.card_trasua);
        photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_photos();
            }
        });
        videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_videos();
            }
        });
        musics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_musics();
            }
        });
        traSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_traSua();
            }
        });
    }
    void activity_photos(){
        Intent intent=new Intent(this,Photo.class);
        this.startActivity(intent);
    }
    void activity_videos(){
        Intent intent=new Intent(this,Video.class);
        this.startActivity(intent);
    }
    void activity_musics(){
        Intent intent=new Intent(this,Music.class);
        this.startActivity(intent);
    }
    void activity_traSua(){
        Intent intent=new Intent(this,TraSua.class);
        this.startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.logout:
                activity_home();
                return true;

            default:break;
        }

        return super.onOptionsItemSelected(item);
    }
    void activity_home(){
        Intent intent=new Intent(this,MainActivity.class);
        this.startActivity(intent);
    }
}
