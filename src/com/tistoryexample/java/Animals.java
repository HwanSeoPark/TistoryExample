package com.tistoryexample.java;

public class Animals {
    private String name;
    private String animalType;
    private int age;

    public Animals() {}

	public Animals(String name, String animalType, int age) {
		super();
		this.name = name;
		this.animalType = animalType;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}    