	package com.njwb.zuoye3.ex1;

/**
 * 子类：客车类
 * 
 * @author Administrator
 * 
 */
public class Bus extends MotoVehicle {
	private int seatcount;// 座位数

	
	
	public int getSeatcount() {
		return seatcount;
	}

	public void setSeatcount(int seatcount) {
		this.seatcount = seatcount;
	}

	// 构造函数
	public Bus() {
		super();
	}

	public Bus(String no, String brand, int seatcount) {
		super(no, brand);
		this.seatcount = seatcount;
	}

	@Override
	public int caleRent(int days) {
		System.out.println("选的车型为：" + getBrand() + "车牌号为：" + getNo() + "座位数为:"
				+ getSeatcount());
		if (seatcount > 16) {
			return 1500 * days;
		} else {
			return 800 * days;
		}
	}


}
