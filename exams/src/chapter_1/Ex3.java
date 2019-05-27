/**
 * Name: Cristina Moloman    
 * Date:  28/05/2019   
 * Exercise: #20
 * Purpose:  Exam (Operators, variables, primitive datatypes) / Using 3 variables of type boolean create a program that will output to console:
 * "True or True" is : true
 * "True or False" is : true
 * "False or True" is : true
 * "False or False" is : false
 */

package chapter_1;

public class Ex3 {

	public static void main(String[] args) {
		
		boolean var1 = false;
		boolean var2 = false;
		boolean var3 = false;

		var2 = true;
		var3 = true;
		var1 = var2 || var3;
		System.out.println("True or True" + " " + "is: " + var1);

		var2 = true;
		var3 = false;
		var1 = var2 || var3;
		System.out.println("True or False" + " " + "is: " + var1);

		var2 = false;
		var3 = true;
		var1 = var2 || var3;
		System.out.println("False or True" + " " + "is: " + var1);

		var2 = false;
		var3 = false;
		var1 = var2 || var3;
		System.out.println("False or False" + " " + "is: " + var1);

	}

}
