package com.example.bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editTextWeight, editTextHeight;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        editTextWeight = (EditText) findViewById(R.id.editTextWeight);
        button = (Button) findViewById(R.id.button);
        Result = (TextView) findViewById(R.id.Result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextHeight.getText().toString().isEmpty() || editTextWeight.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đầy đủ các chỉ số", Toast.LENGTH_SHORT).show();
                }
                else {
                    double bmi;
                    if(Double.parseDouble(editTextHeight.getText().toString()) == 0) {
                        Toast.makeText(MainActivity.this, "Vui lòng nhập chiều cao", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        bmi = Double.parseDouble(editTextWeight.getText().toString()) / (Double.parseDouble(editTextHeight.getText().toString()) * Double.parseDouble(editTextHeight.getText().toString()));
                        if(bmi < 18) {
                            Result.setText("Người gầy");
                        }
                        else {
                            if(bmi < 24.9) {
                                Result.setText("Người bình thường");
                            }
                            else {
                                if(bmi < 29.9) {
                                    Result.setText("Người béo phì cấp độ I");
                                }
                                else {
                                    if(bmi < 34.9) {
                                        Result.setText("Người béo phì cấp độ II");
                                    }
                                    else {
                                        Result.setText("Người bép phì cấp độ III");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });
    }
}