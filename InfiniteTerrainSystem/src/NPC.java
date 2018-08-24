
public class NPC {
	
	private String npcName;
	private int npcHealth;
	static int npcPositionX;
	static int npcPositionY;
	int[][] npcPosition = new int[10][10];
	

	public NPC(String npcName, int npcHealth, int npcPositionX, int npcPositionY) {
		this.npcName=npcName;
		this.npcHealth=npcHealth;
		this.npcPositionX=npcPositionX;
		this.npcPositionY=npcPositionY;
	}


	public String getNpcName() {
		return npcName;
	}


	public void setNpcName(String npcName) {
		this.npcName = npcName;
	}


	public int getNpcHealth() {
		return npcHealth;
	}


	public void setNpcHealth(int npcHealth) {
		this.npcHealth = npcHealth;
	}


	public int[][] getNpcPosition() {
		return npcPosition;
	}


	public void setNpcPosition(int[][] npcPosition) {
		this.npcPosition = npcPosition;
	}


	public static int getNpcPositionX() {
		return npcPositionX;
	}


	public static void setNpcPositionX(int npcPositionX) {
		NPC.npcPositionX = npcPositionX;
	}


	public static int getNpcPositionY() {
		return npcPositionY;
	}


	public static void setNpcPositionY(int npcPositionY) {
		NPC.npcPositionY = npcPositionY;
	}
	
	

}
