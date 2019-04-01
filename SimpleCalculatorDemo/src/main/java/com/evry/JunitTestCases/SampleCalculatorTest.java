package com.evry.JunitTestCases;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SampleCalculatorTest {
	
	SimpleCalculator s=new SimpleCalculator();
	
	private SimpleCalculator simpleCalculator;
	
	@Before
	
	public void setup() {
		
		simpleCalculator=new SimpleCalculator();
		
		
	}
	
	@Test
	public void test()
	{
		int i =simpleCalculator.multiplication(2, 3);
				
				assertEquals(6,i);
	}	
	
	
	@After
	public void tearDown() {
		
		simpleCalculator=null;
		
	}
	

}
