package com.njwb.zuoye2.oop;

import com.njwb.zuoye2.oop.Bus;
import com.njwb.zuoye2.oop.Car;
import com.njwb.zuoye2.oop.Vehicle;

;

/**
 * 车辆操作,汽车业务类
 * 
 * @author Administrator
 * 
 */
public class VehicleOperation {
	Vehicle vehicles[] = new Vehicle[7];

	// 车辆初始化
	public void init() {
		vehicles[0] = new Car("A4", "奥迪", 800, "A4");
		vehicles[1] = new Car("A6", "奥迪", 1200, "A6");
		vehicles[2] = new Car("A8", "奥迪", 2000, "A8");

		vehicles[3] = new Bus("JB", "金杯", 1000, 16);
		vehicles[4] = new Bus("JL", "宝龙", 1800, 34);
		vehicles[5] = new Bus("JB", "金杯", 1000, 16);
		vehicles[6] = new Bus("JB", "金龙", 1800, 34);
	}

	// 租车操作
	public Vehicle rentVehicle(String brand, int seatCounts, String type) {
		Vehicle v = null;
		for (Vehicle vehicle : vehicles) {
			if (vehicle instanceof Car) {
				Car car = (Car) vehicle;
				if (car.getBrand().equalsIgnoreCase(brand)
						&& car.getType().equals(type)) {
					v = car;
					break;
				}
			} else if (vehicle instanceof Bus) {
				Bus bus = (Bus) vehicle;
				if (bus.getBrand().equals(brand)
						&& bus.getSeatCount() == seatCounts) {
					v = bus;
					break;
				}
			}
		}
		return v;
	}
}
