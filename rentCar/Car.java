package com.njwb.zuoye2.oop;
/**
 * 子类：汽车
 * @author Administrator
 *
 */
public class Car extends Vehicle {
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Car(String carID, String brand, double perRent,String type) {
		super(carID, brand, perRent);
        this.type=type;
	}
	
	@Override
	public double countRentMoney(int days){
		double price;//没有折扣
		price= (int)this.getPerRent()*days;
		return price;
	}
	
}