package org.designpatterns.creational.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: AnimalFactory.java
 * Author: AGanesan
 */
public class AnimalFactory {

	private final static Logger logger = LoggerFactory
			.getLogger(AnimalFactory.class);

	/**
	 * creates new Animal
	 * 
	 * @param animalType
	 * @return
	 */
	public static IAnimal newAnimal(AnimalType animalType) {
		IAnimal animal = null;

		if (animalType.equals(AnimalType.CARNIVORE)) {
			logger.info("Returning an instance of a lion");
			return new Lion();
		} else if (animalType.equals(AnimalType.HERBIVORE)) {
			logger.info("Returning an instance of a deer");
			return new Deer();
		} else if (animalType.equals(AnimalType.MAMMAL)) {
			logger.info("Returning an instance of a elephant");
			return new Elephant();
		}
		
		return animal;
	}

}
