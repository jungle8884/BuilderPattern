package com.BuilderPattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IBuilder builder = new ConcreteBuilder1();
        Director director = new Director(builder);
        Product product = director.construct();
        product.Show();

        builder = new ConcreteBuilder2();
        director = new Director(builder);
        product = director.construct();
        product.Show();
    }
}
