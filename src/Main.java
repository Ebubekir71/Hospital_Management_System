import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of hospital : ");
        String hospitalName = scanner.nextLine();
        Hospital hospital = new Hospital(hospitalName);

        System.out.print("How many doctors? : ");
        int numberOfDoctors = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfDoctors; i++) {
            System.out.print("Enter the name of "+ (i+1)+ " doctor : ");
            String doctorName = scanner.nextLine();
            System.out.print("What is the specialty of "+ (i+1)+ " doctor? : ");
            String speciality = scanner.nextLine();
            hospital.addDoctor(new Doctor(doctorName, speciality));
        }

        System.out.print("How many patients? : ");
        int numberOfPatients = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfPatients; i++) {
            System.out.print("Enter the name of "+ (i+1)+" patient : ");
            String patientName = scanner.nextLine();
            System.out.print("What is the surname of "+ (i+1)+ " patient? : ");
            String surname = scanner.nextLine();
            System.out.print("What is the illness of "+ (i+1)+ " patient? : ");
            String illness = scanner.nextLine();
            hospital.addPatient(new Patient(patientName, surname, illness));
        }

        System.out.print("Which patient wants a appointment ? : ");
        String patientName = scanner.nextLine();
        Patient selectedPatient = hospital.getPatients().stream()
                .filter(p -> p.getName().equalsIgnoreCase(patientName))
                .findFirst()
                .orElse(null);
        if (selectedPatient == null) {
            System.out.print("Patient not found");
            return;
        }

        System.out.print("Which doctor (enter a name) ? : ");
        String doctorName = scanner.nextLine();
        Doctor selectedDoctor = hospital.getDoctors().stream()
                .filter(d -> d.getDoctorName().equalsIgnoreCase(doctorName))
                .findFirst()
                .orElse(null);
        if (selectedDoctor == null) {
            System.out.print("Doctor not found");
            return;
        }
        System.out.print("Enter a appointment date (yyyy-mm-dd) ? : ");
        LocalDate appointmentDate = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter appointment time (HH:mm) ? : ");
        LocalTime appointmentTime = LocalTime.parse(scanner.nextLine());

        Appointment appointment = new Appointment(selectedPatient, selectedDoctor, appointmentDate, appointmentTime);
        appointment.printDetails();
    }
}