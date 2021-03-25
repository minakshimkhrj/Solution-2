package binaryReverse;

import java.util.Scanner;

public class BinaryReverse {
	/**
	 * Get Integer vlaue from Binary
	 * @param binaryString
	 * @return reverseNumber
	 */
	private static int getIntegerFromBinary(String binaryString) {
		int reverseNumber = Integer.parseInt(binaryString, 2);
		return reverseNumber;
	}

	/**
	 * Reverse a Binary number
	 * @param stringBinary
	 * @return reverseWord
	 */
	private static String getReverse(String stringBinary) {
		StringBuilder sb = new StringBuilder(stringBinary);
		String reverseWord = sb.reverse().toString();
		return reverseWord;
	}
	
	/**
	 * Get Binary from Integer number
	 * @param stringNumber
	 * @return
	 */
	private static String getBinaryFromInteger(String stringNumber) {
		int intNumber = Integer.parseInt(stringNumber);		
		String binaryString = String.format("%8s", Integer.toBinaryString(intNumber)).replace(' ', '0');
		return binaryString;
	}
	
	 public static void main(String[] args) {
		    Scanner scannerObj = new Scanner(System.in);  // Creating a scanner object
		    System.out.println("Enter a number :");

		    String inNumber = scannerObj.nextLine(); 	// Reading the number as String
		    System.out.println("Entered Number is: " + inNumber);  
		    
		    String binaryString = BinaryReverse.getBinaryFromInteger(inNumber); // converting to Binary String value
		    		    
		    String reverseBinaryString = BinaryReverse.getReverse(binaryString); // reversing the Binary with padding
		    
		    int reverseNumber = BinaryReverse.getIntegerFromBinary(reverseBinaryString); //converting Binary to integer  
		    System.out.println("Reverse Number is :"+reverseNumber);
		    		    
		    
		  }
}
