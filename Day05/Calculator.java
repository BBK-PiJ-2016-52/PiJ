class Calculator  {

	private int x;
	private int y;

	Calculator(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int add(int x, int y){
		int result = x + y;
		return result;
	}

	public int substract(int x, int y){
		int result = x - y;
		return result;
	}

	public int multiply(int x,int y){
		int result = x * y;
		return result;
	}

	public double divide(int x,int y){
		double xx = x;
		double yy = y;
		double result = xx / yy;
		return result;
	}

	public int modulus(int x, int y){
		int result = x % y;
		return result;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator(0,0);	
		System.out.println("The numbers for this calculator are: 2, 3.");
		System.out.println("Add: " + calc.add(2,3));
		System.out.println("Substract: " + calc.substract(2,3));
		System.out.println("Multiply: " + calc.multiply(2,3));
		System.out.println("Divide: " + calc.divide(2,3));
		System.out.println("Modulus: " + calc.modulus(2,3));
	}

}