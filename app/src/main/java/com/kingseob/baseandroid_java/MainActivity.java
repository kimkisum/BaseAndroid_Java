package com.kingseob.baseandroid_java;

import android.os.Bundle;

import com.kingseob.baseandroid_java.view.base.ScrollActivity;


public class MainActivity extends ScrollActivity {

    @Override
    public int scrollableContentView() { return R.layout.activity_main; }

    @Override
    public int fixedContentView() { return -1; }

    @Override
    public void afterCreated(Bundle savedInstanceState) {

    }
}