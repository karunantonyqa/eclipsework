package Motors;

public class Vehicle {
	
	private int id;
	private String name;
	private int repairCost = 100;
	protected static String type;

	public Vehicle(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRepairCost(int repairCost) {
		this.repairCost = repairCost;
	}
	
	public void setType(String type) {
		this.type=type;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRepairCost() {
		return repairCost;
	}
	
	public String getType() {
		return type;
	}

	public int calRepairCost(int repairCost) {
		
		return repairCost;
	}

}
