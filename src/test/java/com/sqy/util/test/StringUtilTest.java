package com.sqy.util.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sqy.util.StringUtil;

public class StringUtilTest {

	@Test
	public void testGetZHString() {
		for (int i = 0; i < 10; i++) {
			String string = StringUtil.getZHString(i);
			System.out.println(string);
			
		}
	}

	@Test
	public void testGetZHName() {
		for (int i = 0; i < 100; i++) {
			String name = StringUtil.getZHName();
			System.out.println(name);
			
		}
	}

}
