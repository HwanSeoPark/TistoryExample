package com.tistoryexample.anonymousclassexample.interfaceannouymous;

public class Main {
	public static void main(String... args) {
		// new Animal() {...} : 익명 클래스 객체를 만드는 문법
		// 인터페이스 이름을 클래스 컨스트럭터 호출식처럼 사용하고 있음.
		// : 굳이 익명클래스 사용 이유?
		// -> 특정 메서드를 위한 구현체를 만들수 있음
		Animal animal = new Animal() {

			@Override
			public void sound() {
				System.out.println("야옹");				
			}
			@Override
			public void move() {
				System.out.println("살금살금");				
			}
		};	

		animal.sound();
		animal.move();
	}
}
