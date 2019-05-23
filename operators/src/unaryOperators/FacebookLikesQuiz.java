/**
 * Name: Cristina Moloman    
 * Date:  23/05/2019   
 * Exercise: #10
 * Purpose:  Unary operators / Facebook likes quiz
 */

package unaryOperators;

public class FacebookLikesQuiz {

	public static void main(String[] args) {

		int jonPhotoLikes = 23;
		int billPhotoLikes = 97;
		int lennyPhotoLikes = 8;

		System.out.println("\n Welcome to Facebook likes quiz!");
		System.out.println("\nJon's likes" + " " + "-" + " " + jonPhotoLikes + " are higher then Bill's likes " + " "
				+ "-" + " " + billPhotoLikes + " ? "  + " \nAnswer:  " + (jonPhotoLikes > billPhotoLikes));
		System.out.println("\nBill's likes" + " " + "-" + " " + billPhotoLikes + " are less then Lenny's likes " + " "
				+ "-" + " " + lennyPhotoLikes + " ? "  + " \nAnswer:  " + (billPhotoLikes < lennyPhotoLikes));
		System.out.println("\nLenny's likes" + " " + "-" + " " + lennyPhotoLikes + " are equal to Jon's likes " + " "
				+ "-" + " " + jonPhotoLikes + " ? "  + " \nAnswer:  " + (lennyPhotoLikes == jonPhotoLikes));

	}

}
