package org.designpatterns.creational.abstractfactory;

import org.designpatterns.creational.abstractfactory.fruits.Apple;
import org.designpatterns.creational.abstractfactory.fruits.Orange;

/*
 * Project Name: JavaDesignPatterns
 * File Name: FruitFactory.java
 * Author: AGanesan
 */
public class FruitFactory extends AbstractFoodFactory {

	@Override
	public IFruit newFruit(FruitType fruitType) {
		IFruit fruit = null;

		if (fruitType.equals(FruitType.APPLE)) {
			fruit = new Apple();
		} else if (fruitType.equals(FruitType.ORANGE)) {
			fruit = new Orange();
		}
		
		return fruit;
	}

	@Override
	public IVegetable newVegetable(VegetableType vegetableType) {
		return null;
	}

}
