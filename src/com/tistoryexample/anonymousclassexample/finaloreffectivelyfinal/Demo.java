package com.tistoryexample.anonymousclassexample.finaloreffectivelyfinal;


public class Demo {
    public void test() {
        final int age = 20; // ✅ final
        int number = 10; // ✅ 또는 effectively final
       
        Runnable r = new Runnable() {
            @Override
            public void run() {
            	System.out.println("age = " + age);
                System.out.println("number = " + number);             
            }
        };

        r.run(); // 출력: age = 20, number = 10
    }

    public static void main(String[] args) {
        new Demo().test();
    }
}

