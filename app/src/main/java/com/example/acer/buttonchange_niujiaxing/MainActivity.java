package com.example.acer.buttonchange_niujiaxing;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    int flag1 = 1 ;
    int flag2 = 0 ;
    int flag3 = 0 ;
    int flag4 = 0 ;
    Button btn1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* findViewById(R.id.imageButton1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag1 == 0) {
                    (findViewById(R.id.imageButton1)).setBackgroundResource(R.drawable.tab_item_home_normal);
                    flag1 = 1;
                    if (flag2 == 1) {
                        (findViewById(R.id.imageButton2)).setBackgroundResource(R.drawable.tab_item_category_focus);
                        flag2 = 0;
                    }
                    else if (flag3 == 1) {
                        (findViewById(R.id.imageButton3)).setBackgroundResource(R.drawable.tab_item_cart_focus);
                        flag3 = 0;
                    }
                    else{
                        (findViewById(R.id.imageButton4)).setBackgroundResource(R.drawable.tab_item_personal_focus);
                        flag4 = 0;
                    }
                }
                //else flag1 = 0;
            }
        });
        findViewById(R.id.imageButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag2 == 0) {
                    (findViewById(R.id.imageButton2)).setBackgroundResource(R.drawable.tab_item_category_normal);
                    flag2 = 1 ;
                    if (flag1 == 1){
                        (findViewById(R.id.imageButton1)).setBackgroundResource(R.drawable.tab_item_home_focus);
                        flag1 = 0;}
                    else if (flag3 == 1){
                        (findViewById(R.id.imageButton3)).setBackgroundResource(R.drawable.tab_item_cart_focus);
                        flag3 = 0;}
                    else
                        (findViewById(R.id.imageButton4)).setBackgroundResource(R.drawable.tab_item_personal_focus);
                        flag4 = 0;
                }
            }
        });
        findViewById(R.id.imageButton3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag3 == 0) {
                    (findViewById(R.id.imageButton3)).setBackgroundResource(R.drawable.tab_item_cart_normal);
                    flag3 = 1;
                    if (flag2 == 1){
                        (findViewById(R.id.imageButton2)).setBackgroundResource(R.drawable.tab_item_category_focus);
                        flag2 = 0;}
                    else if (flag1 == 1) {
                        (findViewById(R.id.imageButton1)).setBackgroundResource(R.drawable.tab_item_home_focus);
                        flag1 = 0 ;}
                    else
                        (findViewById(R.id.imageButton4)).setBackgroundResource(R.drawable.tab_item_personal_focus);
                        flag4 = 0 ;
                }
            }
        });

        findViewById(R.id.imageButton4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag4 == 0) {
                    (findViewById(R.id.imageButton4)).setBackgroundResource(R.drawable.tab_item_personal_normal);
                    flag4 = 1;
                    if (flag2 == 1){
                        (findViewById(R.id.imageButton2)).setBackgroundResource(R.drawable.tab_item_category_focus);
                        flag2 = 0;}
                    if (flag3 == 1){
                        (findViewById(R.id.imageButton3)).setBackgroundResource(R.drawable.tab_item_cart_focus);
                        flag3 = 0 ;}
                    else
                        (findViewById(R.id.imageButton1)).setBackgroundResource(R.drawable.tab_item_home_focus);
                        flag1 = 0;
                }
            }
        });*/
       findViewById(R.id.imageButton1).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               (findViewById(R.id.imageButton1)).setBackgroundResource(R.drawable.tab_item_home_normal);
               (findViewById(R.id.imageButton2)).setBackgroundResource(R.drawable.tab_item_category_focus);
               (findViewById(R.id.imageButton3)).setBackgroundResource(R.drawable.tab_item_cart_focus);
               (findViewById(R.id.imageButton4)).setBackgroundResource(R.drawable.tab_item_personal_focus);
           }
       });
        findViewById(R.id.imageButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                (findViewById(R.id.imageButton1)).setBackgroundResource(R.drawable.tab_item_home_focus);
                (findViewById(R.id.imageButton2)).setBackgroundResource(R.drawable.tab_item_category_normal);
                (findViewById(R.id.imageButton3)).setBackgroundResource(R.drawable.tab_item_cart_focus);
                (findViewById(R.id.imageButton4)).setBackgroundResource(R.drawable.tab_item_personal_focus);
            }
        });
        findViewById(R.id.imageButton3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                (findViewById(R.id.imageButton1)).setBackgroundResource(R.drawable.tab_item_home_focus);
                (findViewById(R.id.imageButton2)).setBackgroundResource(R.drawable.tab_item_category_focus);
                (findViewById(R.id.imageButton3)).setBackgroundResource(R.drawable.tab_item_cart_normal);
                (findViewById(R.id.imageButton4)).setBackgroundResource(R.drawable.tab_item_personal_focus);
            }
        });
        findViewById(R.id.imageButton4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                (findViewById(R.id.imageButton1)).setBackgroundResource(R.drawable.tab_item_home_focus);
                (findViewById(R.id.imageButton2)).setBackgroundResource(R.drawable.tab_item_category_focus);
                (findViewById(R.id.imageButton3)).setBackgroundResource(R.drawable.tab_item_cart_focus);
                (findViewById(R.id.imageButton4)).setBackgroundResource(R.drawable.tab_item_personal_normal);
            }
        });
    }
}

