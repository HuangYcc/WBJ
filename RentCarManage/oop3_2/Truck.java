package com.njwb.zuoye3.ex2;

/**
 * 子类:卡车类
 * 
 * @author Administrator
 * 
 */
public class Truck extends MotoVehicle{
	int tonnage;//吨位
	
	public Truck() {

	}
	
	public  Truck(String no,String brand,int tonnage) {
		super(no, brand);
		this.tonnage = tonnage;
	}
	
	public int getTonnage() {
		return tonnage;
	}

	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	@Override
	public int caleRent(int days) {
		return tonnage*50*days;
	}

}
