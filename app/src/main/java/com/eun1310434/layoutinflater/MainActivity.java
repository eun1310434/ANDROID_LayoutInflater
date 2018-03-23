/*=====================================================================
□ Infomation
  ○ Data : 23.03.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference
     - Do it android app Programming
     - Hello JAVA Programming
     - http://itmining.tistory.com/5

□ Function
  ○ LayoutInflater를 활용하여 소스코드로 UI 업데이트 하기
     01) XML을 미리 만들어 놓기
     02) 미리 만들어 놓은 XML에 찍어서 붙여 넣기

□ Study
  ○ LayoutInflater
     - XML 레이아웃에 정의된 내용이 메모리에 객체화되는 과정
       01) 레이아웃 정의 ( XML 레이아웃 파일 ↔ 자바 소스코드 파일 ) : Developer
       02) 메모리로딩 : System
       03) 화면(뷰그룹) : System

  ○ setContentView
     - 메소드의 역할
        01) 화면에 나타낼 뷰를 지정 실행
        02) XML 레이아웃을 메모리 상에 객체화 실행
     - 메소드에서 XML 레이아웃 파일 매칭 과정
        01) XML 레이아웃 파일 ↔ 자바 소스코드 파일
        02) 화면전시(실행)
     - 메소드 구성
        01) 전체화면 : public void setContentView(int layoutResID)
        02) 전체화면 : public void setContentViw (View view[, ViewGroup.LayoutParams params])
        03) 부분화면 : getSystemService(Contnet.LAYOUT_INFLATER_SERVICE)
              * 화면의 일부분만을 별도의 지정된 XML로 설정하여 보여줌
=====================================================================*/
package com.eun1310434.layoutinflater;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int countRow = 0;
    LayoutInflater inflater;
    LinearLayout container;
    TextView sub_tv ;
    CheckBox checkBox ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //XML 레이아웃을 메모리에 객체화 하는 과정을 위해 시스템 서비스 객체생성
        inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        container = (LinearLayout) findViewById(R.id.container);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddView();
            }
        });
    }

    public void AddView() {
        countRow++;
        inflater.inflate(R.layout.sub, container, true); //XML 레이아웃을 메모리에 객체화 하는 과정
        sub_tv = (TextView) container.findViewById(R.id.sub_tv);
        checkBox = (CheckBox) container.findViewById(R.id.sub_checkBox);
    }
}
