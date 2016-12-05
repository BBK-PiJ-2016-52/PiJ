class Divisible {
	
	public static boolean isStatic(int m, int n){
		boolean hoopyFlag;
		if (((m/n)%2) == 0) {
			hoopyFlag = true;
		}else {
			hoopyFlag = false;
		}
		return hoopyFlag;
	}

	public static void main(String[] args) {
		int m = 4;
		int n = 2;
		System.out.print(isStatic(m,n));
	}
}
