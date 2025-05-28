package com.Tistory.NestedClassExample.shadowing;

public class OuterClass {

	static String name = "Outer";

    static class StaticNested {
        String name = "StaticNested";  // 외부 static 변수 'name'을 쉐도잉함

        void printNames() {
        	// StaticNested의 name
        	System.out.println("this.name = " + name);               
        	
        	// Outer 클래스의 name (명시적 접근)
            System.out.println("Outer.name = " + OuterClass.name);   
        }
    }
}
