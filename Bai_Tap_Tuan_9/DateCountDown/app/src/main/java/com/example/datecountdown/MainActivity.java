package com.example.datecountdown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.number.Scale;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    Button btnDate,btnAddEvent;
    TextView textDate;
    EditText textTitle,textEvent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        //Event set date
        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(),"date picker");
            }
        });
        //Event change page
        btnAddEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListViewActivity.class);
                Bundle bundle = new Bundle();
                Event event = new Event(String.valueOf(textTitle.getText()),String.valueOf(textEvent.getText()),String.valueOf(textDate.getText()));
                bundle.putSerializable("objectEvent",event);
                intent.putExtra("data",bundle);
                startActivity(intent);
            }
        });

    }

    private void AnhXa(){
        btnDate = findViewById(R.id.btnSetDate);
        textDate = findViewById(R.id.date);
        btnAddEvent = findViewById(R.id.btnAdd);

        textTitle = findViewById(R.id.edtTitle);
        textEvent = findViewById(R.id.edtEvent);
    }
    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,year);
        c.set(Calendar.MONTH,month);
        c.set(Calendar.DAY_OF_MONTH,day);
        String curentDateString = DateFormat.getDateInstance(DateFormat.FULL). format(c.getTime());
        textDate.setText(curentDateString);
    }


}

