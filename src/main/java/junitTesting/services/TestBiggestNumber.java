package junitTesting.services;

import junitTesting.exceptions.InvalidListException;

public class TestBiggestNumber {
	public int getBiggest(int[] list) {
		if (list == null)
			throw new InvalidListException("The list shouldn't be null");
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < list.length; i++) {
			if (list[i] > max)
				max = list[i];
		}
		return max;
	}
}
