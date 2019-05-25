/**
 * Name: Cristina Moloman    
 * Date:  24/05/2019   
 * Exercise: #14
 * Purpose:  Instanceof and ternary op. / Ternarius
 */

package instanceOfandTernaryOperators;

public class Ternarius {

	public static void main(String[] args) {
		short years = 0;
		boolean hasPassYearsValidation = false;

		years = 12;
		hasPassYearsValidation = years >= 18 ? true : false;
		System.out.println(hasPassYearsValidation ? "Too young to enter, please go away" : "Welcome to our club");
		
		years = 17;
		hasPassYearsValidation= years >= 18 ? true : false;
		System.out.println(hasPassYearsValidation ? "Too young to enter, please go away" : "Welcome to our club");
		
		years = 18;
		hasPassYearsValidation= years >= 18 ? true : false;
		System.out.println(hasPassYearsValidation ? "Too young to enter, please go away" : "Welcome to our club");
		
		years = 32;
		hasPassYearsValidation= years >= 18 ? true : false;
		System.out.println(hasPassYearsValidation ? "Too young to enter, please go away" : "Welcome to our club");
	}

}