package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.graphics.Color;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {
    Button BtnListView2;
    private ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview2);
        lvContact = (ListView) findViewById(R.id.lvContact);
        BtnListView2 = (Button) findViewById(R.id.btnListView2);
        ArrayList<SinhVien> arrSinhVien = new ArrayList<>();

        SinhVien sinhVien1 = new SinhVien("Bùi Viết Hùng Anh","161250533502", Color.RED);
        SinhVien sinhVien2 = new SinhVien("Nguyễn Quốc Cường","161250533405", Color.GREEN);
        SinhVien sinhVien3 = new SinhVien("Nguyễn Khương Đào","151250533308", Color.GRAY);
        SinhVien sinhVien4 = new SinhVien("Vy Văn Đô","161250533207", Color.YELLOW);
        SinhVien sinhVien5 = new SinhVien("Phạm Nguyễn Hoài Duy","151250533113", Color.BLACK);
        SinhVien sinhVien6 = new SinhVien("Đỗ Thiên Giang","131250532378", Color.BLUE);
        SinhVien sinhVien7 = new SinhVien("Võ Hữu Hải","151250533116", Color.CYAN);

        arrSinhVien.add(sinhVien1);
        arrSinhVien.add(sinhVien2);
        arrSinhVien.add(sinhVien3);
        arrSinhVien.add(sinhVien4);
        arrSinhVien.add(sinhVien5);
        arrSinhVien.add(sinhVien6);
        arrSinhVien.add(sinhVien7);

        customListView customAdaper = new customListView(this,R.layout.activity_custom_list_view, arrSinhVien);
        lvContact.setAdapter(customAdaper);

        BtnListView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentListView2 = new Intent(ListviewActivity.this, MainActivity.class);
                    startActivity(intentListView2);
            }
        });
    }

}