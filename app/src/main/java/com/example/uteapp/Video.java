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

public class Video extends AppCompatActivity {
    Button home,photo,music,tra;
    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videos);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Thư Viện Video");
        String title = actionBar.getTitle().toString();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        home = (Button) findViewById(R.id.button_home);
        photo = (Button) findViewById(R.id.button_photo);
        music = (Button) findViewById(R.id.button_music);
        tra = (Button) findViewById(R.id.button_trasua);

        //Listview
        lv = (ListView) findViewById(R.id.list_post);
        arr_bean=new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.mulan, "Hoa Mộc Lan (2020)","Mulan (2020) được chuyển thể từ phim hoạt hình cùng tên của Disney ra mắt năm 1998. Bộ phim kể về Mộc Lan – một cô gái hiếu thảo đã giả trai, thay cha tuổi già sức yếu tòng quân ra trận"));
        arr_bean.add(new ListViewBean(R.drawable.phivu, "Phi Vụ Triệu Đô","Tám tên cướp khống chế các con tin trong Xưởng in tiền Hoàng gia Tây Ban Nha trong khi kẻ chủ mưu thao túng cảnh sát để thực hiện kế hoạch của hắn"));
        arr_bean.add(new ListViewBean(R.drawable.bangai,"Bạn Gái Dưới Lầu Xin Ký Nhận (2020) ","CEO của công ty An Ninh Văn Hóa - Diệp Phi Mặc bỗng dưng bị bệnh mà biến mất khỏi tầm mắt khán giả khiến mọi người đoán An Ninh Văn Hóa đang gặp khủng hoảng"));
        arr_bean.add(new ListViewBean(R.drawable.sontung, "Sơn Tùng M-TP: Sky Tour Movie (2020)","Hé lộ khâu chuẩn bị cho các buổi biểu diễn, bộ phim tài liệu giới thiệu về thần tượng nhạc pop Việt Nam Sơn Tùng M-TP và đam mê ẩn sau chuyến lưu diễn Sky Tour của anh"));
        arr_bean.add(new ListViewBean(R.drawable.chi, "Chị Chị Em Em (2020) ","Sự kết hợp chưa từng có giữa Thanh Hằng và Chi Pu cùng câu chuyện ly kỳ về yêu - hận - tình - thù đằng sau hai người phụ nữ xinh đẹp chắc chắn sẽ khiến bạn tò mò."));
        arr_bean.add(new ListViewBean(R.drawable.doimat, "Đôi Mắt Âm Dương (2020)","/Phim sẽ theo chân Trang, nữ nhiếp ảnh gia nổi tiếng trên hành trình tìm lại ký ức đã mất sau một vụ tai nạn giao thông rồi bị đeo bám bởi một người phụ nữ bí ẩn với đôi mắt đầy máu."));
        arr_bean.add(new ListViewBean(R.drawable.thienmenh, "Thiên mệnh anh hùng (2012)","Thiên mệnh anh hùng (tựa tiếng Anh: Blood Letter hoặc Sword of the Assassin) là một bộ phim điện ảnh Việt Nam do đạo diễn Việt kiều Victor Vũ thực hiện. Phim có sự tham gia của Huỳnh Đông, Midu, Vân Trang, Khương Ngọc, Kim Hiền và Minh Thuận."));
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
    void activity_photo(){
        Intent intent=new Intent(this,Photo.class);
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
}
