package com.example.laba1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Описание класса
 * @author Лацигин Максим
 * @version 1.0
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("Hello World");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Функцция определяет максимум
     * @param a
     * @param b
     * @return
     */
    int Max(int a, int b){
        if (a>=b){
            return a;
        }else
            return b;
    }

    /**
     * Функция определяет минимум
     * @param a
     * @param b
     * @return
     */
    int Min(int a, int b){
        if (a<=b){
            return a;
        }else
            return b;
    }
}