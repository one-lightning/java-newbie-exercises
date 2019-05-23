/**
 * Name: Cristina Moloman    
 * Date:  23/05/2019   
 * Exercise: #10
 * Purpose:  Unary operators / ( Height quiz ( in centimeters ) )
 */

package unaryOperators;

public class HeightQuiz {

	public static void main(String[] args) {

		int jonHeight = 170;
		int billHeight = 180;
		int lennyHeight = 165;

		System.out.println("Welcome to height quiz");
		System.out.println("Jon" + " " + " - " + jonHeight + " " + " (cm) " + " " + "is shorter then Bill" + " " + " - "
				+ billHeight + " (cm) " + " \nAnswer:  " + (jonHeight < billHeight));
		
		System.out.println("Bill" + " " + " - " + billHeight + " " + " (cm) " + " " + "is equal to Lenny" + " " + " - "
				+ lennyHeight + " (cm) " + " \nAnswer:  " + (billHeight == lennyHeight));

		System.out.println("Lenny" + " " + " - " + lennyHeight + " " + " (cm) " + " " + "is shorter then Jon" + " " + " - "
				+ jonHeight + " (cm) " + " \nAnswer:  " + (lennyHeight < jonHeight));
	}

}
