package org.designpatterns.creational.abstractfactory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: FruitFactory.java
 * Author: AGanesan
 */
public abstract class AbstractFoodFactory {

	public abstract IFruit newFruit(FruitType fruitType);

	public abstract IVegetable newVegetable(VegetableType vegetableType);
}
