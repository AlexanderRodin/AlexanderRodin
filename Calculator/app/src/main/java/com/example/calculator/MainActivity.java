package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    StringBuilder newString = new StringBuilder();
    StringBuilder number = new StringBuilder();
    TextView textOutput;
    Button deleteCharacter, deleteEverything, multiply, toSplit, fold, subtract, percent, smooth, point;
    Button one, two, three, four, five, six, seven, eight, nine, zero;
    ToggleButton togBtn;


    ArrayList listNumber = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        togBtn = (ToggleButton) findViewById(R.id.action_toggle);
        textOutput = (TextView) findViewById(R.id.text_output);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        deleteCharacter = (Button) findViewById(R.id.delete_character);
        deleteEverything = (Button) findViewById(R.id.delete_everything);
        multiply = (Button) findViewById(R.id._multiply);
        toSplit = (Button) findViewById(R.id.to_split);
        fold = (Button) findViewById(R.id.fold);
        subtract = (Button) findViewById(R.id.subtract);
        percent = (Button) findViewById(R.id._percent);
        smooth = (Button) findViewById(R.id.smooth);
        point = (Button) findViewById(R.id.point);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.one:
                        addToString("1");
                        break;
                    case R.id.two:
                        addToString("2");
                        break;
                    case R.id.three:
                        addToString("3");
                        break;
                    case R.id.four:
                        addToString("4");
                        break;
                    case R.id.five:
                        addToString("5");
                        break;
                    case R.id.six:
                        addToString("6");
                        break;
                    case R.id.seven:
                        addToString("7");
                        break;
                    case R.id.eight:
                        addToString("8");
                        break;
                    case R.id.nine:
                        addToString("9");
                        break;
                    case R.id.zero:
                        addToString("0");
                        break;
                    case R.id.delete_character:
                        lastCharacter();
                        break;
                    case R.id.delete_everything:
                        deleteString();
                        break;
                    case R.id._multiply:
                        addToString("*");
                        break;
                    case R.id.to_split:
                        addToString("/");
                        break;
                    case R.id.fold:
                        addToString("+");

//                        addIndex();
                        break;
                    case R.id.subtract:
                        addToString("-");

                        break;
                    case R.id._percent:
//                        addToString("%");
                        break;
                    case R.id.smooth:
//                        addToString("=");
                        break;
                    case R.id.point:
//                        addToString(".");
                        break;

                }
            }
        };
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onPointerCaptureChanged(isChecked);
            }
        };

        one.setOnClickListener(onClickListener);
        two.setOnClickListener(onClickListener);
        three.setOnClickListener(onClickListener);
        four.setOnClickListener(onClickListener);
        five.setOnClickListener(onClickListener);
        six.setOnClickListener(onClickListener);
        seven.setOnClickListener(onClickListener);
        eight.setOnClickListener(onClickListener);
        nine.setOnClickListener(onClickListener);
        zero.setOnClickListener(onClickListener);
        deleteCharacter.setOnClickListener(onClickListener);
        deleteEverything.setOnClickListener(onClickListener);
        multiply.setOnClickListener(onClickListener);
        toSplit.setOnClickListener(onClickListener);
        fold.setOnClickListener(onClickListener);
        subtract.setOnClickListener(onClickListener);
        percent.setOnClickListener(onClickListener);
        smooth.setOnClickListener(onClickListener);
        point.setOnClickListener(onClickListener);
        togBtn.setOnCheckedChangeListener(onCheckedChangeListener);


    }

    // Отображение
    public void addToString(String s) {
        newString.append(s);
        textOutput.setText(newString);
    }

    public void addNum(int i) {
        number.append(i);
    }

    // Удаление
    public void deleteString() {
        newString.delete(0, newString.length());
        textOutput.setText(newString);
    }

    // Удаление всего
    public void lastCharacter() {
        newString.deleteCharAt(newString.length() - 1);
        textOutput.setText(newString);
    }


    @Override
    public void onPointerCaptureChanged(boolean isChecked) {
        if (isChecked) {
            this.finish();
            this.setTheme(R.style.AppThemeDark);
            this.startActivity(new Intent(this, this.getClass()));
        } else {
            this.finish();
            this.setTheme(R.style.AppThemeLight);
            this.startActivity(new Intent(this, this.getClass()));
        }
    }


}