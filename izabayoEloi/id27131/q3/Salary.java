package id27131.q3;

public class Salary extends Deduction {
    private double basicSalary;
    private double grossSalary;
    private double netSalary;

    public Salary(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String managerName, String managerEmail, String managerPhone,
                  String employeeName, int employeeId, String designation, String contactNumber,
                  int totalDays, int presentDays, int leaveDays,
                  double housingAllowance, double transportAllowance,
                  double taxDeduction, double loanDeduction,
                  double basicSalary)
            throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
              departmentName, departmentCode, managerName, managerEmail, managerPhone,
              employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays,
              housingAllowance, transportAllowance, taxDeduction, loanDeduction);
        setBasicSalary(basicSalary);
        computeGrossSalary();
        computeNetSalary();
    }

    public double getBasicSalary() { return basicSalary; }
    public void setBasicSalary(double basicSalary) throws PayrollDataException {
        if (basicSalary <= 0) throw new PayrollDataException("Basic salary must be greater than 0");
        this.basicSalary = basicSalary;
    }

    public double getGrossSalary() { return grossSalary; }
    private void computeGrossSalary() {
        this.grossSalary = basicSalary + getTotalAllowances();
    }

    public double getNetSalary() { return netSalary; }
    public double calculateNetSalary() {
        return basicSalary + getTotalAllowances() - getTotalDeductions();
    }

    private void computeNetSalary() throws PayrollDataException {
        double val = calculateNetSalary();
        if (val <= 0) throw new PayrollDataException("Net salary must be greater than 0");
        this.netSalary = val;
    }
}
