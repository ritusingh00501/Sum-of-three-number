package com.example.sumofthreenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText T1 = (EditText) findViewById(R.id.num1);
        EditText T2=(EditText) findViewById(R.id.num2);
        EditText T3=(EditText) findViewById(R.id.num3);
        TextView Result = (TextView) findViewById(R.id.textView2);
        Button B1 = (Button) findViewById(R.id.btn);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum, num1, num2, num3;
                num1 = Integer.parseInt(T1.getText().toString().trim());
                num2 = Integer.parseInt(T2.getText().toString().trim());
                num3 = Integer.parseInt(T3.getText().toString().trim());
                sum = num1 + num2 + num3;

                Result.setText("Sum of " + num1 + " and " + num2 + " and " + num3 + " is " + sum);
                Toast.makeText(MainActivity.this, "Sum of three number is" + sum, Toast.LENGTH_SHORT).show();
            }
        });
    }
}