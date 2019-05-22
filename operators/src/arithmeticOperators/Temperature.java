/**
 * Name: Cristina Moloman    
 * Date:  22/05/2019   
 * Exercise: #9
 * Purpose:  Arithmetic operators / Temperature
 */

package arithmeticOperators;

public class Temperature {

	public static void main(String[] args) {

		int temperature = 0;
		System.out.println("Current temperature: " + temperature);
		int morningTemperature = 12;
		int afternoonTemperature = 20;

		temperature = (temperature - morningTemperature);
		System.out.println("Current temperature: " + temperature);
		temperature = (temperature + afternoonTemperature );
		System.out.println("Current temperature: " + temperature);

	}

}
