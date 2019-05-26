/**
 * Name: Cristina Moloman    
 * Date:  26/05/2019   
 * Exercise: #15
 * Purpose:  Advanced assignment Operators / Bank Terminal
 */


package advancedassignmentOperators;

public class BankTerminal {

	public static void main(String[] args) {
		short extractedId = 0;
		int extractedAmount = 0;
		int remainingBalance = 364;
		
		extractedId = 1;
		extractedAmount = 30;
		remainingBalance -= extractedAmount;
		System.out.println("Extracted amount: " + extractedAmount + " " + " Current balance: " + remainingBalance);
		
		extractedId = 2;
		extractedAmount = 100;
		remainingBalance -= extractedAmount;
		System.out.println("Extracted amount: " + extractedAmount + " " + " Current balance: " + remainingBalance);
		
		extractedId = 3;
		extractedAmount = 70;
		remainingBalance -= extractedAmount;
		System.out.println("Extracted amount: " + extractedAmount + " " + " Current balance: " + remainingBalance);

	}

}
