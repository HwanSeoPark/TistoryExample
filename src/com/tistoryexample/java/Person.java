package com.tistoryexample.java;

public class Person {
	private String name;
	private int age;
	private Address address;
	
	public Person() {}
	
	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.address = new Address(city);
	}
	
	public void print() {
		System.out.println("이름 : " + name);
		address.printAddress();
	}
	// 중첩 클래스 : Address는 Person 내부에서만 의미가 있음
	public class Address {
		private String city;
		
		public Address() {}
		
		public Address(String city) {
			this.city = city;
		}
		
		public void printAddress() {
			System.out.println("주소 : " + city);
		}
	}
}
