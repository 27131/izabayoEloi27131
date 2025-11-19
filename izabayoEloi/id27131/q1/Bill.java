package id27131.q1;

import java.util.Date;

public class Bill extends Treatment{
    private int doctorFee, medicineCost,totalBill;

    public Bill(int id, Date createdDate, Date updatedDate, String hospitalName, String address, int phoneNumber,
            String email, String departmentName, int departmentCode, String doctorName, String specialization,
            String doctorEmail, int phone, String nurseName, String shift, int yearsOfExperience, String patientName,
            int age, String gender, int contactNumber, Date admissionDate, int roomNumber, int roomCharges,
            String diagnosis, String treatmentGiven, int treatmentCost, int doctorFee, int medicineCost,
            int totalBill) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience, patientName, age,
                gender, contactNumber, admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven,
                treatmentCost);
        this.doctorFee = doctorFee;
        this.medicineCost = medicineCost;
        this.totalBill = totalBill;
    }

    public int getDoctorFee() {
        return doctorFee;
    }

    public void setDoctorFee(int doctorFee) {
        this.doctorFee = doctorFee;
    }

    public int getMedicineCost() {
        return medicineCost;
    }

    public void setMedicineCost(int medicineCost) {
        this.medicineCost = medicineCost;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
    
    
    
}
