package com.stradtman.collectionsdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final int NUMBER_OF_ELEMENTS = 1024;
    LinearLayout layoutList;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        layoutList = findViewById(R.id.layout_list);
        ArrayList<Integer> integers = new ArrayList<>();
        for(int i = 0; i < NUMBER_OF_ELEMENTS; ++i) {
            integers.add(i);
        }
        for(Integer num: integers) {
            layoutList.addView(defaultTextViewGenerator(Integer.toBinaryString(num)));
        }

    }
    @SuppressLint("NewApi")
    private TextView defaultTextViewGenerator(String displayText) {
        TextView view = new TextView(context);
        view.setText(displayText);
        view.setTextSize(TypedValue.COMPLEX_UNIT_SP, 32);
        view.setPadding(15, 15, 15, 15);
        view.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        view.setWidth(2000);
        return view;
    }
}
