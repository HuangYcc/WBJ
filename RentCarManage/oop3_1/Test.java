package com.njwb.zuoye3.ex1;

import java.util.Scanner;
/**
 * 测试类:循环
 * @author Administrator
 *
 */
public class Test {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int days, seatcount, money;// 天数、座位数、租金
		String no = null, brand, type;
		int allMoney=0;
		Scanner in = new Scanner(System.in);
		System.out.println("-------欢迎来到汽车租赁公司----------");
		
		System.out.println("是否开始租赁:");
		String isBegin=in.next();
		if("y".equalsIgnoreCase(isBegin)){
		
		System.out.println("输入租赁的天数：");
		days = in.nextInt();
		String isContinue;
			System.out.println("请选择租赁的车的品牌：1.轿车 2。客车");
			String myType = in.next();
			if ("1".equals(myType)) {// 轿车
				System.out.println("请输入轿车的品牌：1.宝马 2.别克 :");
				brand = in.next();
				if ("1".equals(brand)) {
					System.out.println("租赁的轿车品牌为:1.宝马 550 i");
					no = "苏A11111";
				} else {
					System.out.println("选择租赁的别克品牌:2.商务舱  3.林荫大道:");
					myType = in.next();
				}
				type = in.next();
				Car car = new Car(no, brand, type);
				money = car.caleRent(days);

			} else { // 客车
				System.out.println("请选择客车品牌:1.金杯  2.金龙:");
				brand = in.next();
				System.out.println("请选择座位数:");
				seatcount = in.nextInt();
				Bus bus = new Bus(no, brand, seatcount);
				no = "苏B444444";
				money = bus.caleRent(days);

			}
			allMoney+=money;
			System.out.println("总租金为:"+allMoney);
			
		}
		System.out.println("是否继续租赁:");
		String iscontinue = in.next();
		while("y".equalsIgnoreCase(iscontinue)){
			RentVehicle rentVehicle  =new RentVehicle();
			rentVehicle.startRent();
			
					
		}
	}
	
}
