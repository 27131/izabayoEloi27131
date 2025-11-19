package id27131.q2;

import java.util.Date;

public class Fee extends Result{
    private int tuitionFee, examFee, totalFee;

    public Fee(int id, Date createdDate, Date updatedDate, String schoolName, String address, String email,
            int phoneNumber, String departmentName, int departmentCode, String teacherName, String subject,
            String teacherEmail, int phone, String studentName, String grade, int rollNumber, int contactNumber,
            String courseName, int courseCode, int creditHours, String examName, double maxMarks, Date examDate,
            double obtainedMarks, double remarks, int tuitionFee, int examFee, int totalFee) {
        super(id, createdDate, updatedDate, schoolName, address, email, phoneNumber, departmentName, departmentCode,
                teacherName, subject, teacherEmail, phone, studentName, grade, rollNumber, contactNumber, courseName,
                courseCode, creditHours, examName, maxMarks, examDate, obtainedMarks, remarks);
        this.tuitionFee = tuitionFee;
        this.examFee = examFee;
        this.totalFee = totalFee;
    }
    
    
}
