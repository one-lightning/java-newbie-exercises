/**
 * Name: Cristina Moloman    
 * Date:  24/05/2019   
 * Exercise: #13
 * Purpose:  Logical Operators / Anyways
 */


package logicalOperators;

public class Anyways {

	public static void main(String[] args) {
		boolean hasGoodGrades;
		boolean hasFriendsInAdministration;
		boolean hasJonPassedTheExams;
		boolean hasMargoPassedTheExams;
		boolean hasRobPassedTheExams;
		boolean hasCobPassedTheExams;
		
		hasGoodGrades = true;
		hasFriendsInAdministration = false;
		hasJonPassedTheExams = hasGoodGrades || hasFriendsInAdministration;
		System.out.println("Teacher: Have you passed the exams? Hmm... " + " " + hasJonPassedTheExams);
		
		hasGoodGrades = true;
		hasFriendsInAdministration = true;
		hasMargoPassedTheExams = hasGoodGrades || hasFriendsInAdministration;
		System.out.println("Teacher: Have you passed the exams? Hmm... " + " " + hasMargoPassedTheExams);
		
		hasGoodGrades = false;
		hasFriendsInAdministration = true;
		hasRobPassedTheExams = hasGoodGrades && hasFriendsInAdministration;
		System.out.println("Teacher: Have you passed the exams? Hmm... " + " " + hasRobPassedTheExams);
		
		hasGoodGrades = false; 
		hasFriendsInAdministration = false;
		hasCobPassedTheExams = hasGoodGrades || hasFriendsInAdministration;
		System.out.println("Teacher: Have you passed the exams? Hmm... " + " " + hasCobPassedTheExams);
		

	}

}
