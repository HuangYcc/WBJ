package com.njwb.zuoye3.ex2;

/**
 * ���ࣺ������
 * 
 * @author Administrator
 * 
 */
public abstract class MotoVehicle {
	String no;// ����
	String brand;// ����

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

	// �������
	public abstract int caleRent(int days);
}
