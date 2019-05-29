/**
 * Name: Cristina Moloman    
 * Date:  29/05/2019   
 * Exercise: #20
 * Purpose: Using 2 variables of type int and 2 variable of type String output to console:
 * ```
 * (x: 22) is smaller or equal to (y: 25)
 * (x: 23) is smaller or equal to (y: 24)
 * (x: 24) is greater or equal to (y: 23)
 * (x: 25) is greater or equal to (y: 22)
 * ```
 */

package chapter_1;

public class Ex11 {

	public static void main(String[] args) {
		
		int x = 22;
		int y = 25;
		
		String smallerOrEqual = "is smaller or equal to";
		String greaterorequal = "is greater or equal to";
		
		System.out.println("(x:" + x + ")" + " " + (x<=y ? smallerOrEqual : greaterorequal) + " " + "(y:" + y + ")");
		x++;
		y--;
		
		System.out.println("(x:" + x + ")" + " " + (x<=y ? smallerOrEqual : greaterorequal) + " " + "(y:" + y + ")");
		x++;
		y--;
		
		System.out.println("(x:" + x + ")" + " " + (x<=y ? smallerOrEqual : greaterorequal) + " " + "(y:" + y + ")");
		x++;
		y--;
		
		System.out.println("(x:" + x + ")" + " " + (x<=y ? smallerOrEqual : greaterorequal) + " " + "(y:" + y + ")");
		x++;
		y--;
		
		
		
	}

}
