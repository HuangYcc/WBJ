	package com.njwb.zuoye3.ex1;

/**
 * ���ࣺ�ͳ���
 * 
 * @author Administrator
 * 
 */
public class Bus extends MotoVehicle {
	private int seatcount;// ��λ��

	
	
	public int getSeatcount() {
		return seatcount;
	}

	public void setSeatcount(int seatcount) {
		this.seatcount = seatcount;
	}

	// ���캯��
	public Bus() {
		super();
	}

	public Bus(String no, String brand, int seatcount) {
		super(no, brand);
		this.seatcount = seatcount;
	}

	@Override
	public int caleRent(int days) {
		System.out.println("ѡ�ĳ���Ϊ��" + getBrand() + "���ƺ�Ϊ��" + getNo() + "��λ��Ϊ:"
				+ getSeatcount());
		if (seatcount > 16) {
			return 1500 * days;
		} else {
			return 800 * days;
		}
	}


}
