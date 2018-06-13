package com.nagarjun;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnit {

	String message = "Hello world";
	MessageUtil util = new MessageUtil(message);
	
	@Test
	public void testPrintMessage(){
		assertEquals("Hello world", util.printMessage());
	}
	
	@Test
	public void testPrintMsg(){
		assertNotNull(util.printMessage());
	}
}
