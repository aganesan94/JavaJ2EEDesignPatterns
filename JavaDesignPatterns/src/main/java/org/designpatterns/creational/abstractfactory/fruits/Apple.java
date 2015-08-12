package org.designpatterns.creational.abstractfactory.fruits;

import org.designpatterns.creational.abstractfactory.IFruit;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Apple.java
 * Author: AGanesan
 */
public class Apple implements IFruit {

	public String color() {
		return "red";
	}

	public String taste() {
		return "sweet";
	}

}
