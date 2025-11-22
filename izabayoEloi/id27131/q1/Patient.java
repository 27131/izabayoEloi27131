package id27131.q1;

public class Patient extends Nurse {
    private String patientName;
    private int age;
    private String gender;
    private String contactNumber;

    public Patient(int id, String createdDate, String updatedDate,
                   String hospitalName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String doctorName, String specialization, String doctorEmail, String doctorPhone,
                   String nurseName, String shift, int yearsOfExperience,
                   String patientName, int age, String gender, String contactNumber) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
              departmentName, departmentCode, doctorName, specialization, doctorEmail, doctorPhone,
              nurseName, shift, yearsOfExperience);

        if (patientName == null || patientName.trim().isEmpty())
            throw new HospitalDataException("Patient name cannot be empty");
        if (age <= 0) throw new HospitalDataException("Age must be greater than 0");
        if (!gender.equals("Male") && !gender.equals("Female") && !gender.equals("Other"))
            throw new HospitalDataException("Gender must be Male, Female, or Other");
        if (contactNumber == null || !contactNumber.matches("\\d{10}"))
            throw new HospitalDataException("Contact number must be exactly 10 digits");

        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    public String getPatientName() { return patientName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getContactNumber() { return contactNumber; }
}
