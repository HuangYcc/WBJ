package com.njwb.zuoye3.ex2;


public class TestRent {
    public static void main(String[] args) {
        int days;// ��������
        int totalRent;// �����޷���
        //1���ͻ����޵Ķ���������Ϣ����������
        MotoVehicle motos[] = new MotoVehicle[5];
        
        motos[0] = new Car("��A11111", "����", "550 i");
		motos[1] = new Car("��A22222", "����", "550 i");
		motos[2] = new Car("��A33333", "���", "������");
		motos[3] = new Bus("��A44444", "����", 34);
        motos[4] = new Truck("��GD56577", "���", 30);
        days = 5;
        //2�����������޷���
        Customer customer= new Customer("123456", "����");
        totalRent = customer.calcTotalRent(motos, days);
        // ����ͻ������������޷���
        System.out.println("�����ƺ�\t\t����Ʒ��");
        for(int i=0;i<motos.length;i++){
            System.out.println(motos[i].getNo()+"\t\t"+motos[i].getBrand());
        }
        System.out.println("\n�ͻ�����" + customer.getName()+"����������:"+days
                + "�������ܷ���:" + totalRent+"��");
    }
}

