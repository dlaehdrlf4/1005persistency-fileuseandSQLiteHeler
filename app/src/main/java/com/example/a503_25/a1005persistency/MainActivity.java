package com.example.a503_25.a1005persistency;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // 기기의 방향이나 키보드가 숨는 등의 환경이 변경될 때 호출되는 메소드
    @Override
    public void onConfigurationChanged(Configuration newConfig) {

        setContentView(R.layout.activity_main);




        /*// 방향 확인
        TextView textView = (TextView)findViewById(R.id.textView);
        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){

            textView.setText("세로");
        }else{
            textView.setText("가로");
        }


        Toast.makeText(this,"환경이 변경됨",Toast.LENGTH_LONG).show();*/
        super.onConfigurationChanged(newConfig);
    }
}
