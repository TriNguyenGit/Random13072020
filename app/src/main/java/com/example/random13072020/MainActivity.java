package com.example.random13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //global
    EditText mEditSomin, mEditSomax;
    Button mBtnRanDom;
    TextView mTvKetQua;
    String mValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // local
        // án xạ
       // Yêu cầu
//        1 : Nhập dữ liệu (validate)
//                + Không được bỏ trống
//                + Số min không được lớn hơn số max
//        2 : Xử lý
//                + Hiển thị kết quả theo chuỗi như sau : 1 - 2 - 4 - 5 - 2
//                + Các giá trị không được hiển thị quá 2 lần : 1 - 2 - 4 - 5
         mBtnRanDom = findViewById( R.id.buttonRandom);
         mEditSomax = findViewById(R.id.edittextSomax);
         mEditSomin = findViewById(R.id.edittextSomin);
         mTvKetQua = findViewById(R.id.textviewKetqua);
         mBtnRanDom.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                String textSmin = mEditSomin.getText().toString();
                String textSmax = mEditSomax.getText().toString();
                if(textSmin.isEmpty() || textSmax.isEmpty()){
                    Toast.makeText(
                            MainActivity.this,
                            "Bạn chưa nhập đủ thông tin",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                int sMin = Integer.parseInt(textSmin);
                int sMax = Integer.parseInt(textSmax);
                if(sMin >= sMax){
                    sMax = sMin+1;
                }
               // Hien thi
                 Random random = new Random();
                int value = random.nextInt(sMax - sMin + 1) +sMin;
                mValue = mValue + m
             }
         });

    }

}