package com.example.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;
    TextView textViewKQ;
    Button buttonCong,buttonTru,buttonNhan,buttonChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        textViewKQ = (TextView) findViewById(R.id.textViewKQ);
        buttonTru = (Button) findViewById(R.id.buttonTru);
        buttonNhan = (Button) findViewById(R.id.buttonNhan);
        buttonChia = (Button) findViewById(R.id.buttonChia);
        buttonCong = (Button) findViewById(R.id.buttonCong);

        buttonCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1.getText().toString().length()==0 || editText2.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this, "Vui long nhap ca hai so", Toast.LENGTH_SHORT).show();
                }
                else {
                    int result = Integer.parseInt(editText1.getText().toString()) + Integer.parseInt(editText2.getText().toString());
                    textViewKQ.setText(String.valueOf(result));}
            }
        });
        buttonTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1.getText().toString().length()==0 || editText2.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this, "Vui long nhap ca hai so", Toast.LENGTH_SHORT).show();//o dia day
                }
                else {
                    int result = Integer.parseInt(editText1.getText().toString()) - Integer.parseInt(editText2.getText().toString());
                    textViewKQ.setText(String.valueOf(result));}
            }
        });
        buttonNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1.getText().toString().length()==0 || editText2.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this, "Vui long nhap ca hai so", Toast.LENGTH_SHORT).show();
                }
                else {
                    int result = Integer.parseInt(editText1.getText().toString()) * Integer.parseInt(editText2.getText().toString());
                    textViewKQ.setText(String.valueOf(result));}
            }
        });
        buttonChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1.getText().toString().length()==0 || editText2.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this, "Vui long nhap ca hai so", Toast.LENGTH_SHORT).show();
                }
                else {
                    if(Integer.parseInt(editText2.getText().toString())==0){
                        Toast.makeText(MainActivity.this, "Vui long nhap so thu hai khac khong", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        double result = Double.parseDouble(editText1.getText().toString()) / Double.parseDouble(editText2.getText().toString());
                        textViewKQ.setText(String.valueOf(result));
                    }
                }
            }
        });
    }
}