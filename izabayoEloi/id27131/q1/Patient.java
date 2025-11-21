package id27131.q1;

public class Patient {
    private String patientName;
    private int age;
    private String gender;
    private String contactNumber;

    public Patient(String patientName, int age, String gender, String contactNumber) throws HospitalDataException {
        if (patientName == null || patientName.trim().isEmpty())
            throw new HospitalDataException("Patient name cannot be empty");
        this.patientName = patientName;

        if (age <= 0)
            throw new HospitalDataException("Age must be > 0");
        this.age = age;

        if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female") && !gender.equalsIgnoreCase("Other"))
            throw new HospitalDataException("Gender must be Male/Female/Other");
        this.gender = gender;

        if (contactNumber == null || !contactNumber.matches("\\d{10}"))
            throw new HospitalDataException("Contact number must be 10 digits");
        this.contactNumber = contactNumber;
    }

    public String getPatientName() { return patientName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getContactNumber() { return contactNumber; }
}
