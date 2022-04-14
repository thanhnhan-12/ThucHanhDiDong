package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class listview extends AppCompatActivity {
    Button BtnListView;
    private ListView lv;
    private String number[] = {"161250533502","161250533405","151250533308","161250533207","151250533113","131250532378"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        BtnListView = (Button) findViewById(R.id.btnListView);
        lv = (ListView) findViewById(R.id.lvMaSinhVien);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, number);
        lv.setAdapter(adapter);

        BtnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentListView = new Intent(listview.this, MainActivity.class);
                    startActivity(intentListView);
            }
        });
    }
}