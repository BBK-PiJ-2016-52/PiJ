package ex02;

public class Patient {

  private String name;
  private int age;
  private String illness;
  private Patient nextPatient;

  public Patient(String name, int age, String illness) {
    this.name = name;
    this.age = age;
    this.illness = illness;
    this.nextPatient = null;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getIllness() {
    return illness;
  }

  public Patient getNextPatient() {
    return nextPatient;
  }

  public void addPatient(Patient newPatient) {
    if (this.nextPatient == null) {
      this.nextPatient = newPatient;
    } else {
      this.nextPatient.addPatient(newPatient);
    }
  }

  public boolean deletePatient(Patient patient) {

    if (this.nextPatient == null) {
      //patient to be removed was not found
      return false;
    } else if (this.nextPatient.name.equals(patient.name)) {
      //we found it...it is the next one...
      //now link this patient to the one after the next
      this.nextPatient = nextPatient.nextPatient;
      return true;
    } else {
      return this.nextPatient.deletePatient(patient);
    }

  }
}
