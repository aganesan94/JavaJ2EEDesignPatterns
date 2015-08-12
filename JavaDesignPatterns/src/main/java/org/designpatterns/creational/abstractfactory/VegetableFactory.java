package org.designpatterns.creational.abstractfactory;

import org.designpatterns.creational.abstractfactory.vegetables.Cauliflower;
import org.designpatterns.creational.abstractfactory.vegetables.Potato;
import org.designpatterns.creational.abstractfactory.vegetables.Tomato;

/*
 * Project Name: JavaDesignPatterns
 * File Name: VegetableFactory.java
 * Author: AGanesan
 */
public class VegetableFactory extends AbstractFoodFactory {

	@Override
	public IFruit newFruit(FruitType fruitType) {
		return null;
	}

	@Override
	public IVegetable newVegetable(VegetableType vegetableType) {
		IVegetable vegetable = null;
		if (vegetableType.equals(VegetableType.CAULIFLOWER)) {
			vegetable = new Cauliflower();
		} else if (vegetableType.equals(VegetableType.POTATO)) {
			vegetable = new Potato();
		} else if (vegetableType.equals(VegetableType.TOMATO)) {
			vegetable = new Tomato();
		}
		return vegetable;
	}

}
