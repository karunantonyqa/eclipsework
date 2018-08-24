
public class EnemyNPC extends NPC {
	
	int attackPower = 15;

	public EnemyNPC(String npcName, int npcHealth, int attackPower, int npcPositionX, int npcPositionY) {
		super(npcName, npcHealth, npcPositionX, npcPositionY);
		this.attackPower=attackPower;
		this.npcPositionX=npcPositionX;
		// TODO Auto-generated constructor stub
	}

	

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	public void attack(Player p) {
		p.setPlayerHealth(p.getPlayerHealth()-getAttackPower());
	}

}
