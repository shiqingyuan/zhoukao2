package com.sqy.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

public class RandNumUtil {

	//方法1：获得指定范围的随机小数,精度scale表示小数点后位数，举例min为25400.56,max为67078.94,返回小数点后2位的min和max之间的数，比如48545.87（8分）
	public static double getValue(double min, double max, int scale){
		//获取一个随机小数
		Random random = new Random();
		double nextDouble = random.nextDouble();
		//		nextDouble * (max -min) + min 获取一个最大值与最小值之间的随即小数
		//格式化
		DecimalFormat format = new DecimalFormat("#.00");
		String string = format.format(nextDouble * (max -min) + min);
		return Double.valueOf(string);
		
	}
	//方法2：返回min-max之间的随机整数（包含min和不包含max值），例如返回1-3之间的随机数，则返回1或2，不能是其他数值（8分）
	public static int random(int min, int max){
		//判断max是否大于min
		if(min >= max) {
			throw new RuntimeException("输入有误");
		}
		Random random = new Random();
		int i = random.nextInt(max - min) + min;
		
		return i;
	} 

}
