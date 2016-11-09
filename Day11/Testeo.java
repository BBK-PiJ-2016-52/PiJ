import org.junit.*;
import static org.junit.Assert.*;

public class Testeo {
   @Test
   public void testCapitalisation() {
      String str = "JUnit is working fine";
      assertEquals("Junit is working fine",str);
   }

   @Test
   public void testLength() {
      String str = "Junit is working fine ";
      assertEquals("Junit is working fine",str);
   }

   @Test
   public void testLengthAndCapitalLetters() {
      String str = "Junit is working fine";
      assertEquals("Junit is working fine",str);
   }

}