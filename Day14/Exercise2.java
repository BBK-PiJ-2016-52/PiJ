class Exercise2  {
	public static void main(String[] args) {
		Exercise2 ex2 = new Exercise2();
		System.out.println(ex2.fib(536870912));
	}

/*	public static int fib(int n) {
		if ((n == 1) || (n == 2)) {
			System.out.println(n);
			return 1;
		} else {
			int result = fib(n-1) + fib(n-2);
			//System.out.println(n);
			return result;
		}
	}
// Max value of int is 2^31-1 = 2147483647, 32-bit
*/


/*
**
**

	public static long fib(long n) {
		if ((n == 1) || (n == 2)) {
			System.out.println(n);
			return 1;
		} else {
			long result = fib(n-1) + fib(n-2);
			//System.out.println(n);
			return result;
		}
	}	
// Max value of long is 2^63-1 = 9223372036854775807, 64-bit

**
**
**
*/

// arrays are 0-based, so F(1) is stored at position 0, etc
	private int[] precalculated = null;
	public int fib(int n) {
		if (precalculated == null) {	
			precalculated = new int[n];
			for (int i = 0; i < precalculated.length; i++) {
				precalculated[i] = -1; // to indicate "not calculated yet"
			}
		}
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			if (precalculated[n-1] != -1) {
				return precalculated[n-1];
			} else {
				int result = fib(n-1) + fib(n-2);
				precalculated[n-1] = result;
				return result;
			}
		}
		
	}
}