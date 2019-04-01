package com.evry.JunitTestCases;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
	
	
	@Test	
	public void checkMinValue()
	{

		assertEquals(6, Sortingdemo.checkMin(new int[] { 10, 8, 6, 9 }));
	}

}
