import java.util.Date;

public class Treatment extends Admission{
    private String diagnosis,treatmentGiven;
    private float treatmentCost;
    //Constructor
    public Treatment(int id, Date creatDate, Date updatedDate, String hospitalName, 
        String address, String email,String phoneNumber, String departmentName,
        String departmentCode, String doctorName, String specialization,String doctorEmail,
        String phone, String nurseName, String shift, int yearsOfExperience, 
        String patientName,String gender, String contactNumber, int age, Date admissionDate,
        int roomNumber, float roomCharges,String diagnosis, String treatmentGiven, 
        float treatmentCost) {
        super(id, creatDate, updatedDate, hospitalName, address, email, phoneNumber, 
            departmentName, departmentCode,doctorName, specialization, doctorEmail, phone,
            nurseName, shift, yearsOfExperience, patientName,gender, contactNumber, age, 
            admissionDate, roomNumber, roomCharges);
        this.diagnosis = diagnosis;
        this.treatmentGiven = treatmentGiven;
        this.treatmentCost = treatmentCost;
    }
    //Getters
    public String getDiagnosis() {
        return diagnosis;
    }
    public String getTreatmentGiven() {
        return treatmentGiven;
    }
    public float getTreatmentCost() {
        return treatmentCost;
    }
    //Setters
    public void setDiagnosis(String diagnosis) {
        if (diagnosis==null) {
            throw new IllegalArgumentException("Diagnosis must not be Empty");
        }

        this.diagnosis = diagnosis;
    }
    public void setTreatmentGiven(String treatmentGiven) {
        if (treatmentGiven==null) {
            throw new IllegalArgumentException("Treatment must not be Empty");
        }
        this.treatmentGiven = treatmentGiven;
    }
    public void setTreatmentCost(float treatmentCost) {
        if (treatmentCost<=0) {
            throw new IllegalArgumentException("Treatment Cost must exceed 0");
        }
        this.treatmentCost = treatmentCost;
    }
    
    
    
}
