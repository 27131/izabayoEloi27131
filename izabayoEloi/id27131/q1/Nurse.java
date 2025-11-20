package id27131.q1;

public class Nurse extends Doctor {
    private String nurseName;
    private String shift; // Day or Night
    private int yearsOfExperience;

    public Nurse(int id, String createdDate, String updatedDate,
                 String hospitalName, String address, String hospPhone, String hospEmail,
                 String departmentName, String departmentCode,
                 String doctorName, String specialization, String doctorEmail, String doctorPhone,
                 String nurseName, String shift, int yearsOfExperience)
            throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, hospPhone, hospEmail,
              departmentName, departmentCode, doctorName, specialization, doctorEmail, doctorPhone);
        setNurseName(nurseName);
        setShift(shift);
        setYearsOfExperience(yearsOfExperience);
    }

    public String getNurseName() { return nurseName; }
    public void setNurseName(String nurseName) throws HospitalDataException {
        if (nurseName == null || nurseName.trim().isEmpty())
            throw new HospitalDataException("Nurse name cannot be empty");
        this.nurseName = nurseName;
    }

    public String getShift() { return shift; }
    public void setShift(String shift) throws HospitalDataException {
        if (shift == null) throw new HospitalDataException("Shift cannot be null");
        String s = shift.trim().toLowerCase();
        if (!s.equals("day") && !s.equals("night"))
            throw new HospitalDataException("Shift must be 'Day' or 'Night'");
        this.shift = shift;
    }

    public int getYearsOfExperience() { return yearsOfExperience; }
    public void setYearsOfExperience(int yearsOfExperience) throws HospitalDataException {
        if (yearsOfExperience < 0)
            throw new HospitalDataException("Years of experience cannot be negative");
        this.yearsOfExperience = yearsOfExperience;
    }
}
