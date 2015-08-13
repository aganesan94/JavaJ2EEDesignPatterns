package org.designpatterns.creational.prototype;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Honda.java
 * Author: AGanesan
 */
public class Honda extends Cars implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Honda honda = new Honda();
		honda.setColor("white");
		honda.setYear("2010");
		return honda;
	}
}
