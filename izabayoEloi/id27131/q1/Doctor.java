package id27131.q1;

public class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone; // 10 digits

    public Doctor(int id, String createdDate, String updatedDate,
                  String hospitalName, String address, String hospPhone, String hospEmail,
                  String departmentName, String departmentCode,
                  String doctorName, String specialization, String doctorEmail, String phone)
            throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, hospPhone, hospEmail,
              departmentName, departmentCode);
        setDoctorName(doctorName);
        setSpecialization(specialization);
        setDoctorEmail(doctorEmail);
        setPhone(phone);
    }

    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) throws HospitalDataException {
        if (doctorName == null || doctorName.trim().isEmpty())
            throw new HospitalDataException("Doctor name cannot be empty");
        this.doctorName = doctorName;
    }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) throws HospitalDataException {
        if (specialization == null || specialization.trim().isEmpty())
            throw new HospitalDataException("Specialization cannot be empty");
        this.specialization = specialization;
    }

    public String getDoctorEmail() { return doctorEmail; }
    public void setDoctorEmail(String doctorEmail) throws HospitalDataException {
        if (doctorEmail == null || !doctorEmail.contains("@"))
            throw new HospitalDataException("Invalid doctor email");
        this.doctorEmail = doctorEmail;
    }

    public String getPhone() { return phone; }
    public void setPhone(String phone) throws HospitalDataException {
        if (phone == null || !phone.matches("\\d{10}"))
            throw new HospitalDataException("Doctor phone must be 10 digits");
        this.phone = phone;
    }
}
