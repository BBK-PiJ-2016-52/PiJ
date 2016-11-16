public class Exercise1a  {
	
	public static void main(String[] args) {
		Exercise1 ex1a = new Exercise1();
		System.out.println(ex1a.doggyMethod(6));
	}
	
	public String doggyMethod(int n) {
		//String result = doggyMethod(n-3) + n + doggyMethod(n-2);
		if (n <= 0) {
			return "";
		}
	
		return "" + doggyMethod(n-3) + n + doggyMethod(n-2);
	}
}
