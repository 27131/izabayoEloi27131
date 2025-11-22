package id27131.q3;

public class Deduction extends Allowance {
    private double taxDeduction;
    private double loanDeduction;

    public Deduction(int id, String createdDate, String updatedDate,
                     String companyName, String address, String companyPhone, String email,
                     String departmentName, String departmentCode,
                     String managerName, String managerEmail, String managerPhone,
                     String employeeName, int employeeId, String designation, String contactNumber,
                     int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance,
                     double taxDeduction, double loanDeduction) throws PayrollException {
        super(id, createdDate, updatedDate, companyName, address, companyPhone, email,
              departmentName, departmentCode, managerName, managerEmail, managerPhone,
              employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays,
              housingAllowance, transportAllowance);

        if (taxDeduction < 0 || loanDeduction < 0) throw new PayrollException("Deductions cannot be negative");
        this.taxDeduction = taxDeduction;
        this.loanDeduction = loanDeduction;
    }

    public double getTaxDeduction() { return taxDeduction; }
    public double getLoanDeduction() { return loanDeduction; }
}
