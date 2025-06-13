package com.tistoryexample.anonymousclassexample.constructorabstractclass;

public class Main {
	public static void main(String... args) {
		Animal animal = new Animal();
		Animal.Dog dog = animal.new Dog("초코") {
						
			@Override
			void sound() {
				System.out.println("멍멍");				
			}			
		};
		
		dog.sound();
		dog.introduce();	
	}
}
