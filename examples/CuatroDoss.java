class CuatroDoss  {
	
	public static void zool(int num1, String s1, String s2){
		System.out.print(num1);
		System.out.println(s1 + s2);
	}

	public static void comp(String fruit1, String fruit2){
		System.out.println(fruit1.equals(fruit2));

	}
	public static void main(String[] args) {
		int num1 = 2;
		String s1 ="Letra";
		String s2 = "Otra letra";
		zool(num1,s1,s2);
		String fruit1 = "Apple";
		String fruit2 = "Orange";
		comp(fruit1,fruit2);
	}
}

