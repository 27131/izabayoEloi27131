package id27131.q2;

import java.util.Date;
public class Student extends Teacher{
    private String studentName,grade;
    private int rollNumber, contactNumber;
    public Student(int id, Date createdDate, Date updatedDate, String schoolName, String address, String email,
            int phoneNumber, String departmentName, int departmentCode, String teacherName, String subject,
            String teacherEmail, int phone, String studentName, String grade, int rollNumber, int contactNumber) {
        super(id, createdDate, updatedDate, schoolName, address, email, phoneNumber, departmentName, departmentCode,
                teacherName, subject, teacherEmail, phone);
        this.studentName = studentName;
        this.grade = grade;
        this.rollNumber = rollNumber;
        this.contactNumber = contactNumber;
    }
    
    
}
