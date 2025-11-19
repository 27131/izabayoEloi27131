package id27131.q2;
import java.util.Date;

public class Exam extends Course{
    private String examName;
    private double maxMarks;
    private Date examDate;
    public Exam(int id, Date createdDate, Date updatedDate, String schoolName, String address, String email,
            int phoneNumber, String departmentName, int departmentCode, String teacherName, String subject,
            String teacherEmail, int phone, String studentName, String grade, int rollNumber, int contactNumber,
            String courseName, int courseCode, int creditHours, String examName, double maxMarks, Date examDate) {
        super(id, createdDate, updatedDate, schoolName, address, email, phoneNumber, departmentName, departmentCode,
                teacherName, subject, teacherEmail, phone, studentName, grade, rollNumber, contactNumber, courseName,
                courseCode, creditHours);
        this.examName = examName;
        this.maxMarks = maxMarks;
        this.examDate = examDate;
    }
    
    
}
