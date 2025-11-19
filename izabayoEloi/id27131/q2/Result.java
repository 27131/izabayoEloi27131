package id27131.q2;

import java.util.Date;

public class Result extends Exam{
    private double obtainedMarks, remarks;

    public Result(int id, Date createdDate, Date updatedDate, String schoolName, String address, String email,
            int phoneNumber, String departmentName, int departmentCode, String teacherName, String subject,
            String teacherEmail, int phone, String studentName, String grade, int rollNumber, int contactNumber,
            String courseName, int courseCode, int creditHours, String examName, double maxMarks, Date examDate,
            double obtainedMarks, double remarks) {
        super(id, createdDate, updatedDate, schoolName, address, email, phoneNumber, departmentName, departmentCode,
                teacherName, subject, teacherEmail, phone, studentName, grade, rollNumber, contactNumber, courseName,
                courseCode, creditHours, examName, maxMarks, examDate);
        this.obtainedMarks = obtainedMarks;
        this.remarks = remarks;
    }
    
}
