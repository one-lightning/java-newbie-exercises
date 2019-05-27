/**
 * Name: Cristina Moloman    
 * Date:  27/05/2019   
 * Exercise: #15
 * Purpose:  Advanced assignment Operators / Online Game Intro
 */

package advancedassignmentOperators;

public class OnlineGameIntro {

	public static void main(String[] args) {
		
		String characterName = "Medeleine";
		String characterFamily = "Arboreas";
		String characterTitle = "Adventurer";
		byte characterLevel = 62;
		String greetingPattern = "";
		
		greetingPattern+="-------------------\n";
		greetingPattern+="Welcome" + " " + characterName + " " + characterFamily + " " + "to Red Blossom Online \n";
		greetingPattern+="Your current level is " + characterLevel + "!" + " " + "A lot more to go! \n";
		greetingPattern+="So," + " " + characterTitle + " " + "where do you want to go now?\n";
		greetingPattern+="-------------------\n";
		
		System.out.println(greetingPattern);
				

	}

}
