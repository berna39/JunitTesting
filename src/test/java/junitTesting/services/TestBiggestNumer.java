package junitTesting.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBiggestNumer {

	@Test
	public void test() {
		TestBiggestNumber biggestNumer = new TestBiggestNumber();
		int[] numbers = { 1, 4, 6, 7, 9 };
		int biggest = biggestNumer.getBiggest(numbers);
		assertEquals(9, biggest);
	}

}
