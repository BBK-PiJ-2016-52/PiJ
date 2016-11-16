class Exercise2  {
	public static void main(String[] args) {
		Exercise2 ex2 = new Exercise2();
		System.out.println(ex2.fib(4));
	}

	public static int fib(int n) {
		if ((n == 1) || (n == 2)) {
			System.out.println(n);
			return 1;
		} else {
			int result = fib(n-1) + fib(n-2);
			//System.out.println(n);
			return result;
		}
	}	
}