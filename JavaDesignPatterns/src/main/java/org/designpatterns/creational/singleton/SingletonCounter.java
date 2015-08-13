package org.designpatterns.creational.singleton;

/*
 * Project Name: JavaDesignPatterns
 * File Name: SingletonCounter.java
 * Author: AGanesan
 */
public class SingletonCounter {

	private static SingletonCounter _instance = null;

	private int counter;

	public int getCounter() {
		return counter;
	}

	public void add() {
		this.counter = this.counter + 1;
	}

	public void subtract() {
		this.counter = this.counter - 1;
	}

	private SingletonCounter() {
		// No one gets to instantiate this class
	}

	public static synchronized SingletonCounter getInstance() {
		if (_instance == null) {
			_instance = new SingletonCounter();
		}
		return _instance;
	}

}
