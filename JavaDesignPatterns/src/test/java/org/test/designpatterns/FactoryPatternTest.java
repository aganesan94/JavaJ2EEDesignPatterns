package org.test.designpatterns;

import org.designpatterns.creational.factory.IAnimal;
import org.designpatterns.creational.factory.AnimalFactory;
import org.designpatterns.creational.factory.AnimalType;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: FactoryPatternTest.java
 * Author: AGanesan
 */
public class FactoryPatternTest {

	private final static Logger logger = LoggerFactory.getLogger(FactoryPatternTest.class);

	@Test
	public void factory() throws Exception {
		IAnimal carnivore = AnimalFactory.newAnimal(AnimalType.CARNIVORE);
		logger.info("A carnivore with color:{}, eats:{} is {}.", new Object[] { carnivore.color(), carnivore.eat() });

		IAnimal herbivore = AnimalFactory.newAnimal(AnimalType.HERBIVORE);
		logger.info("A herbivore with color:{}, eats:{} is {}.", new Object[] { herbivore.color(), herbivore.eat() });

		IAnimal mammal = AnimalFactory.newAnimal(AnimalType.MAMMAL);
		logger.info("A mammal with color:{}, eats:{} is {}.", new Object[] { mammal.color(), mammal.eat(), mammal.name() });

	}

}
