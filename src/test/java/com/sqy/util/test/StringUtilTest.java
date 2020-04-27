package com.sqy.util.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sqy.util.StringUtil;

public class StringUtilTest {

	@Test
	public void testGetZHString() {
		String string = StringUtil.getZHString(2);
		System.out.println(string);
	}

	@Test
	public void testGetZHName() {
		String name = StringUtil.getZHName();
		System.out.println(name);
	}

}
