/**
 * Name: Cristina Moloman    
 * Date:  21/05/2019   
 * Exercise: #9
 * Purpose:  Arithmetic operators
 */

package arithmeticOperators;

public class SummonerGreeter {

	public static void main(String[] args) {
		String greetingPrefix;
		String greetingName;
		String greetingSurname;
		String greetingPostfix;
		String greetingDelimiter;
		String greetingMotivator;
		String greetingFinal;

		// Assign the values to variables.
		
		greetingPrefix = "Welcome, ";
		greetingName = "Sheldor ";
		greetingSurname = "Booker";
		greetingPostfix = ". To Summoners Rift!";
		greetingDelimiter = "\n----------------------------------\n";
		greetingMotivator = "Pick a champion a let's go fight the enemies!!!";
		greetingFinal = greetingPrefix + greetingName + greetingSurname + greetingPostfix + greetingDelimiter
				+ greetingMotivator;

		// Print concatenated string.
		System.out.println(greetingFinal);
	}

}
