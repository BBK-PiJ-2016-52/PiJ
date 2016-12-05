class Factorial {
	
	public static int factorial(int n) { 
		if (n == 0) { 
			return 1; 
		} 

		int recurse = factorial(n - 1); 
		int result = n * recurse; 
		return result; }

	public static void main(String[] args) {
		int n = 3;
		System.out.print(factorial(n));
	}
}