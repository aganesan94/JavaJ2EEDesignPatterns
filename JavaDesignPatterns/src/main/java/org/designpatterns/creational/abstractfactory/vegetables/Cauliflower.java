package org.designpatterns.creational.abstractfactory.vegetables;

import org.designpatterns.creational.abstractfactory.IVegetable;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Cauliflower.java
 * Author: AGanesan
 */
public class Cauliflower implements IVegetable {

	public String origin() {
		return "TEXAS";
	}

	public String color() {
		return "white";
	}

}
