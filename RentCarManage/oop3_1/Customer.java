package com.njwb.zuoye3.ex1;

/**
 * �˿��� 1���ڲ������У��������Ķ��󣬷��������� 2���½�һ���˿��࣬���������һ��calcTotalRent(MotoVehile[]
 * motos,int days)��ѭ������calcRent()���������������
 * 
 * @author Administrator
 * 
 */
public class Customer {
	String id;// �ͻ����
	String name;// �ͻ�����

	// ����
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
	 * ����������������ܼ۸�
	 */

	public int calcTotalRent(MotoVehicle moto[], int days) {
		int sum = 0;
		for (int i = 0; i < moto.length; i++) {
			sum += moto[i].caleRent(days);
		}
		return sum;
	}

}
