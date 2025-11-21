package id27131.q1;

public class Admission {
    private String admissionDate;
    private String roomNumber;
    private double roomCharges;

    public Admission(String admissionDate, String roomNumber, double roomCharges) throws HospitalDataException {
        if (admissionDate == null || admissionDate.trim().isEmpty())
            throw new HospitalDataException("Admission date cannot be empty");
        this.admissionDate = admissionDate;

        if (roomNumber == null || roomNumber.trim().isEmpty())
            throw new HospitalDataException("Room number cannot be empty");
        this.roomNumber = roomNumber;

        if (roomCharges <= 0)
            throw new HospitalDataException("Room charges must be > 0");
        this.roomCharges = roomCharges;
    }

    public String getAdmissionDate() { return admissionDate; }
    public String getRoomNumber() { return roomNumber; }
    public double getRoomCharges() { return roomCharges; }
}
