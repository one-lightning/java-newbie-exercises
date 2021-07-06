/**
 * Name: Cristina Moloman    
 * Date:  14/06/2019   
 * Exercise: #21
 * Purpose:  Loop Flow control/While Loop/Heartbeat
 */

package loops;

import java.util.concurrent.ThreadLocalRandom;

public class Heartbeat {

	public static void main(String[] args) {
		
		boolean bIsScanning = true;
		int ticks = 0;
		int beats = 0;
		int maxTicks = 24;
		int rate = 350;
		int beatsIntervalMin = -3;
		int beatsIntervalMax = 3;

		while (bIsScanning) {
			String heartbeat = "";

			beats = ThreadLocalRandom.current().nextInt(beatsIntervalMin, beatsIntervalMax + 1);

			ticks++;

			for (int i = beats; i < 0; i++) {
				heartbeat += "..";
			}

			for (int i = beats; i > 0; i--) {
				heartbeat += "..";
			}

			heartbeat += "♥";

			if (ticks == maxTicks) {
				bIsScanning = false;
			}

			try {
				Thread.sleep(rate);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.print(heartbeat);
		}

	}
}
