package id27131.q3;

public class Salary extends Deduction {
    private double basicSalary;
    private double grossSalary;
    private double netSalary;

    public Salary(int id, String createdDate, String updatedDate,
                  String companyName, String address, String companyPhone, String email,
                  String departmentName, String departmentCode,
                  String managerName, String managerEmail, String managerPhone,
                  String employeeName, int employeeId, String designation, String contactNumber,
                  int totalDays, int presentDays, int leaveDays,
                  double housingAllowance, double transportAllowance,
                  double taxDeduction, double loanDeduction,
                  double basicSalary, double grossSalary) throws PayrollException {
        super(id, createdDate, updatedDate, companyName, address, companyPhone, email,
              departmentName, departmentCode, managerName, managerEmail, managerPhone,
              employeeName, employeeId, designation, contactNumber,
              totalDays, presentDays, leaveDays,
              housingAllowance, transportAllowance,
              taxDeduction, loanDeduction);

        if (basicSalary <= 0 || grossSalary <= 0) throw new PayrollException("Salary amounts must be > 0");
        this.basicSalary = basicSalary;
        this.grossSalary = grossSalary;
        this.netSalary = calculateNetSalary();
    }

    public double getBasicSalary() { return basicSalary; }
    public double getGrossSalary() { return grossSalary; }
    public double getNetSalary() { return netSalary; }

    private double calculateNetSalary() {
        return basicSalary + getHousingAllowance() + getTransportAllowance() - getTaxDeduction() - getLoanDeduction();
    }
}
