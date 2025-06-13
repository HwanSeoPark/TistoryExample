package com.tistoryexample.abstractclassexample;

// 상위 추상 클래스 : 공통 속석와 동작 정의
public abstract class Animal {
	protected String name;
	protected String sound;
	
	public Animal() {}
	
	public Animal(String name, String sound) {
		this.name = name;
		this.sound = sound;		
	}

	// 공통 메서드 
	public void state() {
		System.out.println(name + "의 울음소리는 " + sound);
	}

	// 추상 메서드 : 울음소리는 동물마다 다르다(하위 클래스가 바드시 구현)
	public abstract void eat();	
}
