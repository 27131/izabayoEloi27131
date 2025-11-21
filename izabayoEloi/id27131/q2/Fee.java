package id27131.q2;

public class Fee {
    private double tuitionFee;
    private double examFee;

    public Fee(double tuitionFee, double examFee) throws SchoolDataException {
        if (tuitionFee < 0 || examFee < 0)
            throw new SchoolDataException("Fees must be >= 0");
        this.tuitionFee = tuitionFee;
        this.examFee = examFee;
    }

    public double getTuitionFee() { return tuitionFee; }
    public double getExamFee() { return examFee; }

    public double getTotalFee() { return tuitionFee + examFee; }
}
