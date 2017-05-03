public class HospitalManager {
   private Patient firstPatient = null;
   
   // this is a member method of class HospitalManager
   public void addPatient(Patient newPatient) {
   (firstPatient = null) {
   firstPatient = newPatient;
   return;
   }
   Patient current = this.firstPatient;
      while (current.getNextPatient() != null) {
      // this means we are not yet at the end of the list
      current = current.getNextPatient();
      }
   // at this point, current points to the last patient
   current.setNextPatient(newPatient);
   }
}
