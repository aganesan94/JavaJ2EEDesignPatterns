package org.designpatterns.creational.factory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Cat.java
 * Author: AGanesan
 */
public class Deer extends AbstractAnimal {
	
	@Override
	public  String eat() {
		return "grass";
	}

	@Override
	public  String color() {
		return "golden";
	}

	@Override
	public String name() {
		return "Deer";
	}

}
