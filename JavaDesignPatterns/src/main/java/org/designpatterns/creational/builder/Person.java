package org.designpatterns.creational.builder;

import java.util.Date;

/*
 * Project Name: JavaDesignPatterns
 * File Name: PersonBuilder.java
 * Author: AGanesan
 */
public class Person {

	private String name;
	private int age;
	private Date dob;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zipCode;

	private Person(PersonBuilder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.dob = builder.dob;
		this.addressLine1 = builder.addressLine1;
		this.addressLine2 = builder.addressLine2;
		this.city = builder.city;
		this.state = builder.state;
		this.zipCode = builder.zipCode;
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

	public String getAddressLine1() {
		return addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public String getCity() {
		return city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getState() {
		return state;
	}

	public static class PersonBuilder {

		private String name;
		private int age;
		private Date dob;

		private String addressLine1;
		private String addressLine2;
		private String city;
		private String state;
		private String zipCode;

		public PersonBuilder(String name) {
			this.name = name;
		}

		public PersonBuilder(int age) {
			this.age = age;
		}

		public PersonBuilder(String addressLine1, String addressLine2, String city, String state, String zipCode) {
			this.addressLine1 = addressLine1;
			this.addressLine2 = addressLine2;
			this.city = city;
			this.state = state;
			this.zipCode = zipCode;
		}

		public Person build() {
			return new Person(this);
		}

		public int getAge() {
			return age;
		}

		public PersonBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public Date getDob() {
			return dob;
		}

		public PersonBuilder setDob(Date dob) {
			this.dob = dob;
			return this;
		}
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
		builder.append(", addressLine1=");
		builder.append(addressLine1);
		builder.append(", addressLine2=");
		builder.append(addressLine2);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", zipCode=");
		builder.append(zipCode);
		builder.append("]");
		return builder.toString();
	}
}
