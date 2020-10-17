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

public class TraSua extends AppCompatActivity {
    Button home,video,music,photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trasua);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Trà Sữa");
        String title = actionBar.getTitle().toString();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        home = (Button) findViewById(R.id.button_home);
        video = (Button) findViewById(R.id.button_video);
        music = (Button) findViewById(R.id.button_music);
        photo = (Button) findViewById(R.id.button_photo);

        //Gridview
        List<Tra> item_tra = getListData();
        final GridView gridView = (GridView) findViewById(R.id.grid_tra);
        gridView.setAdapter(new TraAdapter(this, item_tra));

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
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_photo();
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
    void activity_photo(){
        Intent intent=new Intent(this,Photo.class);
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
    private  List<Tra> getListData() {
        List<Tra> list = new ArrayList<Tra>();
        Tra tra1 = new Tra(R.drawable.tra1,"Cà phê sữa tươi trân châu đường đen");
        Tra tra2 = new Tra(R.drawable.tra2,"Sữa chua trân châu đường đen");
        Tra tra3 = new Tra(R.drawable.tra3,"Trà xanh lúa mạch sữa");
        Tra tra4 = new Tra(R.drawable.tra4,"Yogurt Đậu Đỏ");
        Tra tra5 = new Tra(R.drawable.tra5,"Trà Xanh Mơ Đào");
        Tra tra6 = new Tra(R.drawable.tra6,"Yogurt Khoai Môn");
        Tra tra7 = new Tra(R.drawable.tra7,"Mơ Đào Đá Xay");


        list.add(tra1);
        list.add(tra2);
        list.add(tra3);
        list.add(tra4);
        list.add(tra5);
        list.add(tra6);
        list.add(tra7);

        return list;
    }
}
