package org.test.designpatterns;

import org.designpatterns.creational.abstractfactory.AbstractFoodFactory;
import org.designpatterns.creational.abstractfactory.FoodProducer;
import org.designpatterns.creational.abstractfactory.FoodType;
import org.designpatterns.creational.abstractfactory.FruitType;
import org.designpatterns.creational.abstractfactory.IFruit;
import org.designpatterns.creational.abstractfactory.IVegetable;
import org.designpatterns.creational.abstractfactory.VegetableType;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: AbstractFactoryPatternTest.java
 * Author: AGanesan
 */
public class AbstractFactoryPatternTest {

	private final static Logger logger = LoggerFactory.getLogger(AbstractFactoryPatternTest.class);

	@Test
	public void factory() {
		AbstractFoodFactory fruitFactory = FoodProducer.getFood(FoodType.FRUIT);

		IFruit apple = fruitFactory.newFruit(FruitType.APPLE);
		logger.info("Apple is {} in color and tastes {}", new Object[] { apple.color(), apple.taste() });

		IFruit orange = fruitFactory.newFruit(FruitType.ORANGE);
		logger.info("Apple is {} in color and tastes {}", new Object[] { orange.color(), orange.taste() });

		AbstractFoodFactory vegetableFactory = FoodProducer.getFood(FoodType.VEGETABLE);

		IVegetable cauliflower = vegetableFactory.newVegetable(VegetableType.CAULIFLOWER);
		logger.info("Cauliflower is {} in color and has been produced at {}", new Object[] { cauliflower.color(),
				cauliflower.origin() });

		IVegetable tomato = vegetableFactory.newVegetable(VegetableType.TOMATO);
		logger.info("Tomato is {} in color and has been produced at {}",
				new Object[] { tomato.color(), tomato.origin() });

		IVegetable potato = vegetableFactory.newVegetable(VegetableType.POTATO);
		logger.info("Potato is {} in color and has been produced at {}",
				new Object[] { potato.color(), potato.origin() });

	}

}
