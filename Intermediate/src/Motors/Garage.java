package Motors;

import java.util.ArrayList;

public class Garage {
	
	static ArrayList<Vehicle> garage = new ArrayList<Vehicle>();

	public static void main(String[] args) {

		Car car1 = new Car(1, "Tesla", 2.0, "Car");
		Truck truck1 = new Truck(2, "Volvo", 200, 8, "Truck");
		Motorbike mb1 = new Motorbike(3, "Ducati", 150, 250, "Motorbike");
		
		garage.add(car1);
		garage.add(truck1);
		garage.add(mb1);
		
		double car1Cost = car1.calRepairCost(car1.getRepairCost(), car1.getEngineSize());
		System.out.println(car1Cost);
		
		double truck1Cost = truck1.calRepairCost(truck1.getRepairCost(), truck1.getWheels());
		System.out.println(truck1Cost);
		
		double mb1Cost = mb1.calRepairCost(mb1.getRepairCost(), mb1.getCC());
		System.out.println(mb1Cost);
	}
	
	
	public void addVehicle(Vehicle v) {
		garage.add(v);
	}
	
	public void removeVehicle(Vehicle v) {
		garage.remove(v);
	}
	
	public void emptyGarage() {
		garage.removeAll(garage);
	}

}
