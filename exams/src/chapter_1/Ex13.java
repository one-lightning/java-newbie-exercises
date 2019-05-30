/**
 * Name: Cristina Moloman    
 * Date:  29/05/2019   
 * Exercise: #20
 * Purpose:  Using 2 variables of type String and 1 variable of type int and 1 variable of type boolean output to console:
 * ```
 * [<-]999[->]888[<-]777[->]
 * [->]666[<-]555[->]444[<-]
 * [<-]333[->]222[<-]111[->]
 * ```
 */
package chapter_1;

public class Ex13 {

	public static void main(String[] args) {
		int num = 9;
		String pattern = "";

		boolean b = num % 2 == 0;
		// arrow
		String dirr = !b ? "[<-]" : "[->]";
		pattern += dirr;

		// number
		pattern += num + "" + num + "" + num;

		// arrow
		dirr = b ? "[<-]" : "[->]";
		pattern += dirr;

		// number
		num--;
		b = num % 2 == 0;
		pattern += num + "" + num + "" + num;

		// arrow
		dirr = b ? "[<-]" : "[->]";
		pattern += dirr;

		// number
		num--;
		b = num % 2 == 0;
		pattern += num + "" + num + "" + num;

		// arrow
		dirr = b ? "[<-]" : "[->]";
		pattern += dirr;
		pattern += "\n";

		// arrow
		dirr = b ? "[<-]" : "[->]";
		pattern += dirr;

		// number
		num--;
		b = num % 2 == 0;
		pattern += num + "" + num + "" + num;

		// arrow
		dirr = b ? "[<-]" : "[->]";
		pattern += dirr;

		// number
		num--;
		b = num % 2 == 0;
		pattern += num + "" + num + "" + num;

		// arrow
		dirr = b ? "[<-]" : "[->]";
		pattern += dirr;

		// number
		num--;
		b = num % 2 == 0;
		pattern += num + "" + num + "" + num;

		// arrow
		dirr = b ? "[<-]" : "[->]";
		pattern += dirr;
		pattern += "\n";

		// arrow
		dirr = b ? "[<-]" : "[->]";
		pattern += dirr;

		// number
		num--;
		b = num % 2 == 0;
		pattern += num + "" + num + "" + num;

		// arrow
		dirr = b ? "[<-]" : "[->]";
		pattern += dirr;

		// number
		num--;
		b = num % 2 == 0;
		pattern += num + "" + num + "" + num;

		// arrow
		dirr = b ? "[<-]" : "[->]";
		pattern += dirr;

		// number
		num--;
		b = num % 2 == 0;
		pattern += num + "" + num + "" + num;

		// arrow
		dirr = b ? "[<-]" : "[->]";
		pattern += dirr;

		System.out.println(pattern);

	}

}
