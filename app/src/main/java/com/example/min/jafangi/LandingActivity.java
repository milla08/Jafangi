package com.example.min.jafangi;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        Handler handler = new Handler() {
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                //startActivity(intent);
                startActivity(new Intent(LandingActivity.this, MainActivity.class));
                finish();
            }
        };
        handler.sendEmptyMessageDelayed(0, 2000); //2초후 화면전환
    }
}
