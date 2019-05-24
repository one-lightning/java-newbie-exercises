/**
 * Name: Cristina Moloman    
 * Date:  24/05/2019   
 * Exercise: #13
 * Purpose:  Logical Operators / MSI Championship
 */


package logicalOperators;

public class MSIChampionship {

	public static void main(String[] args) {
		
		boolean hasSKTWon_1Game;
		boolean hasSKTWon_2Game;
		boolean hasSKTWon_3Game;
		boolean hasSKTWon_4Game;
		boolean hasSKTWon_5Game;
		boolean isSKTWinner;
		
		hasSKTWon_1Game = true;
		hasSKTWon_2Game = false;
		hasSKTWon_3Game = true;
		hasSKTWon_4Game = false;
		hasSKTWon_5Game = false;
		
		isSKTWinner = hasSKTWon_1Game && hasSKTWon_2Game && hasSKTWon_3Game && hasSKTWon_4Game && hasSKTWon_5Game;
		
		System.out.println("Is SKT T1 going to finals at this MSI? The answer is: " + isSKTWinner);
		System.out.println("Faker: 'Will revenge at worlds championship!");

	}

}
