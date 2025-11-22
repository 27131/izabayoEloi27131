package id27131.q3;

public class Attendance extends Employee {
    private int totalDays;
    private int presentDays;
    private int leaveDays;

    public Attendance(int id, String createdDate, String updatedDate,
                      String companyName, String address, String companyPhone, String email,
                      String departmentName, String departmentCode,
                      String managerName, String managerEmail, String managerPhone,
                      String employeeName, int employeeId, String designation, String contactNumber,
                      int totalDays, int presentDays, int leaveDays) throws PayrollException {
        super(id, createdDate, updatedDate, companyName, address, companyPhone, email,
              departmentName, departmentCode, managerName, managerEmail, managerPhone,
              employeeName, employeeId, designation, contactNumber);

        if (totalDays < 0 || presentDays < 0 || leaveDays < 0) throw new PayrollException("Attendance values cannot be negative");
        if (presentDays > totalDays) throw new PayrollException("Present days cannot exceed total days");

        this.totalDays = totalDays;
        this.presentDays = presentDays;
        this.leaveDays = leaveDays;
    }

    public int getTotalDays() { return totalDays; }
    public int getPresentDays() { return presentDays; }
    public int getLeaveDays() { return leaveDays; }
}
