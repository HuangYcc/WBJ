package com.njwb.zuoye3.ex1;

import java.util.Scanner;

/**
 * �⳵����
 * @author Administrator
 *
 */
public class RentVehicle {
	//��ʼ�⳵
	public static void startRent() {
		int days = 0, seatcount, money;// ��������λ�������
		String no = null, brand, type;
		Scanner in = new Scanner(System.in);
		System.out.println("��ѡ�����޵ĳ���Ʒ�ƣ�1.�γ� 2���ͳ�");
		String myType = in.next();
		if ("1".equals(myType)) {// �γ�
			System.out.println("������γ���Ʒ�ƣ�1.���� 2.��� :");
			brand = in.next();
			if ("1".equals(brand)) {
				System.out.println("���޵Ľγ�Ʒ��Ϊ:1.���� 550 i");
				no = "��A11111";
			} else {
				System.out.println("ѡ�����޵ı��Ʒ��:2.�����  3.������:");
				myType = in.next();
			}
			type = in.next();
			Car car = new Car(no, brand, type);
			money = car.caleRent(days);

		} else { // �ͳ�
			System.out.println("��ѡ��ͳ�Ʒ��:1.��  2.����:");
			brand = in.next();
			System.out.println("��ѡ����λ��:");
			seatcount = in.nextInt();
			Bus bus = new Bus(no, brand, seatcount);
			no = "��B444444";
			money = bus.caleRent(days);
		}

	}

}
