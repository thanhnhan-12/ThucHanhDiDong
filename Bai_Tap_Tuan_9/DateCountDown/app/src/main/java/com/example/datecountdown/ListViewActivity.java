package com.example.datecountdown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
public class ListViewActivity extends AppCompatActivity {
    ImageView iconAdd;
    ListView lvEvent;
    ArrayList<Event> listEvent;
    EventAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        AnhXa();
        adapter = new EventAdapter(this,R.layout.item_event, listEvent);
        lvEvent.setAdapter(adapter);
        iconAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListViewActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    //Hàm xóa
    public void Xoa(final int position){
        listEvent.remove(position);
        adapter.notifyDataSetChanged();
    }
    private void AnhXa() {

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        iconAdd = findViewById(R.id.IconAdd);
        listEvent = new ArrayList<>();
        Event ev = (Event) bundle.getSerializable("objectEvent");

        lvEvent = findViewById(R.id.lvEvent);
        listEvent.add(ev);
    }
}