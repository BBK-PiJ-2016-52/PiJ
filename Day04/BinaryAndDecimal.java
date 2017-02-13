import java.io.*;

class BinaryAndDecimal  {

	public static void main(String[] args) {

		System.out.println("Type the base (b) and exponent (e): ");
		System.out.println("b: ");
		String str1 = System.console().readLine();
		int b = Integer.parseInt(str1);
		System.out.println("e: ");
		String str2 = System.console().readLine();
		int e = Integer.parseInt(str2);

		System.out.println( b + " pow " + e + " is: "  + Math.pow(b,e));
		System.out.println("2 power of " + e + " is: " + Math.pow(2,e));

		System.out.println("Now enter a binary number: ");
		String str3 = System.console().readLine();

		double j = 0;

		for(int i = 0; i <= str3.length() - 1; i++){
			if(str3.charAt(i)== '1') {
				j = j + Math.pow(2,str3.length() -1 -i);
				//System.out.println("Times Im doing it" + j);
			}
			System.out.println(j);
		}
	}
}