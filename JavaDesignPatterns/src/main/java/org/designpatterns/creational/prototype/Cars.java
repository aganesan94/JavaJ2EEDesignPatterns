package org.designpatterns.creational.prototype;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Cars.java
 * Author: AGanesan
 */
public class Cars {

	private String model;
	private String color;
	private String year;

	public Cars() {
		super();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cars [model=");
		builder.append(model);
		builder.append(", color=");
		builder.append(color);
		builder.append(", year=");
		builder.append(year);
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}

}
