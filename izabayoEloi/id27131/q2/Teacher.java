package id27131.q2;
import java.util.Date;
public class Teacher extends Department{
    private String teacherName, subject,teacherEmail;
    private int phone;
    public Teacher(int id, Date createdDate, Date updatedDate, String schoolName, String address, String email,
            int phoneNumber, String departmentName, int departmentCode, String teacherName, String subject,
            String teacherEmail, int phone) {
        super(id, createdDate, updatedDate, schoolName, address, email, phoneNumber, departmentName, departmentCode);
        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherEmail = teacherEmail;
        this.phone = phone;
    }
    

}
