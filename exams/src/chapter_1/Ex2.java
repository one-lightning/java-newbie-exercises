/**
 * Name: Cristina Moloman    
 * Date:  27/05/2019   
 * Exercise: #20
 * Purpose:  Exam (Operators, variables, primitive datatypes) / Using 3 variables of type boolean create a program that will output to console:
 * "True and True" is : true
 * "True and False" is : false
 * "False and True" is : false
 * "False and False" is : false
 */

package chapter_1;

public class Ex2 {

	public static void main(String[] args) {
		boolean var1 = false;
		boolean var2 = false;
		boolean var3 = false;
		
		var2 = true;
		var3 = true;
		var1 = var2 && var3; 
		System.out.println("True and True" + " " + "is: " + var1);
		
		var2 = true;
		var3 = false;
		var1 = var2 && var3;
		System.out.println("True and False" + " " + "is: " + var1);
		
		var2 = false;
		var3 = true;
		var1 = var2 && var3;
		System.out.println("False and True" + " " + "is: " + var1);
		
		var2 = false;
		var3 = false;
		var1 = var2 && var3;
		System.out.println("False and False" + " " + "is: " + var1);
	}

}
