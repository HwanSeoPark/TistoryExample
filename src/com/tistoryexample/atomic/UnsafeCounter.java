package com.tistoryexample.atomic;

public class UnsafeCounter {

	private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                count++; // 스레드 안전하지 않음!
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("최종 값: " + count); // 예상: 20000, 실제: 작을 가능성 높음
    }
}
