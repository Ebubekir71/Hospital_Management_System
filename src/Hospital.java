import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private List<Patient> patients;
    private List<Doctor> doctors;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    public String getHospitalName() {
        return hospitalName;
    }
    public List<Patient> getPatients() {
        return patients;
    }
    public List<Doctor> getDoctors() {
        return doctors;
    }
}
