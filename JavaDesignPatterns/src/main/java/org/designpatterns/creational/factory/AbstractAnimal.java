/*
 * Project Name: JavaDesignPatterns
 * File Name: AbstractAnimal.java
 * Author: AGanesan
 */
package org.designpatterns.creational.factory;

/**
 * Abstract class
 * 
 * @author AGanesan
 *
 */
public abstract class AbstractAnimal {

	/**
	 * returns the food it eats
	 * 
	 * @return
	 */
	public abstract String eat();

	/**
	 * returns color of the animal
	 * 
	 * @return
	 */
	public abstract String color();

	/**
	 * returns the name of the animal
	 * 
	 * @return
	 */
	public abstract String name();
}
