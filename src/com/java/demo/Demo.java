package com.java.demo;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Demo {
	static Logger log = Logger.getLogger(Demo.class);

	public static void main(String[] args) {
		log.setLevel(Level.DEBUG);
		log.debug("This is a debug message");
		myMethod();
		log.info("This is an info message");
	}

	private static void myMethod() {
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			log.error("This is an exception", e);
		}
	}
}
