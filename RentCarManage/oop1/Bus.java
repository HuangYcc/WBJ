package com.njwb.zuoye2.oop1;
/**
 * ���ࣺ�ͳ���
 * 
 * @author Administrator
 * 
 */
public class Bus{
	//1.����˽�л�
	private String no;
	private String brand;
	private int seatcount;
	public Bus() {
		super();
	}
	public Bus(String no, String brand, int seatcount) {
		super();
		this.no = no;
		this.brand = brand;
		this.seatcount = seatcount;
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
	public int getSeatcount() {
		return seatcount;
	}
	public void setSeatcount(int seatcount) {
		this.seatcount = seatcount;
	}
	@Override
	public String toString() {
		return "Bus [no=" + no + ", brand=" + brand + ", seatcount="
				+ seatcount + "]";
	}
	//�������
	public int caleRent(int days){
		System.out.println("ѡ�ĳ���Ϊ��"+getBrand()+"���ƺ�Ϊ��"+getNo()+"��λ��Ϊ:"+getSeatcount());
		 if (seatcount>16) {
			return 1500*days;
		} else {
			return 800*days;
		}
	}
	
	
}
