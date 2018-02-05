package com.example.android.quizzapp2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.android.quizzapp2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkResults(View view) {

        //What is the user name/
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        //Read out the buttons, boxes, edittexts
        CheckBox Q2_1 = (CheckBox) findViewById(R.id.notify_me_checkbox1);
        boolean Q2_1r = Q2_1.isChecked();
        CheckBox Q2_2 = (CheckBox) findViewById(R.id.notify_me_checkbox2);
        boolean Q2_2r = Q2_2.isChecked();
        CheckBox Q2_3 = (CheckBox) findViewById(R.id.notify_me_checkbox3);
        boolean Q2_3r = Q2_3.isChecked();
        CheckBox Q2_4 = (CheckBox) findViewById(R.id.notify_me_checkbox4);
        boolean Q2_4r = Q2_4.isChecked();

        RadioButton Q1_1 = (RadioButton) findViewById(R.id.yes_radio_button_1);
        boolean Q1_1r = Q1_1.isChecked();
        RadioButton Q1_2 = (RadioButton) findViewById(R.id.no_radio_button_1);
        boolean Q1_2r = Q1_2.isChecked();
        RadioButton Q3_1 = (RadioButton) findViewById(R.id.yes_radio_button_2);
        boolean Q3_1r = Q3_1.isChecked();
        RadioButton Q3_2 = (RadioButton) findViewById(R.id.no_radio_button_2);
        boolean Q3_2r = Q3_2.isChecked();
        RadioButton Q4_1 = (RadioButton) findViewById(R.id.yes_radio_button_3);
        boolean Q4_1r = Q4_1.isChecked();
        RadioButton Q4_2 = (RadioButton) findViewById(R.id.no_radio_button_3);
        boolean Q4_2r = Q4_2.isChecked();
        RadioButton Q5_1 = (RadioButton) findViewById(R.id.yes_radio_button_4);
        boolean Q5_1r = Q5_1.isChecked();
        RadioButton Q5_2 = (RadioButton) findViewById(R.id.no_radio_button_4);
        boolean Q5_2r = Q5_2.isChecked();

        int score = 0;

        if(Q1_1r == true){
            score = score + 1;
        }
        if(Q3_2r == true){
            score = score + 1;
        }
        if(Q4_1r == true){
            score = score + 1;
        }
        if(Q5_1r == true){
            score = score + 1;
        }
        if(Q2_1r == true && Q2_3r == true){
            score = score + 1;
        }


        Toast.makeText(MainActivity.this, name + " your score is: " + score + "/5", Toast.LENGTH_LONG).show();
    }




}
