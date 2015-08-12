package org.designpatterns.creational.abstractfactory.fruits;

import org.designpatterns.creational.abstractfactory.IFruit;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Orange.java
 * Author: AGanesan
 */
public class Orange implements IFruit {

	public String color() {
		return "orange";
	}

	public String taste() {
		return "sour";
	}

}
