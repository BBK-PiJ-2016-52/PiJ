class CountUp  {
	public static void countup(int n) { 
		if (n == 0) { 
			System.out.println("Blastoff!"); 
		} else { 
			countup(n - 1); 
			System.out.println(n); 
		} 
	}
// how to show a invoked method:
	public static void main(String[] args) {
		countup(3); 
		System.out.println("Have a nice day.");
	}
}