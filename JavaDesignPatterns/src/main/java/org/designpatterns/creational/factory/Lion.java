package org.designpatterns.creational.factory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Lion.java
 * Author: AGanesan
 */
public class Lion implements IAnimal {

	public String eat() {
		return "buffaloes";
	}

	public String color() {
		return "yellow";
	}

	public String name() {
		return "Lion";
	}

}
