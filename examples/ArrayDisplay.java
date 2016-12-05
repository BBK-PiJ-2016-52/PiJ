class ArrayDisplay {
	
//When you make an assignment to an array variable, it simply copies the reference. But it doesn’t copy the array itself!

	public static void printArray(int[] a) { 
		System.out.print("{" + a[0]); 
		for (int i = 1; i < a.length; i++) { 
			System.out.print(", " + a[i]); 
		} 
		System.out.println("}"); 
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4}; 
		printArray(a);
	}
}

/*System.out.println(Arrays.toString(a));
And the output is:
[1, 2, 3, 4]

****

double[] b = Arrays.copyOf(a, 3);
The second parameter is the number of elements you want to copy, so you can also use copyOf to copy just part of an array.
*/
