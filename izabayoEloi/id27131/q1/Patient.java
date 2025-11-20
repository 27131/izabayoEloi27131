package id27131.q1;

public class Patient extends Nurse {
    private String patientName;
    private int age;
    private String gender; // Male/Female/Other (case-insensitive)
    private String contactNumber; // 10 digits

    public Patient(int id, String createdDate, String updatedDate,
                   String hospitalName, String address, String hospPhone, String hospEmail,
                   String departmentName, String departmentCode,
                   String doctorName, String specialization, String doctorEmail, String doctorPhone,
                   String nurseName, String shift, int yearsOfExperience,
                   String patientName, int age, String gender, String contactNumber)
            throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, hospPhone, hospEmail,
              departmentName, departmentCode, doctorName, specialization, doctorEmail, doctorPhone,
              nurseName, shift, yearsOfExperience);
        setPatientName(patientName);
        setAge(age);
        setGender(gender);
        setContactNumber(contactNumber);
    }

    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) throws HospitalDataException {
        if (patientName == null || patientName.trim().isEmpty())
            throw new HospitalDataException("Patient name cannot be empty");
        this.patientName = patientName;
    }

    public int getAge() { return age; }
    public void setAge(int age) throws HospitalDataException {
        if (age <= 0) throw new HospitalDataException("Age must be greater than 0");
        this.age = age;
    }

    public String getGender() { return gender; }
    public void setGender(String gender) throws HospitalDataException {
        if (gender == null) throw new HospitalDataException("Gender required");
        String g = gender.trim().toLowerCase();
        if (!g.equals("male") && !g.equals("female") && !g.equals("other"))
            throw new HospitalDataException("Invalid gender");
        this.gender = gender;
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws HospitalDataException {
        if (contactNumber == null || !contactNumber.matches("\\d{10}"))
            throw new HospitalDataException("Contact number must be 10 digits");
        this.contactNumber = contactNumber;
    }
}
