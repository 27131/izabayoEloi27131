package id27131.q3;

public class Deduction {
    private double taxDeduction;
    private double loanDeduction;

    public Deduction(double taxDeduction, double loanDeduction) throws PayrollDataException {
        if (taxDeduction < 0 || loanDeduction < 0)
            throw new PayrollDataException("Deductions cannot be negative");
        this.taxDeduction = taxDeduction;
        this.loanDeduction = loanDeduction;
    }

    public double getTaxDeduction() { return taxDeduction; }
    public double getLoanDeduction() { return loanDeduction; }

    public double totalDeduction() {
        return taxDeduction + loanDeduction;
    }
}
