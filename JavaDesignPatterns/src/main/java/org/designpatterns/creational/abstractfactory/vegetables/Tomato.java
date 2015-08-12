package org.designpatterns.creational.abstractfactory.vegetables;

import org.designpatterns.creational.abstractfactory.IVegetable;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Tomato.java
 * Author: AGanesan
 */
public class Tomato implements IVegetable {

	public String origin() {
		return "CALIFORNIA";
	}

	public String color() {
		return "red";
	}

}
