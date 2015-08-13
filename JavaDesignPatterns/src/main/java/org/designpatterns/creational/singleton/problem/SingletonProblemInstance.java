package org.designpatterns.creational.singleton.problem;

/*
 * Project Name: JavaDesignPatterns
 * File Name: SingleProblemInstance.java
 * Author: AGanesan
 */
public class SingletonProblemInstance {

	private int counter = 0;

	public int getCounter() {
		return counter;
	}

	public SingletonProblemInstance() {
		super();
	}

	public void add() {
		this.counter = counter + 1;
	}

	public void subtract() {
		this.counter = counter + 1;
	}

}
