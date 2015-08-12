package org.designpatterns.creational.abstractfactory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: FoodProducer.java
 * Author: AGanesan
 */
public class FoodProducer {

	/**
	 * returns an abstract factory depending on the type of food.
	 * 
	 * @param type
	 * @return
	 */
	public static AbstractFoodFactory getFood(FoodType type) {

		if (type.equals(FoodType.FRUIT)) {
			return new FruitFactory();
		} else if (type.equals(FoodType.VEGETABLE)) {
			return new VegetableFactory();
		}

		return null;
	}

}
