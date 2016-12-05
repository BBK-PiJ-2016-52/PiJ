class Exercise3 {
	public static void main(String[] args) {
		Exercise3 ex3 = new Exercise3();
		System.out.println(ex3.hailstone(5));
	}

	public static int hailstone(int n){
		if(n)
		int result = hailstone(n/2);		
		return result;
		}
	}


