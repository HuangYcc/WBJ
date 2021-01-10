package com.njwb.zuoye2.oop;

import java.util.Scanner;

//import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class VehicleRent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VehicleOperation vehicleOperation = new VehicleOperation();
		System.out.println("*****欢迎来到某汽车租赁公司******");
		System.out.println("请选择要租的类型:1.汽车 2.客车");
		int typecase = input.nextInt();
		String brand = "";
		String type = "" ;
		int seatCount = 0;
		switch (typecase) {
		case 1:
			System.out.println("您的选择为汽车！");
			System.out.println("请选择汽车的品牌1.奥迪A4 2.奥迪A6 3.奥迪A8");
			int choose = input.nextInt();
			if (choose == 1) {
				brand = "奥迪A4";
			} else if (choose == 2) {
				brand = "奥迪A6";
			} else {
				brand = "奥迪A8";
			}
			break;
		case 2:
			System.out.println("您的选择为客车！");
			System.out.println("请选择客车的品牌：1.金杯 2.金龙");
			int choose1 = input.nextInt();
			if (choose1 == 1) {
				brand = "金杯";
				System.out.println("请选择您想要的座位数：1.16 2.34");
				seatCount = (input.nextInt() == 1) ? 16 : 34;
			} else if (choose1 == 2) {
				brand = "金龙";
				System.out.println("请选择您想要的座位数：1.16 2.34");
				seatCount = (input.nextInt() == 1) ? 16 : 34;
			}
			break;
		default:
			System.out.println("抱歉，暂时没有该类的车！！！");
			System.out.println("请重新选择:");
			break;
		}

		vehicleOperation.init();
		Vehicle v = vehicleOperation.rentVehicle(brand, seatCount, type);
		System.out.print("请输入要租赁的天数:");
		int days = input.nextInt();
		double price = v.countRentMoney(days);

		System.out.println("您的选择车位" + v.getBrand());
		System.out.println("您的租车所需费用为：" + price);
	}
}
