package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.activity_main);
//        RelativeLayout relativeLayout = new RelativeLayout(this);
//        RelativeLayout.LayoutParams params =  new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.WRAP_CONTENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT);
//        params.addRule(RelativeLayout.CENTER_IN_PARENT);  //设置布局中的控件居中显示
//        TextView textView = new TextView(this);                       //创建TextView控件
//        textView.setText("你好Android");                     //设置TextView的文字内容
//        textView.setTextColor(Color.RED);                                  //设置TextView的文字颜色
//        textView.setTextSize(18);                                                //设置TextView的文字大小
//        relativeLayout.addView(textView, params);                  //添加TextView对象和TextView的布局属性
//        setContentView(relativeLayout);                                  //设置在Activity中显示RelativeLayout
        TextView textView = findViewById(R.id.text_view_hello_world);
        String helloText = getResources().getString(R.string.hello_android);
        textView.setText(helloText);
    }
}