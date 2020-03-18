package com.BuilderPattern;

//实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。
public class ConcreteBuilder1 implements IBuilder {

    private Product product = new Product();

    public void BuildPartA() {
        product.SetPartA(1);
    }

    public void BuildPartB() {
        product.SetPartB(2);
    }

    public void BuildPartC() {
        product.SetPartC(3);
    }

    public Product getResult() {
        return product;
    }
}
