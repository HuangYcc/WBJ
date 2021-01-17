package com.njwb.zuoye3.ex2;

/**
 * 子类：汽车类
 * 
 * @author Administrator
 * 
 */
public class Car extends MotoVehicle {
	private String type;// 类型

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
		System.out.println("选的车型为：" + getBrand() + "车牌号为：" + getNo() + "类型为:"
				+ getType());
		if ("1".equals(type)) {// 宝马550 i
			return 500 * days;
		} else if ("2".equals(type)) {// 别克 GL8
			return 600 * days;
		} else { // 别克林荫大道
			return 300 * days;
		}
	}

}
