
public class Player {

	private String playerName;
	private int playerHealth;
	int playerAttack = 15;
	static int playerPositionX=8;
	static int playerPositionY=1;


	public Player(int playerHealth, String playerName, int playerPositionX, int playerPositionY) {
		this.playerName = playerName;
		this.playerHealth = playerHealth;
		this.playerPositionX = playerPositionX;
		this.playerPositionY=playerPositionY;
	}
	
	public void movePlayer(String direction) {
		if(direction.equals("north")) {
			playerPositionY++;
		} else if(direction.equals("south")) {
			playerPositionY--;
		} else if(direction.equals("east")) {
			playerPositionX++;
		} else if(direction.equals("west")) {
			playerPositionX--;
		}
		
	}
	
	public void attack(NPC npc) {
		npc.setNpcHealth(npc.getNpcHealth() - playerAttack);
	}
	
	
	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public int getPlayerHealth() {
		return playerHealth;
	}


	public void setPlayerHealth(int playerHealth) {
		this.playerHealth = playerHealth;
	}


	public int getPlayerPositionX() {
		return playerPositionX;
	}

	public static void setPlayerPositionX(int playerPositionX) {
		Player.playerPositionX = playerPositionX;
	}

	public int getPlayerPositionY() {
		return playerPositionY;
	}

	public static void setPlayerPositionY(int playerPositionY) {
		Player.playerPositionY = playerPositionY;
	}

	public int getPlayerAttack() {
		return playerAttack;
	}

	public void setPlayerAttack(int playerAttack) {
		this.playerAttack = playerAttack;
	}


	
}
