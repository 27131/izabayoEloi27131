package id27131.q1;

import java.util.Date;

public class Nurse extends Doctor{
    private String nurseName;
    private String shift;
    private int yearsOfExperience;
    public Nurse(int id, Date createdDate, Date updatedDate, String hospitalName, String address, int phoneNumber,
            String email, String departmentName, int departmentCode, String doctorName, String specialization,
            String doctorEmail, int phone, String nurseName, String shift, int yearsOfExperience) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, phone);
        this.nurseName = nurseName;
        this.shift = shift;
        this.yearsOfExperience = yearsOfExperience;
    }
    public String getNurseName() {
        return nurseName;
    }
    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }
    public String getShift() {
        return shift;
    }
    public void setShift(String shift) {
        this.shift = shift;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
    
}
