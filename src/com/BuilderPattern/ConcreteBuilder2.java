package com.BuilderPattern;

public class ConcreteBuilder2 implements IBuilder{
    private Product product = new Product();

    public void BuildPartA() {
        product.SetPartA(10);
    }

    public void BuildPartB() {
        product.SetPartB(20);
    }

    public void BuildPartC() {
        product.SetPartC(30);
    }

    public Product getResult() {
        return product;
    }
}
