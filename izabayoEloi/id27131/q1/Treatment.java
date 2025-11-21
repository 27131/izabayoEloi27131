package id27131.q1;

public class Treatment {
    private String diagnosis;
    private String treatmentGiven;
    private double treatmentCost;

    public Treatment(String diagnosis, String treatmentGiven, double treatmentCost) throws HospitalDataException {
        if (diagnosis == null || diagnosis.trim().isEmpty())
            throw new HospitalDataException("Diagnosis cannot be empty");
        this.diagnosis = diagnosis;

        if (treatmentGiven == null || treatmentGiven.trim().isEmpty())
            throw new HospitalDataException("Treatment cannot be empty");
        this.treatmentGiven = treatmentGiven;

        if (treatmentCost <= 0)
            throw new HospitalDataException("Treatment cost must be > 0");
        this.treatmentCost = treatmentCost;
    }

    public String getDiagnosis() { return diagnosis; }
    public String getTreatmentGiven() { return treatmentGiven; }
    public double getTreatmentCost() { return treatmentCost; }
}
