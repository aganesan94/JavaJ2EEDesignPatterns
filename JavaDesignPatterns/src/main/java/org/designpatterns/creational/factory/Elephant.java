package org.designpatterns.creational.factory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Elephant.java
 * Author: AGanesan
 */
public class Elephant implements IAnimal {

	public String eat() {
		return "bamboo";
	}

	public String color() {
		return "grey";
	}

	public String name() {
		return "Elephant";
	}

}
