class Exercise1 {
	public static void main(String[] args) {
		double d1 = 1.255;
		double d2 = d1 + (7.0 - 4.0 - 3.0);
		if (d1 == d2) {
			System.out.println("1.255 is equal to 1.255 plus 7 minus 7");
		} else {
			System.out.println("1.255 is NOT equal to 1.255 plus 7 minus 7");
		}
	}	
}
// The result expected was correct as java will compute in order as per d2 stament so the final result will be different from 1.255 taking the remainder as magic number. Otherwise the equal will be true if the operations are in parenthesis.