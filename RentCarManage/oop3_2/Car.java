package com.njwb.zuoye3.ex2;

/**
 * ���ࣺ������
 * 
 * @author Administrator
 * 
 */
public class Car extends MotoVehicle {
	private String type;// ����

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Car() {
		super();
	}

	public Car(String no, String brand, String type) {
		super(no, brand);
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", no=" + no + ", brand=" + brand + "]";
	}

	@Override
	public int caleRent(int days) {
		System.out.println("ѡ�ĳ���Ϊ��" + getBrand() + "���ƺ�Ϊ��" + getNo() + "����Ϊ:"
				+ getType());
		if ("1".equals(type)) {// ����550 i
			return 500 * days;
		} else if ("2".equals(type)) {// ��� GL8
			return 600 * days;
		} else { // ���������
			return 300 * days;
		}
	}

}
