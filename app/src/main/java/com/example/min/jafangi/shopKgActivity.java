package com.example.min.jafangi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * Created by Min on 2017-11-22.
 */

public class shopKgActivity extends AppCompatActivity{

    TextView tv_shop_name;
    TextView tv_shop_address;
    TextView kg_amount;
    ImageButton btn_call;
    ImageButton btn_map;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kg);

        tv_shop_name = (TextView)findViewById(R.id.tv_shop_name);
        tv_shop_address = (TextView)findViewById(R.id.tv_shop_address);
        kg_amount = (TextView)findViewById(R.id.kg_amount);
        btn_call = (ImageButton)findViewById(R.id.btn_call);
        btn_map = (ImageButton)findViewById(R.id.btn_map);

        btn_call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-795-3375"));
                    startActivity(intent);

                }
            });

        btn_map.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://naver.me/x3ole8RY"));
                    startActivity(intent);
                }
            });
    }
}
