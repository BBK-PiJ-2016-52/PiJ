class scanDouble {
	
}

public static void scanDouble() { 
	Scanner in = new Scanner(System.in); 
	System.out.print("Enter a number: "); 
	if (!in.hasNextDouble()) { 
		String word = in.next(); 
		System.err.println(word + " is not a number"); 
		return; 
	} 
	double x = in.nextDouble(); 
	printLogarithm(x); 
}