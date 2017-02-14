import java.io.*;
import java.util.*;

class BinaryAndDecimal  {

	public static void main(String[] args) {

		System.out.println("Please make a choice (0 - 1): ");
		System.out.println("0 - Binary to Decimal.");
		System.out.println("1 - Decimal to Binary.");
		System.out.println("2 - Power of a Number.");
		System.out.println("3 - Exit.");
		String str = System.console().readLine();
		int optionSelected = Integer.parseInt(str);
		switch (optionSelected){
			case 0: binaryInput();
			break;
			case 1: decimalInput();
			break;
			case 2: power2();
			break;
			case 3: System.out.println("Thanks for using the BinaryAndDecimal program.");
			break;
		} 
	}

	public static void power2(){
		System.out.println("Type the base (b) and exponent (e): ");
		System.out.println("b: ");
		String str2 = System.console().readLine();
		int b = Integer.parseInt(str2);
		System.out.println("e: ");
		String str22 = System.console().readLine();
		int e = Integer.parseInt(str22);

		System.out.println( b + " pow " + e + " is: "  + Math.pow(b,e));
		System.out.println("2 power of " + e + " is: " + Math.pow(2,e));
	}

	public static void binaryInput(){
		System.out.println("Enter a binary number: ");
		String str0 = System.console().readLine();
		binary2decimal(str0);
	}

	public static void decimalInput(){
		System.out.println("Enter a decimal number: ");
		String str1 = System.console().readLine();
		decimal2binary(str1);
	}

	public static void binary2decimal(String str0){
		double j = 0;
		for(int i = 0; i <= str0.length() - 1; i++){
			if(str0.charAt(i)== '1') {
				j = j + Math.pow(2,str0.length() -1 -i);
			}
		}	
		System.out.println("You entered Binary: " + str0 + " in Decimal is: " + j);
	}

	public static void decimal2binary(String str1){
		System.out.println("I have to do something." + str1);
	}
}