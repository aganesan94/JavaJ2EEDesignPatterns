package org.designpatterns.creational.factory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Cat.java
 * Author: AGanesan
 */
public class Deer implements IAnimal {

	public String eat() {
		return "grass";
	}

	public String color() {
		return "golden";
	}

	public String name() {
		return "Deer";
	}

}
