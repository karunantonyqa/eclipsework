
public class FriendlyNPC extends NPC {
	
	int healPower = 10;

	public FriendlyNPC(String npcName, int npcHealth, int healPower, int npcPositionX, int npcPositionY) {
		super(npcName, npcHealth, npcPositionX, npcPositionY);
		this.healPower=healPower;
		// TODO Auto-generated constructor stub
	}

	public int getHealPower() {
		return healPower;
	}

	public void setHealPower(int healPower) {
		this.healPower = healPower;
	}
	
	public void heal(Player p) {
		p.setPlayerHealth(p.getPlayerHealth()+healPower);
	}
	

}
