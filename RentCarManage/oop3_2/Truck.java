package com.njwb.zuoye3.ex2;

/**
 * ����:������
 * 
 * @author Administrator
 * 
 */
public class Truck extends MotoVehicle{
	int tonnage;//��λ
	
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
