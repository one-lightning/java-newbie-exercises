/**
 * Name: Cristina Moloman    
 * Date:  14/06/2019   
 * Exercise: #21
 * Purpose:  Loop Flow control/While Loop/Matchingtong
 */

package loops;

import java.util.Random;

public class Matchingtong {

	public static void main(String[] args) {
		
		String cell = " ";
		String redCell = "🎀";
		String blueCell = "💙";
		String greenCell = "🍏";
		String orangeCell = "🍊";
		
		int minCellId = 0;
		int maxCellId = 3;
		int cellId = 0;
		
		cell = "``";
		
		Random rand = new Random();
		cellId = rand.nextInt(maxCellId- minCellId+ 1) + minCellId;
		
		System.out.println(cellId);
	}

}
