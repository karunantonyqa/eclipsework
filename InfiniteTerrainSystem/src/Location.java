
public class Location {
	
	String locationName = null;
	static int locPositionX;
	static int locPositionY;
	String locationMessage = null;
	int locationAttack = 0;
	int locationHeal = 0;

	public Location(String locationName, int locationAttack, int locationHeal, String locationMessage, int locPositionX, int locPositionY) {
		this.locationName=locationName;
		this.locationAttack=locationAttack;
		this.locationHeal=locationHeal;
		this.locationMessage=locationMessage;
		this.locPositionX=locPositionX;
		this.locPositionY=locPositionY;
		
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getMessage() {
		return locationMessage;
	}

	public void setMessage(String message) {
		this.locationMessage = message;
	}

	public int getLocationAttack() {
		return locationAttack;
	}

	public void setLocationAttack(int locationAttack) {
		this.locationAttack = locationAttack;
	}

	public int getLocationHeal() {
		return locationHeal;
	}

	public void setLocationHeal(int locationHeal) {
		this.locationHeal = locationHeal;
	}
	
	public void attack(Player p) {
		p.setPlayerHealth(p.getPlayerHealth()-getLocationAttack());
	}
	
	public void heal(Player p) {
		p.setPlayerHealth(p.getPlayerHealth()-getLocationHeal());
	}

	public static int getLocPositionX() {
		return locPositionX;
	}

	public static void setLocPositionX(int locPositionX) {
		Location.locPositionX = locPositionX;
	}

	public static int getLocPositionY() {
		return locPositionY;
	}

	public static void setLocPositionY(int locPositionY) {
		Location.locPositionY = locPositionY;
	}

	public String getLocationMessage() {
		return locationMessage;
	}

	public void setLocationMessage(String locationMessage) {
		this.locationMessage = locationMessage;
	}

}
