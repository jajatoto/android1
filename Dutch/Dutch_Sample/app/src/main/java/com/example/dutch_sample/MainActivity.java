package com.example.dutch_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvShowResult;
    TextView tvDivide;

    EditText edtAmount;
    EditText edtMoney;

    Button btnResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShowResult = findViewById(R.id.tvShowResult);
        tvDivide = findViewById(R.id.tvDivide);

        edtAmount = findViewById(R.id.edtAmount);
        edtMoney = findViewById(R.id.edtMoney);

        btnResult = findViewById(R.id.btnResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int input1 = Integer.parseInt(edtMoney.getText().toString())/100;
                int input2 = Integer.parseInt(edtAmount.getText().toString());

                int result = input1/input2*100;
                int rest = input1%input2;

                if(rest==0) {
                    tvShowResult.setText(result+"원");
                }
                else{
                    tvShowResult.setText(result+"원");
                    tvDivide.setText("한명은 "+(result+rest*100)+"원 내야합니다^^");
                }

            }
        });

    }
}
