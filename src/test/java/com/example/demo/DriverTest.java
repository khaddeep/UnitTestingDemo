package com.example.demo;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class DriverTest {
	Driver fixzuDriver=new Driver();
	@Test
	public void testSum() {
		
		assertEquals(7, fixzuDriver.sum(3, 4));
	}
	
	@Test
	public void testSubtract() {
		assertEquals(1, fixzuDriver.subtract(3, 4));
	}

	
}
