package com.tistoryexample.abstractclassexample;

public class Cat extends Animal {

	public Cat() {}
	
	public Cat(String name, String sound) {
		this.name = name;
		this.sound = sound; 		
	}
	
	@Override
	public void eat() {
		System.out.println(name +"는 츄르를 좋아한다");		
	}
}
