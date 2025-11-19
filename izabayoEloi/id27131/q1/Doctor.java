package id27131.q1;

import java.util.Date;

public class Doctor extends Department{
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private int phone;
    public Doctor(int id, Date createdDate, Date updatedDate, String hospitalName, String address, int phoneNumber,
            String email, String departmentName, int departmentCode, String doctorName, String specialization,
            String doctorEmail, int phone) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode);
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }
    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getDoctorEmail() {
        return doctorEmail;
    }
    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    
    
    
}
