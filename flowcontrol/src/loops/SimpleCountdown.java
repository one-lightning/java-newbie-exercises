/**
 * Name: Cristina Moloman    
 * Date:  13/06/2019   
 * Exercise: #21
 * Purpose:  Loop Flow control/While Loop/SimpleCountdown
 */

package loops;

public class SimpleCountdown {

	public static void main(String[] args) {

		int counter = 100;
		String Logger = "";
		while (counter > 0) {
			counter--;
			
			if (counter == 70) {
				Logger = "Championship will start in: " + counter + ".Wait a little bit more! \n ";
			} else if (counter == 50) {
				Logger = "Championship will start in: " + counter + ".Half the way done!! \n ";
			} else if (counter == 25) {
				Logger = "Championship will start in: " + counter + ".Almost there!! \n ";
			} else if (counter == 0) {
				Logger = "Championship will start in: " + counter + ".STARTING CHAMPIONSHIP!!!";
			} else {
				Logger = "Championship will start in:" + counter;
			}
			
			System.out.println(Logger);
		}
	}

}
