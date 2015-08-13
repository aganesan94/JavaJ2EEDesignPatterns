package org.test.designpatterns.creational;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.designpatterns.creational.builder.problem.Person;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: BuilderTest.java
 * Author: AGanesan
 */
public class BuilderTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void build() {
		org.designpatterns.creational.builder.Person person = new org.designpatterns.creational.builder.Person.PersonBuilder(
				"BobFoo").setAge(23).build();
		logger.info("Person : {}", person);
	}

	@Test
	public void problem() {
		Person person1 = new Person("Bob1", 24, getDOB1());
		Person person2 = new Person("Bob2", 25, getDOB2());
		Person person3 = new Person("Bob3", 26, getDOB3());

		// now what if this constructor kept changing
		logger.info("Person1: {}", person1);
		logger.info("Person2: {}", person2);
		logger.info("Person3: {}", person3);

	}

	private Date getDOB3() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return dateFormat.parse("02/13/1983");
		} catch (ParseException e) {
			logger.error("Exception ", e);
		}
		return null;
	}

	private Date getDOB2() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return dateFormat.parse("02/13/1984");
		} catch (ParseException e) {
			logger.error("Exception ", e);
		}
		return null;
	}

	private Date getDOB1() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return dateFormat.parse("02/13/1985");
		} catch (ParseException e) {
			logger.error("Exception ", e);
		}
		return null;
	}

}
