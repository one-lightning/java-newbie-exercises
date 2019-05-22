/**
 * Name: Cristina Moloman    
 * Date:  22/05/2019   
 * Exercise: #9
 * Purpose:  Arithmetic operators / ApartmentSquarePrice 
 */

package arithmeticOperators;

public class ApartmentSquarePrice {

	public static void main(String[] args) {
		int apartmentMeterSquare = 1;
		int squarePrice = 440;
		int finalPrice = 0;
		finalPrice = (apartmentMeterSquare * squarePrice);
		System.out.println("Apartment square meters : " + apartmentMeterSquare + ", at price cost of : " + finalPrice);

		apartmentMeterSquare = apartmentMeterSquare + 22;
		finalPrice = (apartmentMeterSquare * squarePrice);
		System.out.println("Apartment square meters : " + apartmentMeterSquare + ", at price cost of : " + finalPrice);

		apartmentMeterSquare = apartmentMeterSquare + 64;
		finalPrice = (apartmentMeterSquare * squarePrice);
		System.out.println("Apartment square meters : " + apartmentMeterSquare + ", at price cost of : " + finalPrice);

	}

}
