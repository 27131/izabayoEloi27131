package id27131.q2;

import java.util.Date;

public class Course extends Student{
    private String courseName;
    private int courseCode,creditHours;
    public Course(int id, Date createdDate, Date updatedDate, String schoolName, String address, String email,
            int phoneNumber, String departmentName, int departmentCode, String teacherName, String subject,
            String teacherEmail, int phone, String studentName, String grade, int rollNumber, int contactNumber,
            String courseName, int courseCode, int creditHours) {
        super(id, createdDate, updatedDate, schoolName, address, email, phoneNumber, departmentName, departmentCode,
                teacherName, subject, teacherEmail, phone, studentName, grade, rollNumber, contactNumber);
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
    }
    
    
}
