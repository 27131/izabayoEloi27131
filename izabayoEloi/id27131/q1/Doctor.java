package id27131.q1;

public class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;

    public Doctor(int id, String createdDate, String updatedDate,
                  String hospitalName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String doctorName, String specialization, String doctorEmail, String phone)
            throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
              departmentName, departmentCode);

        if (doctorName == null || doctorName.trim().isEmpty())
            throw new HospitalDataException("Doctor name cannot be empty");
        if (specialization == null || specialization.trim().isEmpty())
            throw new HospitalDataException("Specialization cannot be empty");
        if (doctorEmail == null || !doctorEmail.contains("@"))
            throw new HospitalDataException("Doctor email must contain '@'");
        if (phone == null || !phone.matches("\\d{10}"))
            throw new HospitalDataException("Doctor phone must be exactly 10 digits");

        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }

    public String getDoctorName() { return doctorName; }
    public String getSpecialization() { return specialization; }
    public String getDoctorEmail() { return doctorEmail; }
    public String getPhone() { return phone; }
}
