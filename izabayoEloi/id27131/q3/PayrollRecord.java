package id27131.q3;

public final class PayrollRecord extends Salary {
    public PayrollRecord(int id, String createdDate, String updatedDate,
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
              housingAllowance, transportAllowance, taxDeduction, loanDeduction, basicSalary);
    }

    public void generatePayroll() {
        System.out.println("===== PAYROLL RECORD =====");
        System.out.println("Company: " + getCompanyName());
        System.out.println("Department: " + getDepartmentName() + " (" + getDepartmentCode() + ")");
        System.out.println("Manager: " + getManagerName());
        System.out.println("Employee: " + getEmployeeName() + " | Employee ID: " + getEmployeeId() + " | Designation: " + getDesignation());
        System.out.println("Contact: " + getContactNumber());
        System.out.println("Attendance: Total Days=" + getTotalDays() + ", Present=" + getPresentDays() + ", Leave=" + getLeaveDays());
        System.out.printf("Basic Salary: %.2f%n", getBasicSalary());
        System.out.printf("Housing Allowance: %.2f%n", getHousingAllowance());
        System.out.printf("Transport Allowance: %.2f%n", getTransportAllowance());
        System.out.printf("Total Allowances: %.2f%n", getTotalAllowances());
        System.out.printf("Tax Deduction: %.2f%n", getTaxDeduction());
        System.out.printf("Loan Deduction: %.2f%n", getLoanDeduction());
        System.out.printf("Total Deductions: %.2f%n", getTotalDeductions());
        System.out.printf("Gross Salary: %.2f%n", getGrossSalary());
        System.out.printf("Net Salary: %.2f%n", getNetSalary());
    }
}
