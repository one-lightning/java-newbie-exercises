/**
 * Name: Cristina Moloman    
 * Date:  03/06/2019   
 * Exercise: #25
 * Purpose:  Flow control/TryHard
 */

package conditional;

public class TryHard {

	enum ETaskStatus {

		NotReady, ReadyToPlay, InProgress, ReadyForTesting, TestingInProgress, Done, Reopened
	}

	public static void main(String[] args) {

		ETaskStatus myTask = ETaskStatus.TestingInProgress;
		String labelPM = "[ 🙎 Project Manager ]";
		String labelDev = "[ 👨‍💻 Developer ]";
		String labelTester = "[ 🕵️‍♀️ Tester ]";

		if (myTask == ETaskStatus.NotReady) {
			System.out.println("Me: Hmm I cant start doing it, this should be reviewed by" + labelPM);
		}

		if (myTask == ETaskStatus.ReadyToPlay) {
			System.out.println("Me: This is not my job I think, It should be implemented by a" + labelDev);
		}

		if (myTask == ETaskStatus.InProgress) {
			System.out.println(
					"Me: Oh thats so cool, finally this task is being work on by a " + labelDev + ". Good job Timmy!");
		}

		if (myTask == ETaskStatus.ReadyForTesting) {
			System.out.println("Me: Oh look what we've got here hehe. This might be a task for a \r \n"
					+ "I can start working on this...Its time for 🎧 music, but, only after a cup of ☕️ cofee, of course :) `");
		}

		if (myTask == ETaskStatus.TestingInProgress) {
			System.out.println("Me: Seems like all criteria are met, It's fine I think. I just love to be a "
					+ labelTester + ". Ok, time to play some 🏓 and close the task after that. Yay!`");
		}

		if (myTask == ETaskStatus.Done) {
			System.out.println(labelTester + "Congratulations! You did it!:) \n" + labelDev
					+ "Hell yeaaaah! Finally some 🍺 now!`");
		}

		if (myTask == ETaskStatus.Reopened) {
			System.out
					.println(labelTester + "Emmm, sorry to say that Timmy but I think now you broke something :) 😇  \n"
							+ labelDev + " OH SH** 💢 ");
		}

	}

}
