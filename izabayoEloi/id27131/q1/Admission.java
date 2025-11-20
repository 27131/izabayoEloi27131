package id27131.q1;

public class Admission extends Patient {
    private String admissionDate;
    private int roomNumber;
    private double roomCharges;

    public Admission(int id, String createdDate, String updatedDate,
                     String hospitalName, String address, String hospPhone, String hospEmail,
                     String departmentName, String departmentCode,
                     String doctorName, String specialization, String doctorEmail, String doctorPhone,
                     String nurseName, String shift, int yearsOfExperience,
                     String patientName, int age, String gender, String contactNumber,
                     String admissionDate, int roomNumber, double roomCharges)
            throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, hospPhone, hospEmail,
              departmentName, departmentCode, doctorName, specialization, doctorEmail, doctorPhone,
              nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber);
        setAdmissionDate(admissionDate);
        setRoomNumber(roomNumber);
        setRoomCharges(roomCharges);
    }

    public String getAdmissionDate() { return admissionDate; }
    public void setAdmissionDate(String admissionDate) throws HospitalDataException {
        if (admissionDate == null || admissionDate.trim().isEmpty())
            throw new HospitalDataException("Admission date cannot be empty");
        this.admissionDate = admissionDate;
    }

    public int getRoomNumber() { return roomNumber; }
    public void setRoomNumber(int roomNumber) throws HospitalDataException {
        if (roomNumber <= 0) throw new HospitalDataException("Room number must be positive");
        this.roomNumber = roomNumber;
    }

    public double getRoomCharges() { return roomCharges; }
    public void setRoomCharges(double roomCharges) throws HospitalDataException {
        if (roomCharges <= 0) throw new HospitalDataException("Room charges must be greater than 0");
        this.roomCharges = roomCharges;
    }
}
