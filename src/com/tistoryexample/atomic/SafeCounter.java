package com.tistoryexample.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeCounter {

	private static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                count.incrementAndGet(); // 원자적 증가
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("최종 값: " + count.get()); // 정확히 20000 출력
    }
}
