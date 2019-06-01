/**
 * Name: Cristina Moloman    
 * Date:  31/05/2019   
 * Exercise: #25
 * Purpose:  Flow control/DatingMatchParams
 */

package conditional;

public class DatingMatchParams {

	public static void main(String[] args) {
		
		boolean isMale = false;
		boolean isEyeColorMatched = true;
		boolean isHairColorMatched = true;
		boolean isHeightMatched = false;
		boolean isBodyTypeMatched = true;
		
		if ((isEyeColorMatched && isHairColorMatched) || (isHeightMatched && isBodyTypeMatched)){
			System.out.println("Yay finally found " + (isMale ? "him" : "her"));
		}
	}

}