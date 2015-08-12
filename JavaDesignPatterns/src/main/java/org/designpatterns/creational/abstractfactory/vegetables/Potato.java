package org.designpatterns.creational.abstractfactory.vegetables;

import org.designpatterns.creational.abstractfactory.IVegetable;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Potato.java
 * Author: AGanesan
 */
public class Potato implements IVegetable {

	public String origin() {
		return "IDAHO";
	}

	public String color() {
		return "yellow";
	}

}
