package com.njwb.zuoye2.oop2;

import java.util.Scanner;

/**
 * 测试类
 * 
 * @author Administrator
 * 
 */
public class Test {
	public static void main(String[] args) {
		String no = null;// 车牌
		String brand;// 种类:轿车or客车
		String myType;
		String type;// 类型

		int days;// 租赁天数
		int money = 0,seatcount;

		Scanner in = new Scanner(System.in);
		System.out.println("--------欢迎来到汽车租赁公司----------");
		System.out.println("请选择租赁的天数:");
		days = in.nextInt();
		System.out.println("请输入要租赁的车的类型(输入：1or2-->1.轿车 2.客车):");
		myType = in.next();
		if ("1".equals(myType)) {// 轿车:宝马 别克
			System.out.println("请输入要租赁的轿车的品牌：1.宝马or2.别克 : ");
			brand = in.next();
			// 判断
			if ("1".equals(brand)) {
				System.out.println("租赁的车品牌为：1 宝马550 i");
			} else {
				System.out.println("2.商务仓GL8  3.林荫大道");
				System.out.println("选择型号:");
				myType=in.next();
			}
			
			type = in.next();// 型号
			no = "苏A11111111";// 车牌
			Car car = new Car(no, brand, type);// 创建对象
			
			money = car.caleRent(days);
		} else {// 客车
			System.out.println("请选择品牌：1.金杯  2.金龙");
			brand=in.next();
			System.out.println("请输入座位数：");
			seatcount=in.nextInt();
			no="苏B2222222";
			Bus bus=new Bus(no, brand, seatcount);
			
			money=bus.caleRent(days);
		}

		
		System.out.println("租的天数为："+days+"总租金为：" + money);
		System.out.println("-------欢迎!下次再来----------");
	}
}
