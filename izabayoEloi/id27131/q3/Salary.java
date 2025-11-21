package id27131.q3;

public class Salary {
    private double basicSalary;
    private double grossSalary;
    private double netSalary;

    public Salary(double basicSalary) throws PayrollDataException {
        if (basicSalary <= 0)
            throw new PayrollDataException("Basic salary must be > 0");
        this.basicSalary = basicSalary;
        this.grossSalary = 0;
        this.netSalary = 0;
    }

    public double getBasicSalary() { return basicSalary; }
    public double getGrossSalary() { return grossSalary; }
    public double getNetSalary() { return netSalary; }

    public void calculateNetSalary(Allowance allowance, Deduction deduction) {
        grossSalary = basicSalary + allowance.totalAllowance();
        netSalary = grossSalary - deduction.totalDeduction();
    }
}
