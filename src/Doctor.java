public class Doctor {
    private String doctorName;
    private String speciality;

    public Doctor(String doctorName, String speciality) {
        this.doctorName = doctorName;
        this.speciality = speciality;
    }

    public String getDoctorName() {
        return doctorName;
    }
    public String getSpeciality(){
        return speciality;
    }
}
