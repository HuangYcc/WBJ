package com.njwb.zuoye2.oop;

import java.util.Scanner;

//import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class VehicleRent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VehicleOperation vehicleOperation = new VehicleOperation();
		System.out.println("*****��ӭ����ĳ�������޹�˾******");
		System.out.println("��ѡ��Ҫ�������:1.���� 2.�ͳ�");
		int typecase = input.nextInt();
		String brand = "";
		String type = "" ;
		int seatCount = 0;
		switch (typecase) {
		case 1:
			System.out.println("����ѡ��Ϊ������");
			System.out.println("��ѡ��������Ʒ��1.�µ�A4 2.�µ�A6 3.�µ�A8");
			int choose = input.nextInt();
			if (choose == 1) {
				brand = "�µ�A4";
			} else if (choose == 2) {
				brand = "�µ�A6";
			} else {
				brand = "�µ�A8";
			}
			break;
		case 2:
			System.out.println("����ѡ��Ϊ�ͳ���");
			System.out.println("��ѡ��ͳ���Ʒ�ƣ�1.�� 2.����");
			int choose1 = input.nextInt();
			if (choose1 == 1) {
				brand = "��";
				System.out.println("��ѡ������Ҫ����λ����1.16 2.34");
				seatCount = (input.nextInt() == 1) ? 16 : 34;
			} else if (choose1 == 2) {
				brand = "����";
				System.out.println("��ѡ������Ҫ����λ����1.16 2.34");
				seatCount = (input.nextInt() == 1) ? 16 : 34;
			}
			break;
		default:
			System.out.println("��Ǹ����ʱû�и���ĳ�������");
			System.out.println("������ѡ��:");
			break;
		}

		vehicleOperation.init();
		Vehicle v = vehicleOperation.rentVehicle(brand, seatCount, type);
		System.out.print("������Ҫ���޵�����:");
		int days = input.nextInt();
		double price = v.countRentMoney(days);

		System.out.println("����ѡ��λ" + v.getBrand());
		System.out.println("�����⳵�������Ϊ��" + price);
	}
}
