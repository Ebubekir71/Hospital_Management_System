public class Patient {
    private String name;
    private String surname;
    private String illness;

    public Patient(String name, String surname, String illness) {
        this.name = name;
        this.surname = surname;
        this.illness = illness;

    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getIllness() {
        return illness;
    }
    public String getPatientDetails() {
        return name + " " + surname + " " + illness;
    }
}
