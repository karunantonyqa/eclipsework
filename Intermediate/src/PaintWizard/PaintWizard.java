package PaintWizard;

import java.util.ArrayList;

public class PaintWizard {
	
	static ArrayList<Paint> paints = new ArrayList<Paint>();
	static CheapoMax cheapoMax = new CheapoMax(20, 19.99, 10);
	static AverageJoes averageJoes = new AverageJoes(15, 17.99, 11);
	static DuluxPaints duluxPaints = new DuluxPaints(10, 25, 20);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<Paint> paints = new ArrayList<Paint>();
		
		paints.add(cheapoMax);
		paints.add(averageJoes);
		paints.add(duluxPaints);
		
		System.out.println(calCheapestPaint(2000));

	}
	
	public static double calCheapCost(int coverage) {
		double price=0;
		
		
		int totalArea = cheapoMax.getCoverage()*cheapoMax.getVolume(); //calculate max paint area for 1 tin
		//System.out.println(totalArea);
		float totalTins = coverage/totalArea; // calculate how many tins needed
		//System.out.println(totalTins);
		double totalCost = totalTins*cheapoMax.getPrice();
		//System.out.println(totalCost);
		price = totalCost;
			
		
		return price;
		
	}
	
	public static double calAverageCost(int coverage) {
		double price=0;
		
		
		int totalArea = averageJoes.getCoverage()*averageJoes.getVolume(); //calculate max paint area for 1 tin
		//System.out.println(totalArea);
		float totalTins = coverage/totalArea; // calculate how many tins needed
		//System.out.println(totalTins);
		double totalCost = totalTins*averageJoes.getPrice();
		//System.out.println(totalCost);
		price = totalCost;
			
		
		return price;
		
	}
	
	public static double calDuluxCost(int coverage) {
		double price=0;
		
		
		int totalArea = duluxPaints.getCoverage()*duluxPaints.getVolume(); //calculate max paint area for 1 tin
		//System.out.println(totalArea);
		float totalTins = coverage/totalArea; // calculate how many tins needed
		//System.out.println(totalTins);
		double totalCost = totalTins*duluxPaints.getPrice();
		//System.out.println(totalCost);
		price = totalCost;
			
		
		return price;
		
	}
	
	public static double calCheapestPaint(int coverage) {
		double price=0;
		
		double cheap = calCheapCost(coverage);
		double average = calAverageCost(coverage);
		double dulux = calDuluxCost(coverage);
		
		double cheapest = Math.min(cheap, average);
		cheapest = Math.min(cheapest, dulux);
		
		return cheapest;
	}
	
	
	
	

}
