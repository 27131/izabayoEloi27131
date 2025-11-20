package id27131.q2;

public final class StudentRecord extends Fee {

    public StudentRecord(int id, String createdDate, String updatedDate,
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
              courseName, courseCode, creditHours,
              examName, maxMarks, examDate,
              obtainedMarks, remarks, tuitionFee, examFee);
    }

    /**
     * calculateAverageMarks = (obtainedMarks / maxMarks) * 100
     */
    public double calculateAverageMarks() {
        double max = getMaxMarks();
        double obtained = getObtainedMarks();
        if (max == 0) return 0.0;
        return (obtained / max) * 100.0;
    }
}
