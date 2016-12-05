import java.util.* ;

public class Exercise3a {

  public static void main ( String[] args) {
    Scanner scan = new Scanner( System.in );
    int data=0, slot=0 ;

    int[] value = new int[10];

    while(slot < 10){
      try { 
        System.out.print("Enter the number: ");
        data = scan.nextInt();
        value[slot] = data;
        slot++;
      }

      catch (NullPointerException ex){  
        System.out.println("Prepare for WAR!");
        ex.printStackTrace(); 
      }

      catch (Exception ex) {  
        ex.printStackTrace();
        break;  
      } 

    }

  }

}