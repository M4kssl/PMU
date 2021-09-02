package com.example.laba1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("Hello World");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int Max(int a, int b){
        if (a>b){
            return a;
        }else if(a<b){
            return b;
        }else
            return a;
    }

    int Min(int a, int b){
        if (a<b){
            return a;
        }else if(a>b){
            return b;
        }else
            return a;
    }
}