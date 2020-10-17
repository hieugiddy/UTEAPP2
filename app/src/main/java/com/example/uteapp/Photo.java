package com.example.uteapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Photo extends AppCompatActivity {
    Button home,video,music,tra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photos);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Thư Viện Ảnh");
        String title = actionBar.getTitle().toString();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        home = (Button) findViewById(R.id.button_home);
        video = (Button) findViewById(R.id.button_video);
        music = (Button) findViewById(R.id.button_music);
        tra = (Button) findViewById(R.id.button_trasua);

        //Gridview
        List<Anh> image_details = getListData();
        final GridView gridView = (GridView) findViewById(R.id.grid_photo);
        gridView.setAdapter(new CustomGridAdapter(this, image_details));

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_home();
            }
        });
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_videos();
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_musics();
            }
        });
        tra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_traSua();
            }
        });
    }
    void activity_home(){
        Intent intent=new Intent(this,Home.class);
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
    private  List<Anh> getListData() {
        List<Anh> list = new ArrayList<Anh>();
        Anh vietnam = new Anh(R.drawable.girl1);
        Anh usa = new Anh(R.drawable.girl2);
        Anh russia = new Anh(R.drawable.girl3);
        Anh australia = new Anh(R.drawable.girl4);
        Anh japan = new Anh(R.drawable.girl5);
        Anh japan1 = new Anh(R.drawable.girl6);
        Anh japan2 = new Anh(R.drawable.girl7);
        Anh japan3 = new Anh(R.drawable.girl8);
        Anh japan4 = new Anh(R.drawable.girl9);
        Anh japan5 = new Anh(R.drawable.girl10);
        Anh japan6 = new Anh(R.drawable.girl11);
        Anh japan7 = new Anh(R.drawable.girl12);
        Anh japan8 = new Anh(R.drawable.girl13);
        Anh japan9 = new Anh(R.drawable.girl14);
        Anh japan10 = new Anh(R.drawable.girl15);
        Anh japan11 = new Anh(R.drawable.girl16);
        Anh japan12 = new Anh(R.drawable.girl17);
        Anh japan13 = new Anh(R.drawable.girl18);

        list.add(vietnam);
        list.add(usa);
        list.add(russia);
        list.add(australia);
        list.add(japan);
        list.add(japan1);
        list.add(japan2);
        list.add(japan3);
        list.add(japan4);
        list.add(japan5);
        list.add(japan6);
        list.add(japan7);
        list.add(japan8);
        list.add(japan9);
        list.add(japan10);
        list.add(japan11);
        list.add(japan12);
        list.add(japan13);

        return list;
    }
}
