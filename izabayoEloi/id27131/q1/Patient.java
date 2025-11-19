package id27131.q1;

import java.util.Date;

public class Patient extends Nurse{
    private String patientName;
    private int age;
    private String gender;
    private int contactNumber;
    public Patient(int id, Date createdDate, Date updatedDate, String hospitalName, String address, int phoneNumber,
            String email, String departmentName, int departmentCode, String doctorName, String specialization,
            String doctorEmail, int phone, String nurseName, String shift, int yearsOfExperience, String patientName,
            int age, String gender, int contactNumber) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience);
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    
    
}
