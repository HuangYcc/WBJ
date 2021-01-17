package com.njwb.zuoye2.oop1;

/**
 * ���ࣺ�γ���
 * 
 * @author Administrator
 * 
 */
public class Car {
	// 1.����˽�л�
	private String no; // ����
	private String brand; // ����
	private String type; // ����

	// ���췽��
	// �޲�
	public Car() {
		super();
	}

	// �в�
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

	// �������
	public int caleRent(int days) {
		System.out.println("ѡ�ĳ���Ϊ��"+getBrand()+"���ƺ�Ϊ��"+getNo()+"����Ϊ:"+getType());
		if ("1".equals(type)) {// ����550 i
			return 500 * days;
		} else if ("2".equals(type)) {// ��� GL8
			return 600 * days;
		} else { // ���������
			return 300 * days;
		}
	}

}
