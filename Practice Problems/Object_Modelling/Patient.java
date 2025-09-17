import java.util.*;
class Patient {
    String name;
}

class Doctor {
    String name;

    void consult(Patient p) {
        System.out.println(name + " is consulting " + p.name);
    }
}

class Hospital {
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();
}
