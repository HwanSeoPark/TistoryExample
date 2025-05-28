package com.Tistory.AbstractClass.abstractclass;

public class Tiger extends Animal {
	
	public Tiger() {}
	
	public Tiger(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	
	@Override
	public void eat() {
		System.out.println(name + "는 고기를 좋아한다");			
	}
}
