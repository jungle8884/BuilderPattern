package com.BuilderPattern;

//一个包含创建产品各个子部件的抽象方法的接口，通常还包含一个返回复杂产品的方法 getResult()。
public interface IBuilder {
    void BuildPartA();
    void BuildPartB();
    void BuildPartC();
    Product getResult();
}
