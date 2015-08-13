package org.test.designpatterns;

import org.designpatterns.creational.singleton.SingletonCounter;
import org.designpatterns.creational.singleton.problem.SingletonProblemInstance;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Singletontest.java
 * Author: AGanesan
 */
public class SingletonTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void singleton() {
		SingletonCounter counter = SingletonCounter.getInstance();
		logger.info("Counter value : {}", counter.getCounter());

		counter.add();
		counter.add();

		logger.info("Counter value after 2 adds: {}", counter.getCounter());

		SingletonCounter counter1 = SingletonCounter.getInstance();
		logger.info("Counter1 value : {}", counter1.getCounter());

		counter1.add();

		logger.info("Counter1 value after an add: {}", counter1.getCounter());

	}

	@Test
	public void problem() {

		SingletonProblemInstance counter = new SingletonProblemInstance();
		counter.add();
		counter.add();

		logger.info("Counter value after 2 adds: {}", counter.getCounter());

		SingletonProblemInstance counter1 = new SingletonProblemInstance();
		counter1.subtract();

		logger.info("Counter value after 1 subtract: {}", counter1.getCounter());

		logger.error("Hey my values keep changing and its all about the global objects, and i want to work on the same object instance, so what do i do?");

	}

}
