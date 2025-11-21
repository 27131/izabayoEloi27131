package id27131.q2;

public class Result {
    private int obtainedMarks;
    private String remarks;

    public Result(int obtainedMarks, String remarks) throws SchoolDataException {
        if (obtainedMarks < 0)
            throw new SchoolDataException("Obtained marks must be >= 0");
        this.obtainedMarks = obtainedMarks;

        if (remarks == null || remarks.trim().isEmpty())
            throw new SchoolDataException("Remarks cannot be empty");
        this.remarks = remarks;
    }

    public int getObtainedMarks() { return obtainedMarks; }
    public String getRemarks() { return remarks; }
}
