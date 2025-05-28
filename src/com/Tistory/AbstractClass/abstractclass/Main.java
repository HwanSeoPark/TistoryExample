package com.Tistory.AbstractClass.abstractclass;

public class Main {
	public static void main(String... args) {
        // 상위 타입으로 하위 클래스 참조(다형성)
		Animal tiger = new Tiger("호랑이", "어흥");
		Animal cat = new Cat("고양이", "야옹");
		
		tiger.state();
		tiger.eat();
		
		cat.state();
		cat.eat();	
	}
}
