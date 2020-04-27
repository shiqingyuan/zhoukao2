package com.sqy.util.test;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.sqy.util.DateUtil;
import com.sqy.util.RandNumUtil;
import com.sqy.util.StringUtil;

public class TPSUtilTest {

	@Test
	public void test() {
		//进行100遍循环    循环创建对象
		for (int i = 0; i < 100; i++) {
			TPS tps = new TPS();
			//对TPS.id 进行赋值   id从1开始递增
			tps.setId(BigInteger.valueOf(i+1));
			//专家姓名属性值调用ZHStringUtil的getZHName()
			tps.setName(StringUtil.getZHName());
			
			//年龄属性值调用RandomUtil.random()创建，必须在1-100岁之间
			tps.setAge(RandNumUtil.random(1, 101));
			
			//薪酬是3万到8万，小数点后2位的随机数
			tps.setEmolument(BigDecimal.valueOf(RandNumUtil.getValue(30000, 80000, 2)));
			
			//聘用日期属性值模拟2012年1月1日至今任意随机时间
			Calendar c = Calendar.getInstance();
			c.set(2012, 1, 1);
			Date date = c.getTime();
			Date date2 = DateUtil.random(date, new Date());
			tps.setDate(date2);
			
			//控制台显示效果
			System.out.println(tps);
		}
	}
}
