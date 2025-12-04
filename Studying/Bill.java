import java.util.Date;

public class Bill extends Treatment {
    private float doctorFee,medecineCost,totalBill;
    //Constructors

    public Bill(int id, Date creatDate, Date updatedDate, String hospitalName, 
        String address, String email,String phoneNumber, String departmentName, 
        String departmentCode, String doctorName, String specialization,String doctorEmail,
         String phone, String nurseName, String shift, int yearsOfExperience,
        String patientName,String gender, String contactNumber, int age, Date admissionDate, 
        int roomNumber, float roomCharges,String diagnosis, String treatmentGiven, 
        float treatmentCost, float doctorFee, float medecineCost,float totalBill) {
        super(id, creatDate, updatedDate, hospitalName, address, email, phoneNumber, 
            departmentName, departmentCode,doctorName, specialization, doctorEmail, phone, 
            nurseName, shift, yearsOfExperience, patientName,gender, contactNumber, age, 
            admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven,treatmentCost);
        this.doctorFee = doctorFee;
        this.medecineCost = medecineCost;
        this.totalBill = totalBill;
    }
    //Getters

    public float getDoctorFee() {
        return doctorFee;
    }

    public float getMedecineCost() {
        return medecineCost;
    }

    public float getTotalBill() {
        return totalBill;
    }
    //Setters
    public void setDoctorFee(float doctorFee) {
        if (doctorFee<=0) {
            throw new IllegalArgumentException("Doctor fee must exceed 0.");
        }
        this.doctorFee = doctorFee;
    }

    public void setMedecineCost(float medecineCost) {
        if (medecineCost<=0) {
            throw new IllegalArgumentException("Medecine Cost must exceed 0.");
        }
        this.medecineCost = medecineCost;
    }

    public void setTotalBill(float totalBill) {
        if (totalBill<=0) {
            throw new IllegalArgumentException("Total Bill must exceed 0");
        }
        this.totalBill = totalBill;
    }
    
    
}
