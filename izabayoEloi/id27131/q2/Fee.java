package id27131.q2;

public class Fee extends Result {
    private double tuitionFee;
    private double examFee;
    private double totalFee;

    public Fee(int id, String createdDate, String updatedDate,
               String schoolName, String address, String phoneNumber, String email,
               String departmentName, String departmentCode,
               String teacherName, String subject, String teacherEmail, String teacherPhone,
               String studentName, int rollNumber, String grade, String contactNumber,
               String courseName, String courseCode, int creditHours,
               String examName, double maxMarks, String examDate,
               double obtainedMarks, String remarks,
               double tuitionFee, double examFee)
            throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
              departmentName, departmentCode, teacherName, subject, teacherEmail, teacherPhone,
              studentName, rollNumber, grade, contactNumber,
              courseName, courseCode, creditHours, examName, maxMarks, examDate,
              obtainedMarks, remarks);
        setTuitionFee(tuitionFee);
        setExamFee(examFee);
        computeTotalFee();
    }

    public double getTuitionFee() { return tuitionFee; }
    public void setTuitionFee(double tuitionFee) throws SchoolDataException {
        if (tuitionFee <= 0) throw new SchoolDataException("Tuition fee must be greater than 0");
        this.tuitionFee = tuitionFee;
    }

    public double getExamFee() { return examFee; }
    public void setExamFee(double examFee) throws SchoolDataException {
        if (examFee <= 0) throw new SchoolDataException("Exam fee must be greater than 0");
        this.examFee = examFee;
    }

    public double getTotalFee() { return totalFee; }
    private void computeTotalFee() throws SchoolDataException {
        double sum = this.tuitionFee + this.examFee;
        if (sum <= 0) throw new SchoolDataException("Total fee must be greater than 0");
        this.totalFee = sum;
    }
}
