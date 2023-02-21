package com.example.as_jin1;

import org.jetbrains.annotations.Nullable;

public class Jin {
    static {
        System.loadLibrary("as_jin1");
    }
    public String name = "Dayit";//使用C++ 代码修改 name 为 Beyond
    public static int age = 20;

    private double number = 9000.0000;

    private final double number2 = 10000.00;


    public int add(int number1,int number2){
        return number1+number2;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public  native void changname();// 改变我的 name属性
    public static native void changage();

    public   native void changnumber();

    public native void calladdmathod();
}
