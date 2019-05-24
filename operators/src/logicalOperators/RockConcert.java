/**
 * Name: Cristina Moloman    
 * Date:  24/05/2019   
 * Exercise: #13
 * Purpose:  Logical Operators / RockConcert
 */

package logicalOperators;

public class RockConcert {

	public static void main(String[] args) {
		boolean hasJonTicketPass = true;
		boolean hasAlfTicketPass = false;
		boolean hasSaraTicketPass = true;
		boolean canEveryoneEnter = false;
		boolean canJonAndAlfEnter = false;
		boolean canJonAndSaraEnter = false;
		
		canEveryoneEnter = hasJonTicketPass && hasAlfTicketPass && hasSaraTicketPass;
		canJonAndAlfEnter = hasJonTicketPass && hasAlfTicketPass;
		canJonAndSaraEnter = hasJonTicketPass && hasSaraTicketPass;
		
		System.out.println("Sara: Wow the music is so awesome, I hope nobody forgot their tickets home...?");
		System.out.println("Guys: Can we all enter? \n Guard: My answer is -" + " " + canEveryoneEnter);
		System.out.println("Jon: Can I and my bro Alfred enter? \n Guard: My answer is -" + " " + canJonAndAlfEnter );
		System.out.println("Sara: Can I enter with Jon? \n Guard: My answer is -" + " " + canJonAndSaraEnter);

	}

}

