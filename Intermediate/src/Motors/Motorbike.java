package Motors;

public class Motorbike extends Vehicle {

	private int cc;
	private int repairCost = 150;


	public Motorbike(int id, String name, int repairCost, int cc, String type) {
		super(id, name, type);
		this.cc = cc;
		// TODO Auto-generated constructor stub
	}
	
	public double calRepairCost(int repairCost, int cc) {
		double totalCost = (repairCost*cc)/10;
		return totalCost;
	}
	
	public void setCC(int cc) {
		this.cc = cc;
	}
	
	public int getCC() {
		return cc;
	}

}
