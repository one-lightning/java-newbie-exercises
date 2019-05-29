/**
 * Name: Cristina Moloman    
 * Date:  27/05/2019   
 * Exercise: #20
 * Purpose:  Exam (Operators, variables, primitive datatypes) / Using 3 variables of type boolean with names a, b, c and 1 variable of type byte output to console:
 * ```
 * n: 0
 * a: [n >= 1] : false
 * b: [n >= 2] : false
 * c: [n >= 3] : false
 * ...
 * n: 1
 * a: [n >= 1] : true
 * b: [n >= 2] : false
 * c: [n >= 3] : false
 * ...
 * n: 2
 * a: [n >= 1] : true
 * b: [n >= 2] : true
 * c: [n >= 3] : false
 * ...
 * n: 3
 * a: [n >= 1] : true
 * b: [n >= 2] : true
 * c: [n >= 3] : true
 * ``` 
 */

package chapter_1;

public class Ex12 {

	public static void main(String[] args) {
		
		boolean a = false;
		boolean b = false;
		boolean c = false;
		byte n = 0;
		
		a = n >= 1;
		b = n >= 2;
		c = n >= 3;	
		System.out.println("```");
		System.out.println("n:" + n );
		System.out.println("a: [n >= 1] : " + a);
		System.out.println("b: [n >= 2] : " + b);
		System.out.println("c: [n >= 3] : " + c);
		System.out.println("...");
		
		
		n++;
		a = n >= 1;
		b = n >= 2;
		c = n >= 3;	
		System.out.println("n:" + n );
		System.out.println("a: [n >= 1] : " + a);
		System.out.println("b: [n >= 2] : " + b);
		System.out.println("c: [n >= 3] : " + c);
		System.out.println("...");
		
		n++;
		a = n >= 1;
		b = n >= 2;
		c = n >= 3;	
		System.out.println("n:" + n );
		System.out.println("a: [n >= 1] : " + a);
		System.out.println("b: [n >= 2] : " + b);
		System.out.println("c: [n >= 3] : " + c);
		System.out.println("...");
		
		n++;
		a = n >= 1;
		b = n >= 2;
		c = n >= 3;	
		System.out.println("n:" + n );
		System.out.println("a: [n >= 1] : " + a);
		System.out.println("b: [n >= 2] : " + b);
		System.out.println("c: [n >= 3] : " + c);
		System.out.println("...");

	}

}
