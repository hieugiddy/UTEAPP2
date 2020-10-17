package com.example.uteapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Music extends AppCompatActivity {
    Button home,photo,video,tra;
    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musics);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Bảng Xếp Hạng Âm Nhạc");
        String title = actionBar.getTitle().toString();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        home = (Button) findViewById(R.id.button_home);
        photo = (Button) findViewById(R.id.button_photo);
        video = (Button) findViewById(R.id.button_video);
        tra = (Button) findViewById(R.id.button_trasua);

        //Listview
        lv = (ListView) findViewById(R.id.list_music);
        arr_bean=new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.ic_music, "Hoa Hải Đường","Jack"));
        arr_bean.add(new ListViewBean(R.drawable.ic_music, "Anh Mệt Rồi","Anh Quân Idol"));
        arr_bean.add(new ListViewBean(R.drawable.ic_music,"Thiên Đàng","Wowy, JoliPoli"));
        arr_bean.add(new ListViewBean(R.drawable.ic_music, "Bông Hoa Đẹp Nhất","Quân A.P"));
        arr_bean.add(new ListViewBean(R.drawable.ic_music, "Đánh Mất Em","Quang Đăng Trần"));
        arr_bean.add(new ListViewBean(R.drawable.ic_music, "Ai Mang Cô Đơn Đi","K-ICM, APJ"));
        arr_bean.add(new ListViewBean(R.drawable.ic_music, "Em Bé","AMEE, Karik"));
        adapter=new ListViewBaseAdapter(arr_bean,this);
        lv.setAdapter(adapter);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_home();
            }
        });
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_photo();
            }
        });
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_video();
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
    void activity_photo(){
        Intent intent=new Intent(this,Photo.class);
        this.startActivity(intent);
    }
    void activity_video(){
        Intent intent=new Intent(this,Video.class);
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
}
