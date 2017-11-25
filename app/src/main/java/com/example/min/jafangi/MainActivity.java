package com.example.min.jafangi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btn_KG;
    ImageButton btn_KW;
    ImageButton btn_CC;
    ImageButton btn_JL;
    ImageButton btn_JJ;
    ImageButton btn_KS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btn_KG = (ImageButton) findViewById(R.id.btn_KG);
        btn_KG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, shopKgActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn_KW = (ImageButton) findViewById(R.id.btn_KW);
        btn_KW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, shopKwActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn_CC = (ImageButton) findViewById(R.id.btn_CC);
        btn_CC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, shopCcActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn_KS = (ImageButton) findViewById(R.id.btn_KS);
        btn_KS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, shopKsActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn_JL = (ImageButton) findViewById(R.id.btn_JL);
        btn_JL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, shopJlActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn_JJ = (ImageButton) findViewById(R.id.btn_JJ);
        btn_JJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, shopJjActivity.class);
                startActivity(intent);
            }
        });

    }
}
