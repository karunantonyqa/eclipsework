import java.util.Random;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int human= 0;
		int computer = 0;
		int gameCount=0;
		int tieCount=0;
		int rockCount =0;
		int paperCount =0;
		int scissorCount =0;

		
		System.out.println("Welcome to Rock, Paper, Scissors! Best Out Of 5!");
		System.out.println("Choose your move (R, P or S): ");
		
		Scanner sc = new Scanner(System.in);
		String userMove = sc.nextLine();
		
		Random rand = new Random();
		int random = rand.nextInt(3);
		
		String[] rpsList = {"R","P","S"};
		
		
		
		boolean playerHasWon = false;
		while(!playerHasWon) {
			
			
			// if user chooses ROCK
			if(userMove.equals("R") && rpsList[random].equals("R")) {
				System.out.println("You DRAW the round!");
				tieCount++;
				rockCount+=2;
			}else if(userMove.equals("R") && rpsList[random].equals("P")) {
				System.out.println("You lose the round!" + " AI CHOSE Paper");
				computer++;
				rockCount++;
				paperCount++;
			}else if(userMove.equals("R") && rpsList[random].equals("S")) {
				System.out.println("You win the round!" + " AI CHOSE SCISSORS");
				human++;
				paperCount++;
				scissorCount++;
			}
			
			// if user chooses PAPER
			else if(userMove.equals("P") && rpsList[random].equals("P")) {
				System.out.println("You DRAW the round!");
				paperCount+=2;
				tieCount++;
			}else if(userMove.equals("P") && rpsList[random].equals("S")) {
				System.out.println("You lose the round!" + " AI CHOSE SCISSORS");
				computer++;
				paperCount++;
				scissorCount++;
			}else if(userMove.equals("P") && rpsList[random].equals("R")) {
				System.out.println("You win the round!" + " AI CHOSE ROCK");
				human++;
				paperCount++;
				rockCount++;
			}
			
			// if user chooses 
			else if(userMove.equals("S") && rpsList[random].equals("S")) {
				System.out.println("You DRAW the round!");
				scissorCount+=2;
				tieCount++;
			}else if(userMove.equals("S") && rpsList[random].equals("P")) {
				System.out.println("You win the round!" + " AI CHOSE Paper");
				human++;
				paperCount++;
				scissorCount++;
			}else if(userMove.equals("S") && rpsList[random].equals("R")) {
				System.out.println("You lose the round!" + " AI CHOSE ROCK");
				computer++;
				scissorCount++;
				rockCount++;
			}
			
			
			if(human>=5) {
				System.out.println("You have won the game!");
				playerHasWon=true;
			} else if(computer>=5) {
				System.out.println("You lost! Loser!");
				playerHasWon=true;
				
			}
			
			gameCount++;
			
			float humanPerc = ((100/gameCount)*human);
			float aiPerc = ((100/gameCount)*computer);
			
			System.out.println("Player Score: " + human + "\nPercentage: " + humanPerc);
			System.out.println("\nAI Score: " + computer + "\nPercentage: " + aiPerc);
			System.out.println("Choose your move (R, P or S): ");
			userMove = sc.nextLine();
			random = rand.nextInt(3);

			
		}
		sc.close();
		
		
		
	}

}
