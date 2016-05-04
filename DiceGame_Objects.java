import java.util.Random;

public class DiceGame_Objects {

	private int rolls;
	private int guess;
	private int numberofthrows=0;
	private int won=0;
	private int losses=0;
	
	public DiceGame_Objects() {
		
	}
	
	public DiceGame_Objects(int rolls, int guess) {

		this.rolls = rolls;
		this.guess = guess;
	}
	
	public void trackOfResults(int realNumberRolled, int guess){
		if(realNumberRolled == guess)
			this.won = this.won+1;
		else
			this.losses = this.losses+1;
	}
	
	public void trackOfThrows(int numberOfThrows){
	
		this.numberofthrows =  this.numberofthrows + numberOfThrows;
	}
	

	public void setRolls(int rolls){
		this.rolls = rolls;
	}

	public int numberRolled(int rolls){
		int result;
		int Dresult = 0;
		Random random = new Random();
		
		for(int i = 0; i<rolls; i++)
		{
			result = random.nextInt(6);
			result++;
			Dresult = Dresult + result;
		}
		
		
		return Dresult;
		
	}

	public void saying(int Dresult, int guess){
		if(Dresult == guess)
			{
				
				System.out.printf("You guessed correct!The number was: %d\n\n", Dresult);
			}
		else
		{
			
			System.out.printf("You guessed wrong! The number was: %d\n\n", Dresult);
		}
	}
	
	public void sayNumOfThrowsAndWins(){
		System.out.printf("Total Rolls: %d \nGames Won: %d Games \nGames Lost: %d games", this.numberofthrows, this.won, this.losses);
		}
	}


