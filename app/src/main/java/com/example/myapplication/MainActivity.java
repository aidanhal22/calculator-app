package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        int num1, num2, sum;

        if (number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            num1 = 0;
            num2 = 0;
        }else{
            num1 = Integer.parseInt((number1ET.getText().toString()));
            num2 = Integer.parseInt((number2ET.getText().toString()));
            sum = num1 + num2;
            numberSumTV.setText("" + sum);
        }
    }
    public void findDiff(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        int num1, num2, diff;

        if (number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            num1 = 0;
            num2 = 0;
        }else{
            num1 = Integer.parseInt((number1ET.getText().toString()));
            num2 = Integer.parseInt((number2ET.getText().toString()));
            diff = num1 - num2;
            numberSumTV.setText("" + diff);
        }
    }
    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        int num1, num2, product;

        if (number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            num1 = 0;
            num2 = 0;
        }else{
            num1 = Integer.parseInt((number1ET.getText().toString()));
            num2 = Integer.parseInt((number2ET.getText().toString()));
            product = num1 * num2;
            numberSumTV.setText("" + product);
        }
    }
    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        int num1, num2, quotient;

        if (number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            num1 = 0;
            num2 = 0;
        }else{
            num1 = Integer.parseInt((number1ET.getText().toString()));
            num2 = Integer.parseInt((number2ET.getText().toString()));
            quotient = num1 / num2;
            numberSumTV.setText("" + quotient);
        }
    }
    public void findRemainder(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
       int num1, num2, remainder;

        if (number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            num1 = 0;
            num2 = 0;
        }else{
            num1 = Integer.parseInt((number1ET.getText().toString()));
            num2 = Integer.parseInt((number2ET.getText().toString()));
            remainder = num1 % num2;
            numberSumTV.setText("" + remainder);
        }

    }


}
