package id27131.q1;
import java.util.Date;

public class Admission extends Patient{
    private Date admissionDate;
    private int roomNumber;
    private int roomCharges;
    public Admission(int id, Date createdDate, Date updatedDate, String hospitalName, String address, int phoneNumber,
            String email, String departmentName, int departmentCode, String doctorName, String specialization,
            String doctorEmail, int phone, String nurseName, String shift, int yearsOfExperience, String patientName,
            int age, String gender, int contactNumber, Date admissionDate, int roomNumber, int roomCharges) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience, patientName, age,
                gender, contactNumber);
        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
        this.roomCharges = roomCharges;
    }
    public Date getAdmissionDate() {
        return admissionDate;
    }
    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public int getRoomCharges() {
        return roomCharges;
    }
    public void setRoomCharges(int roomCharges) {
        this.roomCharges = roomCharges;
    }
    
    
}
