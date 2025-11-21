package id27131.q2;

public class Exam {
    private String examName;
    private int maxMarks;
    private String examDate;

    public Exam(String examName, int maxMarks, String examDate) throws SchoolDataException {
        if (examName == null || examName.trim().isEmpty())
            throw new SchoolDataException("Exam name cannot be empty");
        this.examName = examName;

        if (maxMarks <= 0)
            throw new SchoolDataException("Max marks must be > 0");
        this.maxMarks = maxMarks;

        if (examDate == null || examDate.trim().isEmpty())
            throw new SchoolDataException("Exam date cannot be empty");
        this.examDate = examDate;
    }

    public String getExamName() { return examName; }
    public int getMaxMarks() { return maxMarks; }
    public String getExamDate() { return examDate; }
}
