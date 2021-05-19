package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textOutput;
    Button deleteCharacter, deleteEverything, multiply, toSplit, fold, subtract, percent, smooth, point;
    Button one, two, three, four, five, six, seven, eight, nine, zero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.one:
                        textOutput.setText("1");
                        break;
                    case R.id.two:
                        textOutput.setText("2");
                        break;
                    case R.id.three:
                        textOutput.setText("3");
                        break;
                    case R.id.four:
                        textOutput.setText("4");
                        break;
                    case R.id.five:
                        textOutput.setText("5");
                        break;
                    case R.id.six:
                        textOutput.setText("6");
                        break;
                    case R.id.seven:
                        textOutput.setText("7");
                        break;
                    case R.id.eight:
                        textOutput.setText("8");
                        break;
                    case R.id.nine:
                        textOutput.setText("9");
                        break;
                    case R.id.zero:
                        textOutput.setText("0");
                        break;
                }
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
    }
}