package id27131.q1;

public class Admission extends Patient {
    private String admissionDate;
    private String roomNumber;
    private double roomCharges;

    public Admission(int id, String createdDate, String updatedDate,
                     String hospitalName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String doctorName, String specialization, String doctorEmail, String doctorPhone,
                     String nurseName, String shift, int yearsOfExperience,
                     String patientName, int age, String gender, String contactNumber,
                     String admissionDate, String roomNumber, double roomCharges) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode, doctorName, specialization, doctorEmail, doctorPhone,
                nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber);

        if (admissionDate == null || admissionDate.trim().isEmpty())
            throw new HospitalDataException("Admission date cannot be empty");
        if (roomNumber == null || roomNumber.trim().isEmpty())
            throw new HospitalDataException("Room number cannot be empty");
        if (roomCharges <= 0)
            throw new HospitalDataException("Room charges must be > 0");

        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
        this.roomCharges = roomCharges;
    }

    public String getAdmissionDate() { return admissionDate; }
    public String getRoomNumber() { return roomNumber; }
    public double getRoomCharges() { return roomCharges; }
}
