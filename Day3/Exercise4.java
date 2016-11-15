public class Exercise4 { 

	public static void main(String args[]) {

		System.out.println("To find distance point-to-point: ");
		System.out.println("Write x1: ");
		String str1 = System.console().readLine();
		double x1 = Double.parseDouble(str1);
		System.out.println("Write x2: ");
		String str2 = System.console().readLine();
		double x2 = Double.parseDouble(str2);
		System.out.println("Write y1: ");
		String str3 = System.console().readLine();
		double y1 = Double.parseDouble(str3);
		System.out.println("Write y2: ");
		String str4 = System.console().readLine();
		double y2 = Double.parseDouble(str4);

		double x = x1 - x2;
		double y = y1 - y2;
		double xResult = Math.pow(x,2);
		double yResult = Math.pow(y,2);
		double distance = xResult + yResult;
		double distanceFinal = Math.sqrt(distance);

		System.out.printf("The final distance point-to-point is: %.5f%n",distanceFinal);

	}
}