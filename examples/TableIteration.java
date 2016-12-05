class TableIteration  {

	public static void tableIteration(int i){  
		while (i < 10) { 
			double x = (double) i; 
			System.out.println(x + " " + Math.log(x) / Math.log(2)); 
			i = i + 1; 
		}
	}

	public static void main(String[] args) {
		int i = 1;
		tableIteration(i);
	}
	
}