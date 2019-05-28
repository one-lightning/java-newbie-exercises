/**
 * Name: Cristina Moloman    
 * Date:  29/05/2019   
 * Exercise: #20
 * Purpose: Using 2 variables of type int and 3 variables of type String and 1 variable of type boolean output to console:
 * ```
 * x: 22 is smaller then 21: No
 * x: 22 is smaller then 23: Yes
 * x: 23 is smaller or equal then 23: Yes
 * ```
 */

package chapter_1;

public class Ex10 {

	public static void main(String[] args) {
		
		int x;
		int y;
		boolean result = false;
		String var = "";
		String isSmallerThen = "is smaller then";
		String isSmallerOrEqual = "is smaller or equal then";
		
		
		x = 22;
		y = 21;
		
		result = x<y;
		var = result ?"Yes":"No";
		
		System.out.println("x: " + x + " " + isSmallerThen + " "+ y +": " + var);
		
		x = 22;
		y = 23;
		
		result = x<y;
		var = result ?"Yes":"No";
		
		System.out.println("x: " + x + " " + isSmallerThen + " "+ y +": " + var);
		
		x = 23;
		y = 23;
		
		result = x<=y;
		var = result ?"Yes":"No";
		
		System.out.println("x: " + x + " " + isSmallerOrEqual + " "+ y +": " + var);;
		
		
	}

}
