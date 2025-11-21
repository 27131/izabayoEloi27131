package id27131.q3;

public class Allowance {
    private double housingAllowance;
    private double transportAllowance;

    public Allowance(double housingAllowance, double transportAllowance) throws PayrollDataException {
        if (housingAllowance < 0 || transportAllowance < 0)
            throw new PayrollDataException("Allowances cannot be negative");
        this.housingAllowance = housingAllowance;
        this.transportAllowance = transportAllowance;
    }

    public double getHousingAllowance() { return housingAllowance; }
    public double getTransportAllowance() { return transportAllowance; }

    public double totalAllowance() {
        return housingAllowance + transportAllowance;
    }
}
