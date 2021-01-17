package com.njwb.zuoye3.ex2;


public class TestRent {
    public static void main(String[] args) {
        int days;// 租赁天数
        int totalRent;// 总租赁费用
        //1、客户租赁的多辆汽车信息及租赁天数
        MotoVehicle motos[] = new MotoVehicle[5];
        
        motos[0] = new Car("京A11111", "宝马", "550 i");
		motos[1] = new Car("京A22222", "宝马", "550 i");
		motos[2] = new Car("京A33333", "别克", "林荫大道");
		motos[3] = new Bus("京A44444", "金龙", 34);
        motos[4] = new Truck("京GD56577", "解放", 30);
        days = 5;
        //2、计算总租赁费用
        Customer customer= new Customer("123456", "张三");
        totalRent = customer.calcTotalRent(motos, days);
        // 输出客户姓名和总租赁费用
        System.out.println("汽车牌号\t\t汽车品牌");
        for(int i=0;i<motos.length;i++){
            System.out.println(motos[i].getNo()+"\t\t"+motos[i].getBrand());
        }
        System.out.println("\n客户名：" + customer.getName()+"，租赁天数:"+days
                + "，租赁总费用:" + totalRent+"。");
    }
}

