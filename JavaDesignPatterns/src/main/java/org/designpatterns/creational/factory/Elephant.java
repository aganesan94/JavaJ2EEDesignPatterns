package org.designpatterns.creational.factory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Elephant.java
 * Author: AGanesan
 */
public class Elephant extends AbstractAnimal {

	@Override
	public String eat() {
		return "bamboo";
	}

	@Override
	public String color() {
		return "grey";
	}

	@Override
	public String name() {
		return "Elephant";
	}

}
