package com.example.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;
/*
countdown timer is the classs used to implement countdown timer easily
 */
public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button b;
    CountDownTimer cdtimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=findViewById(R.id.textView);
        cdtimer=new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long l) {
            txt.setText("sec left"+ l/1000);
            }

            @Override
            public void onFinish() {
                txt.setText("done");
                Toast.makeText(MainActivity.this, "timer finished", Toast.LENGTH_SHORT).show();
            }
        };



        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "timer started", Toast.LENGTH_SHORT).show();
                cdtimer.start();
            }
        });




    }


}