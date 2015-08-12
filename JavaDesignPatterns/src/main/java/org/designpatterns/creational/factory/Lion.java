package org.designpatterns.creational.factory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Lion.java
 * Author: AGanesan
 */
public class Lion extends AbstractAnimal {

	@Override
	public  String eat() {
		return "buffaloes";
	}

	@Override
	public String color() {
		return "yellow";
	}

	@Override
	public String name() {
		return "Lion";
	}

}
