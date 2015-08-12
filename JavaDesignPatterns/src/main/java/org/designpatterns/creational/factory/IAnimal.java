/*
 * Project Name: JavaDesignPatterns
 * File Name: AbstractAnimal.java
 * Author: AGanesan
 */
package org.designpatterns.creational.factory;

/**
 * Interface
 * 
 * @author AGanesan
 *
 */
public interface IAnimal {

	/**
	 * returns the food it eats
	 * 
	 * @return
	 */
	public String eat();

	/**
	 * returns color of the animal
	 * 
	 * @return
	 */
	public String color();

	/**
	 * returns the name of the animal
	 * 
	 * @return
	 */
	public String name();
}
