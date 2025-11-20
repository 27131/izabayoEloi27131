package id27131.q1;

public class Treatment extends Admission {
    private String diagnosis;
    private String treatmentGiven;
    private double treatmentCost;

    public Treatment(int id, String createdDate, String updatedDate,
                     String hospitalName, String address, String hospPhone, String hospEmail,
                     String departmentName, String departmentCode,
                     String doctorName, String specialization, String doctorEmail, String doctorPhone,
                     String nurseName, String shift, int yearsOfExperience,
                     String patientName, int age, String gender, String contactNumber,
                     String admissionDate, int roomNumber, double roomCharges,
                     String diagnosis, String treatmentGiven, double treatmentCost)
            throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, hospPhone, hospEmail,
              departmentName, departmentCode, doctorName, specialization, doctorEmail, doctorPhone,
              nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber,
              admissionDate, roomNumber, roomCharges);
        setDiagnosis(diagnosis);
        setTreatmentGiven(treatmentGiven);
        setTreatmentCost(treatmentCost);
    }

    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) throws HospitalDataException {
        if (diagnosis == null || diagnosis.trim().isEmpty())
            throw new HospitalDataException("Diagnosis cannot be empty");
        this.diagnosis = diagnosis;
    }

    public String getTreatmentGiven() { return treatmentGiven; }
    public void setTreatmentGiven(String treatmentGiven) throws HospitalDataException {
        if (treatmentGiven == null) treatmentGiven = "";
        this.treatmentGiven = treatmentGiven;
    }

    public double getTreatmentCost() { return treatmentCost; }
    public void setTreatmentCost(double treatmentCost) throws HospitalDataException {
        if (treatmentCost < 0) throw new HospitalDataException("Treatment cost cannot be negative");
        this.treatmentCost = treatmentCost;
    }
}
