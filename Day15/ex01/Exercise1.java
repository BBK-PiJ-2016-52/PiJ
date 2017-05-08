import java.util.* ;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class Exercise1 {
	
	public static void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();
		int n =0;

		while(n <= (userInput - 1)){
			intList.add(n);
			n++;
		}	

/*
			intList.add(0);
			intList.add(1);
			intList.add(2);
			intList.add(3);
			intList.add(4);
			intList.add(5);
			intList.add(6);
			intList.add(7);
			intList.add(8);				
			intList.add(9);
			intList.add(10);
			intList.add(11);
			intList.add(12);
			intList.add(13);
			*/

// What happens is when you increase the user input it will add them to the index but will be complaining about the size, 
// as per list remove the same amount. To make it work the list must have the same size as the user input.	
	
			try {
				intList.remove(0);
				System.out.println(intList.get(userInput));
				intList.remove(0);
				System.out.println(intList.get(userInput));
				intList.remove(0);
				System.out.println(intList.get(userInput));
				intList.remove(0);
				System.out.println(intList.get(userInput));
				intList.remove(0);
				System.out.println(intList.get(userInput));
				intList.remove(0);
				System.out.println(intList.get(userInput));
				intList.remove(0);	
				System.out.println(intList.get(userInput));
			} 
			catch (IndexOutOfBoundsException ex) {
				ex.printStackTrace();
			}
		}

		public static void main(String[] args) {
			int userInput = 10;
			launch(userInput);
		}
	}