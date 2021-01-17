package com.njwb.zuoye3.ex1;

/**
 * 顾客类 1、在测试类中，创建车的对象，放在数组中 2、新建一个顾客类，在其中添加一个calcTotalRent(MotoVehile[]
 * motos,int days)，循环调用calcRent()方法，计算总租金
 * 
 * @author Administrator
 * 
 */
public class Customer {
	String id;// 客户编号
	String name;// 客户姓名

	// 构造
	public Customer(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 计算多辆汽车租赁总价格
	 */

	public int calcTotalRent(MotoVehicle moto[], int days) {
		int sum = 0;
		for (int i = 0; i < moto.length; i++) {
			sum += moto[i].caleRent(days);
		}
		return sum;
	}

}
