/*
This is a class for a count down printed up and down whereas you want to display it.
*/
class CountDown  {
	
	public static void countdown(int n) { 
		if (n == 0) { 
			System.out.println("Blastoff!"); 
		} else { 
			System.out.println(n); 
			countdown(n - 1); 
			// To printUp  leave if after the recursion. System.out.println(n); 

		} 
	}

/*
* If value is zero, displayBinary does nothing (that’s the base case).
* If the argument is positive, the method divides it by two and calls displayBinary
* recursively. When the recursive call returns, the method displays one digit of the 
* result and returns (again).
*/

	public static void displayBinary(int value) { 
		if (value > 0) { 
			displayBinary(value / 2); 
			System.out.print(value % 2); 
		} 
	}
	
	public static void nLines(int n) {
	 if (n > 0) { 
	 	System.out.println(); 
	 	nLines(n - 1); 
	 } 
	}

	public static void main(String[] args) {
		int n = 3;
		int value =12;
		countdown(n);
		nLines(n);
		displayBinary(value);
	}

}