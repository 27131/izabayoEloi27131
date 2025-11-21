package id27131.q1;

public class Nurse {
    private String nurseName;
    private String shift;
    private int yearsOfExperience;

    public Nurse(String nurseName, String shift, int yearsOfExperience) throws HospitalDataException {
        if (nurseName == null || nurseName.trim().isEmpty())
            throw new HospitalDataException("Nurse name cannot be empty");
        this.nurseName = nurseName;

        if (!shift.equalsIgnoreCase("Day") && !shift.equalsIgnoreCase("Night"))
            throw new HospitalDataException("Shift must be 'Day' or 'Night'");
        this.shift = shift;

        if (yearsOfExperience < 0)
            throw new HospitalDataException("Years of experience must be >= 0");
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getNurseName() { return nurseName; }
    public String getShift() { return shift; }
    public int getYearsOfExperience() { return yearsOfExperience; }
}
