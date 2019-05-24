/**
 * Name: Cristina Moloman    
 * Date:  24/05/2019   
 * Exercise: #13
 * Purpose:  Logical Operators / FlowerField 
 */


package logicalOperators;

public class FlowerField {

	public static void main(String[] args) {
		boolean hasJonNecessaryPocketMoney = false;
		boolean hasAlfNecessaryPocketMoney = false;
		boolean hasSaraNecessaryPocketMoney = false;
		boolean canEveryoneEnter = false;
		
		canEveryoneEnter = hasJonNecessaryPocketMoney || hasAlfNecessaryPocketMoney || hasSaraNecessaryPocketMoney;
		
		System.out.println("Sara: The flower field is so beautiful, but I want to see it from  the inside, can we enter?");
		System.out.println(" Guard: My answer is: " + canEveryoneEnter + " \n Does not matter how many of you are here, but if someone donate 20$ you all enter.");
		System.out.println("Jon: Let`s check our pockets...");
		System.out.println("Alf: Whohooo guys I think  I have some!");
		
		hasAlfNecessaryPocketMoney = true;
		canEveryoneEnter = hasJonNecessaryPocketMoney || hasAlfNecessaryPocketMoney || hasSaraNecessaryPocketMoney ;
		System.out.println("Jon: Can we all enter now, Mr.Guard?");
		
		System.out.println(" Guard: My answer is :" + " " + canEveryoneEnter);

	}

}
