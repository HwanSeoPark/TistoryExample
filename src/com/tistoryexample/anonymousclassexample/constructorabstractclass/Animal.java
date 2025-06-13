package com.tistoryexample.anonymousclassexample.constructorabstractclass;

public class Animal {
	abstract class Dog {
		private String name;
		
		public Dog(String name) {
			this.name = name;
		}
		
		abstract void sound();
		
		public void introduce() {
			System.out.println("저는 " + name + " 입니다!!");
		}
	}	
}
