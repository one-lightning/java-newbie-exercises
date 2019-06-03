/**
 * Name: Cristina Moloman    
 * Date:  03/06/2019   
 * Exercise: #25
 * Purpose:  Flow control/Theatre
 */

package conditional;

public class Theatre {

	public static void main(String[] args) {
		boolean hasJonEnjoyedTheMovie = true;
		boolean hasIrenEnjoyedTheMovie = false;
		boolean hasBridgetEnjoyedTheMovie = true;

		System.out.println(
				"Mark: So guys, what do you think about this movie? But if you didn't enjoy it, thats bad, dont be silent about it : ) \n");

		if (hasJonEnjoyedTheMovie) {
			System.out.println("Jon: Wow the movie was great!! \n");
		}

		if (hasIrenEnjoyedTheMovie) {
			System.out.println("Iren: Yeah I kinda liked it too! \n");
		}
		if (hasBridgetEnjoyedTheMovie) {
			System.out.println("Bridget: OH. MY. GOOOD!");
		}
	}

}
