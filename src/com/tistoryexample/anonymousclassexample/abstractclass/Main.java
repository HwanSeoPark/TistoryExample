package com.tistoryexample.anonymousclassexample.abstractclass;

public class Main {
	public static void main(String... args) {
		Animal animal = new Animal();
		
		Animal.Dog dog = animal.new Dog() {

			@Override
			void sound() {
				System.out.println("멍멍");				
			}

			@Override
			void move() {
				System.out.println("살금살금");					
			}			
		};
		dog.sound();
		dog.move();
	}
}
