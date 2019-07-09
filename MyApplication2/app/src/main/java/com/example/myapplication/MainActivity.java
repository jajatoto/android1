package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private ImageView ivEgg;
    private Button btnStart;

    private Random random;


    private int targetCount;
    private int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivEgg = (ImageView)findViewById(R.id.ivEgg);
        btnStart = (Button)findViewById(R.id.btnStart);


        ivEgg.setImageResource(R.drawable.egg);


        random = new Random();

        targetCount = random.nextInt(50)+1;

        ivEgg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(count>targetCount){
                    btnStart.setText("게임 재시작하기");
                    ivEgg.setImageResource(R.drawable.break_egg);
                    btnStart.setEnabled(true);
                }
                else{
                    count++;
                    btnStart.setEnabled(false);
                    btnStart.setText("남은 횟수 : "+(targetCount-count+1));
                }
            }
        });

        btnStart.setOnClickListener(new
                View.OnClickListener(){
            @Override
                    public void onClick(View v){
                btnStart.setText("남은 횟수 : "+(targetCount-count+1));
                count = 0;
                ivEgg.setImageResource(R.drawable.egg);
            }
                });


    }
}
