/**
 * Name: Cristina Moloman    
 * Date:  01/06/2019   
 * Exercise: #25
 * Purpose:  Flow control/UniversityComitee
 */

package conditional;

public class UniversityComitee {

	public static void main(String[] args) {
		float minGradesForBudget = 9.2f;
		float minGradesForContract = 7.0f;
		float gradesAtMath = 7.5f;
		float gradesAtLiterature = 6.2f;
		float gradesAtPhysics = 9.1f;
		float gradesAtComputerScience = 10.0f;

		boolean isDirectorSon = false;

		if ((isDirectorSon == true)) {

			System.out.println("Congrats, Jonny you've entered our university!You are lucky to have your father being a director of this university...with this marks of yours....anyway. Have a nice day!");
		} else if (gradesAtMath > minGradesForBudget && gradesAtLiterature > minGradesForBudget
				&& gradesAtPhysics > minGradesForBudget && gradesAtComputerScience > minGradesForBudget) {
			System.out.println("Congrats you have joined our university on Budget basis, please study well!");
		} else if (gradesAtMath > minGradesForContract && gradesAtLiterature > minGradesForContract
				&& gradesAtPhysics > minGradesForContract && gradesAtComputerScience > minGradesForContract) {
			System.out.println("Congrats you have joined our university on Contract basis, please study well!");
		} else {
			System.out.println("Sorry to say you that but your grades are not high enough for our university. Bye!");
		}
	}

}
