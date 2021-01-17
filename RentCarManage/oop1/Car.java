package com.njwb.zuoye2.oop1;

/**
 * 子类：轿车类
 * 
 * @author Administrator
 * 
 */
public class Car {
	// 1.属性私有化
	private String no; // 车牌
	private String brand; // 种类
	private String type; // 车型

	// 构造方法
	// 无参
	public Car() {
		super();
	}

	// 有参
	public Car(String no, String brand, String type) {
		super();
		this.no = no;
		this.brand = brand;
		this.type = type;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [no=" + no + ", brand=" + brand + ", type=" + type + "]";
	}

	// 计算租金
	public int caleRent(int days) {
		System.out.println("选的车型为："+getBrand()+"车牌号为："+getNo()+"类型为:"+getType());
		if ("1".equals(type)) {// 宝马550 i
			return 500 * days;
		} else if ("2".equals(type)) {// 别克 GL8
			return 600 * days;
		} else { // 别克林荫大道
			return 300 * days;
		}
	}

}
