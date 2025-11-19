package id27131.q1;

import java.util.Date;

public class Treatment extends Admission{
    private String diagnosis;
    private String treatmentGiven;
    private int treatmentCost;
    public Treatment(int id, Date createdDate, Date updatedDate, String hospitalName, String address, int phoneNumber,
            String email, String departmentName, int departmentCode, String doctorName, String specialization,
            String doctorEmail, int phone, String nurseName, String shift, int yearsOfExperience, String patientName,
            int age, String gender, int contactNumber, Date admissionDate, int roomNumber, int roomCharges,
            String diagnosis, String treatmentGiven, int treatmentCost) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience, patientName, age,
                gender, contactNumber, admissionDate, roomNumber, roomCharges);
        this.diagnosis = diagnosis;
        this.treatmentGiven = treatmentGiven;
        this.treatmentCost = treatmentCost;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public String getTreatmentGiven() {
        return treatmentGiven;
    }
    public void setTreatmentGiven(String treatmentGiven) {
        this.treatmentGiven = treatmentGiven;
    }
    public int getTreatmentCost() {
        return treatmentCost;
    }
    public void setTreatmentCost(int treatmentCost) {
        this.treatmentCost = treatmentCost;
    }
    
    
}
