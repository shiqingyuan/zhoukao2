package com.sqy.util.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sqy.util.RandNumUtil;

public class RandNumUtilTest {

	@Test
	public void testGetValue() {
		for (int i = 0; i < 100; i++) {
			double value = RandNumUtil.getValue(10000, 30000, 2);
			System.out.println(value);
		}
		
	}

	@Test
	public void testRandom() {
		for (int i = 0; i < 50; i++) {
			int j = RandNumUtil.random(1, 5);
			System.out.println(j);
		}
		
	}

}
