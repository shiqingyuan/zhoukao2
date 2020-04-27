package com.sqy.util.test;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
/**
 * 
 * @ClassName: TPS 
 * @Description: TPS服务实体
 * @author: HUAWEI
 * @date: 2020年4月27日 上午8:51:52
 */
public class TPS {
	//id
	private BigInteger id;
	//专家姓名
	private String name;
	//年龄
	private Integer age;
	//薪酬
	private BigDecimal emolument;
	//聘用日期
	private Date date;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public BigDecimal getEmolument() {
		return emolument;
	}
	public void setEmolument(BigDecimal emolument) {
		this.emolument = emolument;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "TPS [id=" + id + ", name=" + name + ", age=" + age + ", emolument=" + emolument + ", date=" + date
				+ "]";
	}
	public TPS(BigInteger id, String name, Integer age, BigDecimal emolument, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.emolument = emolument;
		this.date = date;
	}
	public TPS() {
		super();
	}
	
	
}
