package com.njwb.zuoye2.oop2;

import java.util.Scanner;

/**
 * ������
 * 
 * @author Administrator
 * 
 */
public class Test {
	public static void main(String[] args) {
		String no = null;// ����
		String brand;// ����:�γ�or�ͳ�
		String myType;
		String type;// ����

		int days;// ��������
		int money = 0,seatcount;

		Scanner in = new Scanner(System.in);
		System.out.println("--------��ӭ�����������޹�˾----------");
		System.out.println("��ѡ�����޵�����:");
		days = in.nextInt();
		System.out.println("������Ҫ���޵ĳ�������(���룺1or2-->1.�γ� 2.�ͳ�):");
		myType = in.next();
		if ("1".equals(myType)) {// �γ�:���� ���
			System.out.println("������Ҫ���޵Ľγ���Ʒ�ƣ�1.����or2.��� : ");
			brand = in.next();
			// �ж�
			if ("1".equals(brand)) {
				System.out.println("���޵ĳ�Ʒ��Ϊ��1 ����550 i");
			} else {
				System.out.println("2.�����GL8  3.������");
				System.out.println("ѡ���ͺ�:");
				myType=in.next();
			}
			
			type = in.next();// �ͺ�
			no = "��A11111111";// ����
			Car car = new Car(no, brand, type);// ��������
			
			money = car.caleRent(days);
		} else {// �ͳ�
			System.out.println("��ѡ��Ʒ�ƣ�1.��  2.����");
			brand=in.next();
			System.out.println("��������λ����");
			seatcount=in.nextInt();
			no="��B2222222";
			Bus bus=new Bus(no, brand, seatcount);
			
			money=bus.caleRent(days);
		}

		
		System.out.println("�������Ϊ��"+days+"�����Ϊ��" + money);
		System.out.println("-------��ӭ!�´�����----------");
	}
}
