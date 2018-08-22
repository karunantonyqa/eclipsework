package PaintWizard;

public class Paint {
	
	int volume;
	double price;
	int coverage;
	
	public Paint(int volume, double price, int coverage) {
		this.volume = volume;
		this.price = price;
		this.coverage = coverage;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getCoverage() {
		return coverage;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}
	
	

}
