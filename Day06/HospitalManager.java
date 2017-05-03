public class HospitalManager {

    // Main method for Hospital Manager with Constructor
    public static void main(String[] args) {

        HospitalManager constructorHM = HospitalManager();
        constructorHM.launch();

    }

    private void launch() {

        Patient firstPatient = new Patient("Eric", 27, "Obese");
        patientListStart = firstPatient;

        Patient secondPatient = new Patient("Doris", 56, "Meningitis");
        addPatient(secondPatient);
        Patient thirdPatient = new Patient("Laura", 16, "Headache");
        addPatient(thirdPatient);
        Patient anotherPatient = new Patient("Nikol", 26, "Broken leg");
        addPatient(anotherPatient);
        Patient anotherPatientTwo = new Patient("Jorge", 16, "Shoulder");
        addPatient(anotherPatientTwo);
        Patient patient6 = new Patient("Hernando", 48, "Ears");
        addPatient(patient6);
        Patient patient7 = new Patient("Angela", 44, "Weight");
        addPatient(patient7);
        Patient patient8 = new Patient("Jim", 84, "Knees");
        addPatient(patient8);
        Patient patient9 = new Patient("Benny", 98, "Cold");
        addPatient(patient9);
        Patient patient10 = new Patient("Debs", 77, "Cancer");
        addPatient(patient10);

        printPatients();

        boolean deleted;
        deleted = deletePatient(patient8);
        System.out.println("Jim deleted: " + deleted);
        printPatients();
        deleted = deletePatient(anotherPatient);
        System.out.println("Jane deleted: " + deleted);
        printPatients();

        // now try and delete first one by point patientListStart at one along chain...
        System.out.println("Deleting first patient John, by updating pointer");
        patientListStart = patientListStart.getNextPatient();
        printPatients();

    }
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

    //returns true if the patient was found and removed, false otherwise
    public boolean deletePatient(String name) {
        if (firstPatient == null) {
            // list is empty, nothing to remove
            return false;
        }
        if (firstPatient.getName().equals(name)) {
            // first patient in the list must be removed
            firstPatient = firstPatient.getNextPatient();
            return true;
        }
        Patient current = firstPatient;
        while (current.getNextPatient() != null) {
            if (current.getNextPatient().getName().equals(name)) {
                // We found it! It is the next one!
                // Now link this patient to the one after the next
                current.setNextPatient(current.getNextPatient().getNextPatient());
                return true;
            }
            current = current.getNextPatient();
        }
        return false;
    }
}
