package Motors;

public class Car extends Vehicle {

	private double engineSize;
	private int repairCost = 100;


	public Car(int id, String name, double engineSize, String type) {
		super(id, name, type);
		this.engineSize = engineSize;
		// TODO Auto-generated constructor stub
	}
	
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	
	public double getEngineSize() {
		return engineSize;
	}

public double calRepairCost(int repairCost, double engineSize) {
		double totalCost = repairCost*engineSize;
		return totalCost;
	}
	

}
