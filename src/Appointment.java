import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;

    public Appointment(Patient patient, Doctor doctor, LocalDate appointmentDate, LocalTime appointmentTime) {
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }
    public void printDetails() {
        System.out.println(patient.getName() + " has an appointment with" + doctor.getDoctorName()
                + " (" + doctor.getSpeciality() + ") on " + appointmentDate + " at " + appointmentTime);
    }
}
