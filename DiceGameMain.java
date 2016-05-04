import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Random;

public class DiceGameMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		DiceGame_Objects user1 = new DiceGame_Objects();
		
		int picked;
		int totalNumRolled = 0;
		int won=0;
		
		String name = JOptionPane.showInputDialog("Please enter your name: ");
		
		do{
			
		System.out.printf("How many dice would you like to roll %s?", name);
		int timesRolled = input.nextInt();
		
		user1.setRolls(timesRolled);
		user1.trackOfThrows(timesRolled);
		
		int realNumberRolled = user1.numberRolled(timesRolled);
		
		
		
		System.out.println("What do you think the number will be? ");
		int guessRolled = input.nextInt();
		user1.saying(realNumberRolled, guessRolled);
		user1.trackOfResults(realNumberRolled, guessRolled);
		
		System.out.println("Would you like to play again? (Y=1/N=0): ");
		picked = input.nextInt();
		}while(picked==1);
		
		user1.sayNumOfThrowsAndWins();
		
		
		
		

	}

}