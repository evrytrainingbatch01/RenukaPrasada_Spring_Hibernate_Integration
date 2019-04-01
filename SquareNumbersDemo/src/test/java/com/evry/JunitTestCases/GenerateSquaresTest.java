package com.evry.JunitTestCases;



import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class GenerateSquaresTest extends TestCase {
	
	public GenerateSquaresTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void genarating() {

		assertEquals(4, GenarateSqures.genarateSquares(2));
	}

}
