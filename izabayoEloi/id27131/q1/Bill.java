package id27131.q1;

public class Bill extends Treatment {
    private double doctorFee;
    private double medicineCost;

    public Bill(int id, String createdDate, String updatedDate,
                String hospitalName, String address, String phoneNumber, String email,
                String departmentName, String departmentCode,
                String doctorName, String specialization, String doctorEmail, String doctorPhone,
                String nurseName, String shift, int yearsOfExperience,
                String patientName, int age, String gender, String contactNumber,
                String admissionDate, String roomNumber, double roomCharges,
                String diagnosis, String treatmentGiven, double treatmentCost,
                double doctorFee, double medicineCost) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
              departmentName, departmentCode, doctorName, specialization, doctorEmail, doctorPhone,
              nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber,
              admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost);

        if (doctorFee < 0) throw new HospitalDataException("Doctor fee cannot be negative");
        if (medicineCost < 0) throw new HospitalDataException("Medicine cost cannot be negative");

        this.doctorFee = doctorFee;
        this.medicineCost = medicineCost;
    }

    public double getDoctorFee() { return doctorFee; }
    public double getMedicineCost() { return medicineCost; }

    public double generateBill() {
        return getRoomCharges() + getTreatmentCost() + doctorFee + medicineCost;
    }
}
