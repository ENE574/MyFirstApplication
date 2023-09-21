package com.jnu.student;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textViewHello;
    private TextView textViewJNU;
    private Button buttonChangeText;

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
        setContentView(R.layout.activity_main);

        textViewHello = findViewById(R.id.textViewHello);
        textViewJNU = findViewById(R.id.textViewJNU);
        buttonChangeText = findViewById(R.id.buttonChangeText);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempText = textViewHello.getText().toString();
                textViewHello.setText(textViewJNU.getText());
                textViewJNU.setText(tempText);

                Toast.makeText(MainActivity.this, "交换成功", Toast.LENGTH_SHORT).show();

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("交换成功")
                        .setMessage("两个TextView的文本已成功交换")
                        .setPositiveButton("确定", null)
                        .create()
                        .show();
            }
        });
        buttonChangeText.setOnClickListener(v -> {
            // 交换两个TextView的文本
            String temp = textViewHello.getText().toString();
            textViewHello.setText(textViewJNU.getText().toString());
            textViewJNU.setText(temp);

            // 显示Toast
            Toast.makeText(MainActivity.this, "交换成功", Toast.LENGTH_SHORT).show();

            // 显示AlertDialog
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("成功")
                    .setMessage("交换成功")
                    .setPositiveButton("确定", null)
                    .show();
        });
    }

}