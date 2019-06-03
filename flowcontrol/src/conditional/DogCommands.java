/**
 * Name: Cristina Moloman    
 * Date:  02/06/2019   
 * Exercise: #25
 * Purpose:  Flow control/DogCommands
 */

package conditional;

public class DogCommands {

	public static void main(String[] args) {
		short dogCommandID = 1;

		switch (dogCommandID) {

		// sitting
		case 0:
			System.out.println("*sitting still*");
			break;
		// sitting
		case 1:
			System.out.println("🐕*sitting still*");
			break;
		// barking
		case 2:
			System.out.println("🐶 BARK BARK!!");
			break;
		// growl
		case 3:
			System.out.println("💢RRRRRrrRRRRRRrrrrrARGHRGRGRGGRR");
			break;
		// eating
		case 777:
		case 888:
		case 999:
			System.out.println("🍖 OMNOMNOMNOM 🍖");
			break;

		// playing
		case 111:
		case 222:
		case 333:
			System.out.print("⚽️🎈🏈");
			break;
		}

	}

}
