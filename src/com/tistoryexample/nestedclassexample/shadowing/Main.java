package com.tistoryexample.nestedclassexample.shadowing;

public class Main {
	public static void main(String[] args) {
        OuterClass.StaticNested nested = new OuterClass.StaticNested();
        nested.printNames();
    }
}
