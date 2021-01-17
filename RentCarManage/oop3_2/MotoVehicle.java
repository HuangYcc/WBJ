package com.njwb.zuoye3.ex2;

/**
 * 父类：抽象类
 * 
 * @author Administrator
 * 
 */
public abstract class MotoVehicle {
	String no;// 车牌
	String brand;// 车型

	String getNo() {
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

	public MotoVehicle() {
		super();
	}

	public MotoVehicle(String no, String brand) {
		super();
		this.no = no;
		this.brand = brand;
	}

	// 计算租金
	public abstract int caleRent(int days);
}
