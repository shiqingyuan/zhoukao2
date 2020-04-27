package com.sqy.util.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sqy.util.RandNumUtil;

public class RandNumUtilTest {

	@Test
	public void testGetValue() {
		for (int i = 0; i < 100; i++) {
			double value = RandNumUtil.getValue(30000, 50000, 2);
			System.out.println(value);
		}
		
	}

	@Test
	public void testRandom() {
		
		int i = RandNumUtil.random(1, 3);
		System.out.println(i);
	}

}
