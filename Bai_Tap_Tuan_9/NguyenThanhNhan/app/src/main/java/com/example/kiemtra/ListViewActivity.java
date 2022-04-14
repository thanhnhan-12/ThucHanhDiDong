package com.example.kiemtra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    ImageView iconAdd;
    ListView lvEvent;
    ArrayList<Event> listEvent;
    DescriptionAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        AnhXa();
        adapter = new DescriptionAdapter(this,R.layout.item_day, listEvent);
        lvEvent.setAdapter(adapter);
        iconAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListViewActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void Xoa(final int position){
        listEvent.remove(position);
        adapter.notifyDataSetChanged();
    }
    private void AnhXa() {
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        iconAdd = findViewById(R.id.Add);
        listEvent = new ArrayList<>();
        Event ev = (Event) bundle.getSerializable("objectEvent");
        lvEvent = findViewById(R.id.lvEvent);
        listEvent.add(ev);
    }
}