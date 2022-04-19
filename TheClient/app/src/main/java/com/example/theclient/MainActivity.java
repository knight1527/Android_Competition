package com.example.theclient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

/**
 * @Author duanqihang
 * @Date 2022-4-19
 * @Description: 进入程序的欢迎或者广告页面
 */

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}