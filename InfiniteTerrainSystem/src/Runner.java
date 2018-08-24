import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
	
	//Initialise EnemyNPC
	static ArrayList<EnemyNPC> enemyNPCS = new ArrayList<EnemyNPC>();
	static ArrayList<FriendlyNPC> friendlyNPCS = new ArrayList<FriendlyNPC>();
	static int playerPositionX = 8;
	static int playerPositionY = 1;
	static Player p1 = new Player(100, "Player 1", playerPositionX,playerPositionY);
	//Initialise locations
	static ArrayList<Location> locations = new ArrayList<Location>();	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		//create player with health=100, name, starting position
		
		
		//set player position
		Player.setPlayerPositionX(8);
		Player.setPlayerPositionY(1);

		
		//initialise compass to player 1 and p1 position
		Compass compass = new Compass(p1, playerPositionX, playerPositionY);
		
				
		//create npcs and locations
		//createNPCS();
		//createLocations();
		
		//Initialise EnemyNPC
		ArrayList<EnemyNPC> enemyNPCS = new ArrayList<EnemyNPC>();
		ArrayList<FriendlyNPC> friendlyNPCS = new ArrayList<FriendlyNPC>();

				
		EnemyNPC sauron = new EnemyNPC("Sauron", 50, 10, 3,5);
		
		EnemyNPC terminator = new EnemyNPC("The Terminator", 40, 7,6,3);
		
		EnemyNPC joker = new EnemyNPC("The Joker", 30, 5,1,3);
		
		//Initialise FriendlyNPC
		
		FriendlyNPC matt = new FriendlyNPC("The Matt", 10, 5,9,0);
		
		FriendlyNPC shafeeq = new FriendlyNPC("The Shafeeq", 20, 10,7,5);
		
		FriendlyNPC batman = new FriendlyNPC("The Batman", 30, 15,3,3);
		
		friendlyNPCS.add(batman);
		friendlyNPCS.add(shafeeq);
		friendlyNPCS.add(matt);
		enemyNPCS.add(sauron);
		enemyNPCS.add(terminator);
		enemyNPCS.add(joker);
		
		//Initialise locations
		
		Location mordor = new Location("Mordor" , 10, 0, "You arrived in Mordor",2,5);
		
		Location pyramids = new Location("The Sunken Pyramids" , 5, 0, "You accidently step on the Sunken Pyramids and cut your feet",5,7);
		
		Location gotham = new Location("Gotham" , 5, 0, "You arrive in Gotham and get robbed",1,2);
		
		Location treasure = new Location("Treasure-Land" , 0, 20, "You found the treasure!",1,8);
		
		
		locations.add(treasure);
		locations.add(pyramids);
		locations.add(mordor);
		locations.add(gotham);
		
		//Location treasure = new Location("Treasure-Land" , 0, 20, "You found the treasure!",1,8);
		//locations.add(treasure);
		
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		
		//Begin game
		System.out.println("Welcome to the game!");
		System.out.println("You are trapped in a swamp with enemies and random dangerous towns,");
		System.out.println("Find the portal to escape this world...");
		
		System.out.println("Player position is: "+p1.getPlayerPositionX() + " " + p1.getPlayerPositionY());
		
		
		
		
		
		while((p1.getPlayerPositionX()!=treasure.getLocPositionX()) || (p1.getPlayerPositionY()!=treasure.getLocPositionY())) {
			System.out.println("Enter the direction you choose to move (e.g. north, south, east, west)");
			String userInput = sc.nextLine();
			
			p1.movePlayer(userInput);
			
			interactNPC();
			
			interactLocation();
			
			System.out.println("Player health: " + p1.getPlayerHealth());
			
			System.out.println("Player position: " + p1.getPlayerPositionX() + " " + p1.getPlayerPositionY());
			
			System.out.println("Compass says distance to treasure: " + compass.getDistanceToTreasure(p1) + "m");
			
		}
		
		if((p1.getPlayerPositionX()==treasure.getLocPositionX()) && (p1.getPlayerPositionY()==treasure.getLocPositionY())) {
			System.out.println("You found the treasure/portal! ");
			System.out.println("You WIN!");
		}
		sc.close();

	}
	
	

	public void killNPC(NPC npc, ArrayList<NPC> npcs) {
		if(npc.getNpcHealth()==0) {
			npcs.remove(npc);
		}
	}
	
	public static void createNPCS() {
		//Initialise EnemyNPC
		ArrayList<EnemyNPC> enemyNPCS = new ArrayList<EnemyNPC>();
		ArrayList<FriendlyNPC> friendlyNPCS = new ArrayList<FriendlyNPC>();

				
		EnemyNPC sauron = new EnemyNPC("Sauron", 50, 10, 3,5);
		
		EnemyNPC terminator = new EnemyNPC("The Terminator", 40, 7,6,3);
		
		EnemyNPC joker = new EnemyNPC("The Joker", 30, 5,1,3);
		
		//Initialise FriendlyNPC
		
		FriendlyNPC matt = new FriendlyNPC("The Matt", 10, 5,9,0);
		
		FriendlyNPC shafeeq = new FriendlyNPC("The Shafeeq", 20, 10,7,5);
		
		FriendlyNPC batman = new FriendlyNPC("The Batman", 30, 15,3,3);
		
		friendlyNPCS.add(batman);
		friendlyNPCS.add(shafeeq);
		friendlyNPCS.add(matt);
		enemyNPCS.add(sauron);
		enemyNPCS.add(terminator);
		enemyNPCS.add(joker);
	}
	
	public static void createLocations() {
		//Initialise locations
		
		Location mordor = new Location("Mordor" , 10, 0, "You arrived in Mordor",2,5);
		
		Location pyramids = new Location("The Sunken Pyramids" , 5, 0, "You accidently step on the Sunken Pyramids and cut your feet",5,7);
		
		Location gotham = new Location("Gotham" , 5, 0, "You arrive in Gotham and get robbed",1,2);
		
		Location treasure = new Location("Treasure-Land" , 0, 20, "You found the treasure!",1,8);
		
		
		locations.add(treasure);
		locations.add(pyramids);
		locations.add(mordor);
		locations.add(gotham);

	}
	
	public static void interactNPC() {
		for(int i=0;i<enemyNPCS.size();i++) {
			
			int playerX = p1.getPlayerPositionX();
			int playerY = p1.getPlayerPositionY();
			
			int enemyX = enemyNPCS.get(i).getNpcPositionX();
			int enemyY = enemyNPCS.get(i).getNpcPositionY();

			
			if((playerX==enemyX) &&((playerY==enemyY))) {
				System.out.println("You found " + enemyNPCS.get(i).getNpcName());
				enemyNPCS.get(i).attack(p1);
			}
			
		}
		
		for(int i=0;i<friendlyNPCS.size();i++) {
			
			int playerX = p1.getPlayerPositionX();
			int playerY = p1.getPlayerPositionY();
			
			int friendX = friendlyNPCS.get(i).getNpcPositionX();
			int friendY = friendlyNPCS.get(i).getNpcPositionY();
			
			if((playerX==friendX) &&(playerY==friendY)) {
				System.out.println("You found " + friendlyNPCS.get(i).getNpcName());
				friendlyNPCS.get(i).heal(p1);
			}
		}
	}
	
	private static void interactLocation() {
		// TODO Auto-generated method stub
		for(int i=0;i<locations.size();i++) {
			
			int playerX = p1.getPlayerPositionX();
			int playerY = p1.getPlayerPositionY();
			
			int locationX = locations.get(i).getLocPositionX();
			int locationY = locations.get(i).getLocPositionY();

			
			if((playerX==locationX) &&(playerY==locationY)) {
				locations.get(i).attack(p1);
				locations.get(i).heal(p1);
				System.out.println(locations.get(i).getLocationMessage());
			}
		}
		
	}

}
