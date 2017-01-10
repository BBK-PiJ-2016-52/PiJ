class Exercise2 {
	public static void main(String[] args) {
		System.out.println("Write your first number: ");
		String str1 = System.console().readLine();
		int num1 = Integer.parseInt(str1);
		System.out.println("Write your second number: ");
		String str2 = System.console().readLine();
		int num2 = Integer.parseInt(str2);
		System.out.println("Select an option: ");
		System.out.println("1 for Addition");
		System.out.println("2 for Substraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Division");
		String str3 = System.console().readLine();
		int num3 = Integer.parseInt(str3);
		if (num3 == 1) {
			System.out.println(num1 + num2);
		}
		if (num3 == 2) {
			System.out.println(num1 - num2);
		}
		if (num3 == 3) {
			System.out.println(num1 * num2);
		}
		if (num3 == 4) {
			System.out.println(num1 / num2);
		}				
	}
}