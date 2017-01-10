import java.util.ArrayList;
import java.util.stream.Stream;

public  class Exercise3a {
 public static void main(String[] args){
     ArrayList<Integer> myList = new ArrayList<>();
     myList.add(1);
     myList.add(2);
     myList.add(3);
     myList.add(4);
     myList.add(5);

     List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
     
     System.out.println("The list is: " + myList);
     System.out.println("The list is: " + numbers);

     

     Stream<Integer> myStream = myList.stream();



     myStream.forEach((n) -> n*n);
     System.out.println();
    }
}
