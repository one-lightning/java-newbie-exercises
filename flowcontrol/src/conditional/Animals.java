/**
 * Name: Cristina Moloman    
 * Date:  03/06/2019   
 * Exercise: #25
 * Purpose:  Flow control/Animals
 */

package conditional;

public class Animals {

	enum EAnimals {
		Dog, Cat, Bird, Rabbit, Dragon, Pig, Peataceok, Horse, Rhino, Lion
	}

	public static void main(String[] args) {

		EAnimals selectedAnimal = EAnimals.Dog;
		switch (selectedAnimal) {
		case Dog:
			System.out.println("🐩 Bark bark!");
			break;

		case Cat:
			System.out.println("🐱 Meeaw!");
			break;

		case Bird:
			System.out.println("🐦 Kuaarrr!");
			break;

		case Rabbit:
			System.out.println("🐰 Knuff knuff!");
			break;

		case Dragon:
			System.out.println("🐉 RooooOOOOAAAR! ~🔥~🔥~🔥");
			break;

		case Pig:
		case Peataceok:
			System.out.println("🐷🐽 Oink oink!");
			break;
			
		case Horse:
			System.out.println("🐴 Niiuaaahahaha");
			break;
			
		case Rhino:
			System.out.println("🦏 Brrrrr");
			break;
			
		case Lion:
			System.out.println("🦁 Roooarc!");
			break;
			
		default:
			System.out.println("👾 No such animal found!");
			
		}

	}

}
