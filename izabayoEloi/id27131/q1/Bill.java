package id27131.q1;

public class Bill extends Treatment {
    private double doctorFee;
    private double medicineCost;

    public Bill(int id, String createdDate, String updatedDate,
                String hospitalName, String address, String hospPhone, String hospEmail,
                String departmentName, String departmentCode,
                String doctorName, String specialization, String doctorEmail, String doctorPhone,
                String nurseName, String shift, int yearsOfExperience,
                String patientName, int age, String gender, String contactNumber,
                String admissionDate, int roomNumber, double roomCharges,
                String diagnosis, String treatmentGiven, double treatmentCost,
                double doctorFee, double medicineCost)
            throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, hospPhone, hospEmail,
              departmentName, departmentCode, doctorName, specialization, doctorEmail, doctorPhone,
              nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber,
              admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost);
        setDoctorFee(doctorFee);
        setMedicineCost(medicineCost);
    }

    public double getDoctorFee() { return doctorFee; }
    public void setDoctorFee(double doctorFee) throws HospitalDataException {
        if (doctorFee < 0) throw new HospitalDataException("Doctor fee cannot be negative");
        this.doctorFee = doctorFee;
    }

    public double getMedicineCost() { return medicineCost; }
    public void setMedicineCost(double medicineCost) throws HospitalDataException {
        if (medicineCost < 0) throw new HospitalDataException("Medicine cost cannot be negative");
        this.medicineCost = medicineCost;
    }
}
