/**
 * Name: Cristina Moloman    
 * Date:  28/05/2019   
 * Exercise: #20
 * Purpose: Using 2 variables of type String and one variable of type boolean output to console:
 * ```
 * Do you believe in magic!? Yeah I believe in magic!
 * And, do YOU also believe in magic!? Emm nope!
 * ```
 */
package chapter_1;

public class Ex9 {

	public static void main(String[] args) {
		String positiveAnswer = "Do you believe in magic?! Yeah, I believe in magic";
		String negativeAnswer = "And, do you also believe in magic?! Emm nope!";
		
		boolean believeInMagic = true;
		System.out.println(believeInMagic? positiveAnswer:negativeAnswer);
		
		believeInMagic = false;
		System.out.println(believeInMagic? positiveAnswer:negativeAnswer);
		
		
		
		
		
		
		
		

	}

}
