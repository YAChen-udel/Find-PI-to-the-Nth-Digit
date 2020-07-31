package Numbers;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

/**
 * @author This class can accept an integer between 1 and 200 and return PI
 *         up to that many decimal places.
 */

public class PiToNthDigit {

	//store the First 200 decimal places of Pi in the BigDecimal class.
	final static BigDecimal PI = new BigDecimal("3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534211706798214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196");
	
	
	public static void main(String[] args) {
		
		System.out.println("To how many decimal places do you want to print PI? (Max 200):");
		
		//input read the user's input
		Scanner input = new Scanner(System.in);
		
		boolean Nth = true;
		
		// digit is the nth digit that user what to print
		int digit = 0;
		digit = input.nextInt();
		
		
		while(Nth) {
			
			if(digit >= 0 && digit <= 200) {
				Nth = false;
				
			}
			else {
				Nth = true;
				System.out.println("Please enter integer 0 - 200");
				
				digit = input.nextInt();
			}
		}
		
		String format = "#.";
		for(int i = 0; i < digit ; i++) {
			format = format + "#";
		}

		//Formatting numbers
		DecimalFormat decimalFormat = new DecimalFormat(format);
		System.out.println("Pi to the " + digit + "th" + " place is " + decimalFormat.format(PI));
		
	}
}
