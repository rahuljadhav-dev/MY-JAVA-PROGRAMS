package com.school.info;

public class School {
	private String name;
	private int roll;
	int id;
	int age;
	String gender;
	

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int i) {
		this.age = i;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void details() {
		System.out.println("\nStudent name :"+name);
		System.out.println("Roll no :"+roll);
		System.out.println("ID :"+id);
		System.out.println("Gender :"+gender);
		System.out.println("Age :"+age);
	}
	
}
