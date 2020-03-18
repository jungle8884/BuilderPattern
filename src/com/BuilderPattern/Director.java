package com.BuilderPattern;

//调用建造者对象中的部件构造与装配方法完成复杂对象的创建，在指挥者中不涉及具体产品的信息。
public class Director {

    private IBuilder builder;

    public Director(IBuilder builder){
        this.builder = builder;
    }

    public void SetDirector(IBuilder builder){
        this.builder = builder;
    }

    public Product construct(){
        builder.BuildPartA();
        builder.BuildPartB();
        builder.BuildPartC();
        return builder.getResult();
    }

}
