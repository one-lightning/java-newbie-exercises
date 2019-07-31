/**
 * Name: Cristina Moloman    
 * Date:  31/07/2019   
 * Exercise: #21
 * Purpose:  Loop Flow control/While Loop/Encoding
 */

package loops;

public class Encoding {

	public static void main(String[] args) {
		String input = "My job is #testing";
		String output = "";
		int index = 0;
		boolean isEncoded = false;

		while (!isEncoded) {

			char ch = input.charAt(index);
			int charCode = (int) ch;
			
			charCode += 5;
			output += (char) charCode;
			
			index++;
			isEncoded = index == input.length();
			
		}

		System.out.println(input);
		System.out.println(output);

	}

}
