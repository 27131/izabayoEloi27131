package id27131.q2;

public class Teacher extends Department {
    private String teacherName;
    private String subject;
    private String teacherEmail;
    private String phone;

    public Teacher(int id, String createdDate, String updatedDate,
                   String schoolName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String teacherName, String subject, String teacherEmail, String phone) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode);
        if (teacherName == null || teacherName.trim().isEmpty())
            throw new SchoolDataException("Teacher name cannot be empty");
        if (subject == null || subject.trim().isEmpty())
            throw new SchoolDataException("Subject cannot be empty");
        if (!teacherEmail.matches(".+@.+"))
            throw new SchoolDataException("Invalid teacher email");
        if (!phone.matches("\\d{10}"))
            throw new SchoolDataException("Phone number must be 10 digits");
        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherEmail = teacherEmail;
        this.phone = phone;
    }

    public String getTeacherName() { return teacherName; }
    public String getSubject() { return subject; }
    public String getTeacherEmail() { return teacherEmail; }
    public String getPhone() { return phone; }
}
