package com.example.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        Result = (TextView) findViewById(R.id.Result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập số", Toast.LENGTH_SHORT).show();
                }
                else {
                    if(Integer.parseInt(editText.getText().toString()) < 2) {
                        Result.setText("Không phải số nguyên tố");
                    }
                    else {
                        int count;
                        count = 0;
                        for(int i = 2; i <= Math.sqrt(Integer.parseInt(editText.getText().toString())); i++) {
                            if(i % 2 == 0) {
                                count++;
                            }
                        }
                        if(count == 0) {
                            Result.setText(editText.getText().toString() + " là số nguyên tố");
                        }
                        else {
                            Result.setText(editText.getText().toString() + " không phải là số nguyên tố");
                        }
                    }
                }
            }
        });

    }
}