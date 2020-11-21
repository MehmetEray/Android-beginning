package com.example.classact5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextTextPersonName;
    RadioButton radioButton;
    RadioButton radioButton2;
    RadioButton radioButton3;
    Switch switch1;
    CheckBox checkBox;
    TextView tvResult;
    int result;
    boolean isCheckedS = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        switch1 = findViewById(R.id.switch1);
        checkBox = findViewById(R.id.checkBox);
        tvResult = findViewById(R.id.tvResult);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                isCheckedS = isChecked;
            }
        });
    }

    public void okbutton(View view) {
        int day_num = Integer.parseInt(editTextTextPersonName.getText().toString());
        int car_price;
        if (radioButton.isChecked()){
            car_price = 100;
        }
        else if(radioButton2.isChecked()){
            car_price = 500;
        }
        else{
            car_price = 1000;
        }
        int auto;
        if (switch1.isChecked()){
            auto = 2;
        }else {
            auto = 1;
        }
        int driver;
        if (checkBox.isChecked()){
            driver = 2;
        }else {
            driver = 1;
        }

        result = day_num * driver * auto * car_price;
        tvResult.setText(String.valueOf(result));

    }
}