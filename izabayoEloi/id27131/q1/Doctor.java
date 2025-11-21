package id27131.q1;

public class Doctor {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;

    public Doctor(String doctorName, String specialization, String doctorEmail, String phone) throws HospitalDataException {
        if (doctorName == null || doctorName.trim().isEmpty())
            throw new HospitalDataException("Doctor name cannot be empty");
        this.doctorName = doctorName;

        if (specialization == null || specialization.trim().isEmpty())
            throw new HospitalDataException("Specialization cannot be empty");
        this.specialization = specialization;

        if (doctorEmail == null || !doctorEmail.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$"))
            throw new HospitalDataException("Invalid email format");
        this.doctorEmail = doctorEmail;

        if (phone == null || !phone.matches("\\d{10}"))
            throw new HospitalDataException("Phone must be 10 digits");
        this.phone = phone;
    }

    public String getDoctorName() { return doctorName; }
    public String getSpecialization() { return specialization; }
    public String getDoctorEmail() { return doctorEmail; }
    public String getPhone() { return phone; }
}
