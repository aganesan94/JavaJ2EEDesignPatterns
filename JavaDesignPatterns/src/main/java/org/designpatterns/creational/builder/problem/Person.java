package org.designpatterns.creational.builder.problem;

import java.util.Date;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Person.java
 * Author: AGanesan
 */
public class Person {

	private String name;
	private int age;
	private Date dob;

	public Person(String name, int age, Date dob) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Date getDob() {
		return dob;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", dob=");
		builder.append(dob);
		builder.append("]");
		return builder.toString();
	}

}
