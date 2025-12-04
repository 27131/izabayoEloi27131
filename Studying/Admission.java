import java.util.Date;
public class Admission extends Patient {
    private Date admissionDate;
    private int roomNumber;
    private float roomCharges;
    //Constructor
    public Admission(int id, Date creatDate, Date updatedDate, String hospitalName, 
        String address, String email,String phoneNumber, String departmentName, 
        String departmentCode, String doctorName, String specialization,String doctorEmail, 
        String phone, String nurseName, String shift, int yearsOfExperience, 
        String patientName,String gender, String contactNumber, int age, Date admissionDate,
        int roomNumber, float roomCharges) {
        super(id, creatDate, updatedDate, hospitalName, address, email, phoneNumber, 
            departmentName, departmentCode,doctorName, specialization, doctorEmail, phone,
             nurseName, shift, yearsOfExperience, patientName,gender, contactNumber, age);
        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
        this.roomCharges = roomCharges;
    }
    //Getters
    public Date getAdmissionDate() {
        return admissionDate;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public float getRoomCharges() {
        return roomCharges;
    }
    //Setters
    public void setAdmissionDate(Date admissionDate) {
        if (admissionDate==null) {
            throw new IllegalArgumentException("Admission date must not be Empty");
        }
        this.admissionDate = admissionDate;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void setRoomCharges(float roomCharges) {
        if (roomCharges<=0) {
            throw new IllegalArgumentException("Charges must exceed 0");
        }
        this.roomCharges = roomCharges;
    }
    
    
}
