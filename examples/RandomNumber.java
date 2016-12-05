import java.util.Scanner;

class RandomNumber {
	
	public static int search(double[] a, double target) { 
		for (int i = 0; i < a.length; i++) { 
			if (a[i] == target) { 
				return i; 
			} 
		} return -1; 
	}

	public static void storeNumbers(double[] a){
		for (int i = 0; i < 10; i++) {
			
		}
	}

	public static void main(String[] args) {
		double target = 27;
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
	}

}