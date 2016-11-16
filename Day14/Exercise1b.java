class Exercise1b  {

	public static void main(String[] args) {
	
			Exercise1b ex1b = new Exercise1b();
			System.out.println(ex1b.mcCarthy91(95));
	}

		int mcCarthy91(int n) {
			if (n > 100) {
				//System.out.println(n);
				return n - 10;
			} else {
				System.out.println(n);
				return mcCarthy91(mcCarthy91(n+11));
			}
		}	
}
// 50 = 5 91s, 73 = 3 91s, 95 = 1 91s