package org.test.designpatterns.creational;

import org.designpatterns.creational.prototype.Honda;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Singletontest.java
 * Author: AGanesan
 */
public class PrototypeTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void prototype() throws Exception {
		Honda honda = new Honda();
		honda.setModel("ACCORD");
		Honda accord1 = (Honda) honda.clone();
		Honda accord2 = (Honda) honda.clone();
		Honda accord3 = (Honda) honda.clone();
		logger.info("{}", accord1);
		logger.info("{}", accord2);
		logger.info("{}", accord3);

	}

}
