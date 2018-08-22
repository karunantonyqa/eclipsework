package Motors;

public class Truck extends Vehicle {

	private int wheels;
	private int repairCost = 200;


	public Truck(int id, String name, int repairCost, int wheels, String type) {
		super(id, name, type);
		this.wheels = wheels;
		// TODO Auto-generated constructor stub
	}
	
	public double calRepairCost(int repairCost, int wheels) {
		double totalCost = repairCost*wheels;
		return totalCost;
	}
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public int getWheels() {
		return wheels;
	}

}
