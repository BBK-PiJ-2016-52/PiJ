import java.util.Arrays;

class ExerciseDay05 {
	public static void main(String[] args) {
		
		System.out.println("Welcome to ExerciseDay05.java");
		String[] employeeArray;
		int[] employeeId;
		employeeArray = new String[10];
		employeeId = new int[10];
		for (int i = 0; i < 10 ; i++) {
			System.out.println("Enter the name of the employee: ");
			String employeeName = System.console().readLine();
			employeeArray[i] = employeeName;
			System.out.println("Enter the ID of the employee " + employeeArray[i] + " : ");
			String str = System.console().readLine();
			int stringEmployeeId = Integer.parseInt(str);
			employeeId[i] = stringEmployeeId;
		}
		for (int i = 0;i < employeeId.length - 1 ;i++ ) {
			if (employeeId[i] < 1000) {
				System.out.println("Employees with ID less than 1000: " + employeeArray[i]);	
			}
			if (employeeArray[i].charAt(0) == 'J' || employeeArray[i].charAt(0) == 'S') {
				System.out.println("Employees with name starting with J: " + employeeArray[i]);	
			}
		}
	}
}