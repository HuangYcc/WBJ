package com.njwb.zuoye2.oop;
/**
 * 子类：客车
 * @author Administrator
 *
 */
public class Bus extends Vehicle{
	private int seatCount;
	
	
	public int getSeatCount() {
		return seatCount;
	}


	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}


	public Bus(String carID, String brand, double perRent,int seatCount) {
		super(carID, brand, perRent);
		this.seatCount=seatCount;
	}
	
	public double countRentMoney(int days){
		double price;//有折扣
		if(days<45){
			price=1000;
		}else{
			price=1800;
		}
		price=this.getPerRent()*days;
		return price;
	}
	
}
