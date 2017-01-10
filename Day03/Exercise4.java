public class Exercise4 { 

	public static void main(String args[]) {

		System.out.println("Distance point-to-point: X, Y, Z: ");
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
		System.out.println("Write z1: ");
		String str5 = System.console().readLine();
		double z1 = Double.parseDouble(str5);
		System.out.println("Write z2: ");
		String str6 = System.console().readLine();
		double z2 = Double.parseDouble(str6);

		double x = x1 - x2;
		double y = y1 - y2;
		double z = z1 - z2;
		double xResult = Math.pow(x,2);
		double yResult = Math.pow(y,2);
		double zResult = Math.pow(z,2);
		double distanceXY = xResult + yResult;
		double distanceXZ = zResult + xResult;
		double distanceYZ = yResult + zResult;
		double distanceFinalXY = Math.sqrt(distanceXY);
		double distanceFinalXZ = Math.sqrt(distanceXZ);
		double distanceFinalYZ = Math.sqrt(distanceYZ);


		if (distanceFinalXY < distanceFinalXZ) {
			System.out.printf("The closer distance point-to-point is XY: %.5f%n",distanceFinalXY);
		}
		if (distanceFinalXZ < distanceFinalYZ) {
			System.out.printf("The closer distance point-to-point is XZ: %.5f%n",distanceFinalXZ);
		}
		if (distanceFinalYZ < distanceFinalXY) {
			System.out.printf("The closer distance point-to-point is YZ: %.5f%n",distanceFinalXZ);
		}		
	}
}