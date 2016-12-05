class DoubleCheck  {
	
	
	Scanner in = new Scanner(System.in); 
	boolean okay; 
	do { 
		System.out.print("Enter a number: "); 
		if (in.hasNextDouble()) { 
			okay = true; 
		} else { okay = false; 
			String word = in.next(); 
			System.err.println(word + " is not a number"); 
		} 
	} 
	while (!okay); 
	double x = in.nextDouble();


	public static void main(String[] args) {
		doubleCheck();
	}
}