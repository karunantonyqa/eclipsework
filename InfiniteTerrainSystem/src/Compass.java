
public class Compass {
	
	int[][] position = new int[10][10];
	String lastPosition= null;
	String nextPosition =null;
	static int compPositionX;
	static int compPositionY;
	private Player p;

	public Compass(Player p, int compPositionX, int compPositionY) {
		this.p=p;
		this.compPositionX=compPositionX;
		this.compPositionY=compPositionY;
	}

	public int[][] getPosition() {
		return position;
	}

	public void setPosition(int[][] position) {
		this.position = position;
	}

	public String getLastPosition() {
		return lastPosition;
	}

	public void setLastPosition(String lastPosition) {
		this.lastPosition = lastPosition;
	}

	public String getNextPosition() {
		return nextPosition;
	}

	public void setNextPosition(String nextPosition) {
		this.nextPosition = nextPosition;
	}

	public Player getP() {
		return p;
	}

	public void setP(Player p) {
		this.p = p;
	}

	public static int getCompPositionX() {
		return compPositionX;
	}

	public static void setCompPositionX(int compPositionX) {
		Compass.compPositionX = compPositionX;
	}

	public static int getCompPositionY() {
		return compPositionY;
	}

	public static void setCompPositionY(int compPositionY) {
		Compass.compPositionY = compPositionY;
	}
	
	public double getDistanceToTreasure(Player p) {
		double distance=0;
		
		double playerX = p.getPlayerPositionX();
		double playerY = p.getPlayerPositionY();
		
		double distX = (1 - playerX);
		double distY = (8 - playerY);
		
		distance = Math.sqrt((distX*distX)+(distY*distY));
		
		return distance;
	}

}
