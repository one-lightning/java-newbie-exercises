/**
 * Name: Cristina Moloman    
 * Date:  28/05/2019   
 * Exercise: #20
 * Purpose: Using only 1 variable of type int output the following without using assignment operator:
 * ```

 * $ i: 0 ~ -0
 * $ i: 3 ~ -3
 * $ i: 6 ~ -6
 * $ i: 9 ~ -9

```
 *  
 */
package chapter_1;

public class Ex6 {

	public static void main(String[] args) {
		
		System.out.println("```");
		int output = 0;
		System.out.println("$ i :" + " " + output + "~" + " " + "-" + output);
		
		output = 3;
		System.out.println("$ i :" + " " + output + "~" + " " + -output);
		
		output = 6;
		System.out.println("$ i :" + " " + output + "~" + " " + -output);
		
		output = 9;
		System.out.println("$ i :" + " " + output + "~" + " " + -output);
		
		System.out.println("```");
		

		
		}
	}
