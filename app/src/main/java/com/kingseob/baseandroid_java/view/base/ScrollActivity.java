package com.kingseob.baseandroid_java.view.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;

import com.kingseob.baseandroid_java.R;

public abstract class ScrollActivity extends BaseActivity {

    protected View contentView;

    private ViewGroup scrollableContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        scrollableContainer = this.findViewById(R.id.scrollableContainer);

        LayoutInflater inflater = LayoutInflater.from(this);
        contentView = inflater.inflate(scrollableContentView(), scrollableContainer, true);

        afterCreated(savedInstanceState);
    }

    public abstract @LayoutRes
    int scrollableContentView();

    public abstract @LayoutRes int fixedContentView();

    public abstract void afterCreated(Bundle savedInstanceState);

}