package com.example.final_1;

import android.app.Application;

public class AppTest extends Application {
    //전역 변수 선언
    public int count;
    public boolean n2;
    public String SArray;
    public double DHeart;

    @Override
    public void onCreate() {
        super.onCreate();
        n2 = false;
        count = 0;
        SArray = null;
        DHeart = 0.0;
    }

    public void Init() {
        n2 = false;
        count = 0;
        SArray = null;
        DHeart = 0.0;
    }

    // 클래스를 선언한 뒤, 다른 액티비티에서 사용할 메서드
    // 저장된 값 불러오기   get

    public boolean getBool() {
        return n2;
    }
    public int getcount() {
        return count;
    }
    public String getSArray() { return SArray; }
    public double getDHeart() { return DHeart; }

    // 값 지정 set
    public void setBooll(boolean data) {
        this.n2 = data;
    }
    public void setcount(int data) {
        this.count = data;
    }
    public void setSArray(String data) {
        this.SArray = data;
    }
    public void setDHeart(double data) { this.DHeart = data; }
}