package com.njwb.zuoye2.oop;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * ���ࣺ����
 * @author Administrator
 *
 */
public abstract class Vehicle {
	private String carID;//����
	private String brand;//����
	private double perRent;//�����
	
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
	//�вι���
	public Vehicle(String carID,String brand,double perRent){
		this.carID=carID;
		this.brand=brand;
		this.perRent=perRent;
	}
	
	public abstract double countRentMoney(int days);
}
