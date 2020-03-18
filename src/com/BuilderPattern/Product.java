package com.BuilderPattern;

//包含多个组成部件的复杂对象
public class Product {
    // 组件
    private int PartA;
    private int PartB;
    private int PartC;

    public void SetPartA(int a){
        PartA = a;
    }

    public void SetPartB(int b){
        PartB = b;
    }

    public void SetPartC(int c){
        PartC = c;
    }

    public void Show(){
        System.out.println("PartA=" + PartA + "; PartB=" + PartB + "; PartA=" + PartC);
    }
}
