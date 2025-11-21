package id27131.q1;

public class Bill {
    private double roomCharges;
    private double treatmentCost;
    private double doctorFee;
    private double medicineCost;

    public Bill(double roomCharges, double treatmentCost, double doctorFee, double medicineCost) throws HospitalDataException {
        if (roomCharges < 0 || treatmentCost < 0 || doctorFee < 0 || medicineCost < 0)
            throw new HospitalDataException("All fees must be >= 0");
        this.roomCharges = roomCharges;
        this.treatmentCost = treatmentCost;
        this.doctorFee = doctorFee;
        this.medicineCost = medicineCost;
    }

    public double getDoctorFee() { return doctorFee; }
    public double getMedicineCost() { return medicineCost; }

    public double generateBill() {
        return roomCharges + treatmentCost + doctorFee + medicineCost;
    }
}
