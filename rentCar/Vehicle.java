package com.njwb.zuoye2.oop;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * 父类：车辆
 * @author Administrator
 *
 */
public abstract class Vehicle {
	private String carID;//车类
	private String brand;//车型
	private double perRent;//日租金
	
	public String getCarID() {
		return carID;
	}
	public void setCarID(String carID) {
		this.carID = carID;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPerRent() {
		return perRent;
	}
	public void setPerRent(Double perRent) {
		this.perRent = perRent;
	}
	
	public Vehicle(){
		
	}
	//有参构造
	public Vehicle(String carID,String brand,double perRent){
		this.carID=carID;
		this.brand=brand;
		this.perRent=perRent;
	}
	
	public abstract double countRentMoney(int days);
}
