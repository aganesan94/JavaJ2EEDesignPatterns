package org.designpatterns.creational.prototype;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Honda.java
 * Author: AGanesan
 */
public class Honda extends Cars implements Cloneable {

	@Override
	public Object clone() throws CloneNotSupportedException {
		Honda honda = new Honda();
		honda.setModel(getModel());
		honda.setColor("white");
		honda.setYear("2010");
		return honda;
	}
}
