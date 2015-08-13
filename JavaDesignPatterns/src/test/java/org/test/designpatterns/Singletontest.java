package org.test.designpatterns;

import org.designpatterns.creational.singleton.SingletonCounter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Singletontest.java
 * Author: AGanesan
 */
public class Singletontest {

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

}
