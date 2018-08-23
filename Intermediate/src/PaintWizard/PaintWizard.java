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
		
		System.out.println(calLeastWastePaint(300));

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
	
	public static String calCheapestPaint(int coverage) {
		double price=0;
		String cheapestString=null;
		
		double cheap = calCheapCost(coverage);
		double average = calAverageCost(coverage);
		double dulux = calDuluxCost(coverage);
		
		double cheapest = Math.min(cheap, average);
		cheapest = Math.min(cheapest, dulux);
		
		if(cheapest == cheap) {
			cheapestString = "The cheapest paint for your room is CheapoMax at: £" + Math.round(cheapest*100)/100;
		} else if(cheapest == average) {
			cheapestString = "The cheapest paint for your room is AverageJoe's at: £" + Math.round(cheapest*100)/100;
		} else {
			cheapestString = "The cheapest paint for your room is DuluxourousPaints at: £" + Math.round(cheapest*100)/100;

		}
		
		return cheapestString;
	}
	
	public static double calCheapoWaste(int coverage) {
		
		float areaCovered = cheapoMax.getVolume()*cheapoMax.getCoverage();
		double tinsNeeded = Math.ceil(coverage/areaCovered);
		double wasteAmount = (tinsNeeded*cheapoMax.getVolume()*cheapoMax.getCoverage())-coverage;
		
		return wasteAmount;
	}
	
	public static double calAverageWaste(int coverage) {
		
		float areaCovered = averageJoes.getVolume()*averageJoes.getCoverage();
		double tinsNeeded = Math.ceil(coverage/areaCovered);
		double wasteAmount = (tinsNeeded*averageJoes.getVolume()*averageJoes.getCoverage())-coverage;
		
		return wasteAmount;
	}

	public static double calDuluxWaste(int coverage) {
	
		float areaCovered = duluxPaints.getVolume()*duluxPaints.getCoverage();
		
		double tinsNeeded = Math.ceil(coverage/areaCovered);
		
		double wasteAmount = (tinsNeeded*duluxPaints.getVolume()*duluxPaints.getCoverage())-coverage;
	
		return wasteAmount;
	}
	
	public static String calLeastWastePaint(int coverage) {
		double leastWaste =0;
		String leastWasteString=null;
		
		double cheapoWaste = calCheapoWaste(coverage);
		System.out.println(cheapoWaste);
		double averageWaste = calAverageWaste(coverage);
		System.out.println(averageWaste);
		double duluxWaste = calDuluxWaste(coverage);
		System.out.println(duluxWaste);
		
		leastWaste = Math.min(cheapoWaste, averageWaste);
		leastWaste = Math.min(leastWaste, duluxWaste);
		
		if(leastWaste == cheapoWaste) {
			leastWasteString = "The least wasteful paint for your room is CheapoMax at: " + Math.round(leastWaste*100)/100;
		} else if(leastWaste == averageWaste) {
			leastWasteString = "The least wasteful paint for your room is AverageJoe's at: " + Math.round(leastWaste*100)/100;
		} else {
			leastWasteString = "The least wasteful paint for your room is DuluxourousPaints at: " + Math.round(leastWaste*100)/100;

		}

		
		return leastWasteString;
	}
	
	
	
	

}
