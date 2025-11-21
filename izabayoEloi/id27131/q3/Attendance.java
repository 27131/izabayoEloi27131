package id27131.q3;

public class Attendance {
    private int totalDays;
    private int presentDays;
    private int leaveDays;

    public Attendance(int totalDays, int presentDays, int leaveDays) throws PayrollDataException {
        if (totalDays < 0 || presentDays < 0 || leaveDays < 0)
            throw new PayrollDataException("Days cannot be negative");
        if (presentDays > totalDays)
            throw new PayrollDataException("Present days cannot exceed total days");
        this.totalDays = totalDays;
        this.presentDays = presentDays;
        this.leaveDays = leaveDays;
    }

    public int getTotalDays() { return totalDays; }
    public int getPresentDays() { return presentDays; }
    public int getLeaveDays() { return leaveDays; }
}
