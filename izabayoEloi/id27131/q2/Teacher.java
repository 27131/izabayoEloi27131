package id27131.q2;

public class Teacher {
    private String teacherName;
    private String subject;
    private String teacherEmail;
    private String phone;

    public Teacher(String teacherName, String subject, String teacherEmail, String phone) throws SchoolDataException {
        if (teacherName == null || teacherName.trim().isEmpty())
            throw new SchoolDataException("Teacher name cannot be empty");
        this.teacherName = teacherName;

        if (subject == null || subject.trim().isEmpty())
            throw new SchoolDataException("Subject cannot be empty");
        this.subject = subject;

        if (teacherEmail == null || !teacherEmail.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$"))
            throw new SchoolDataException("Invalid email format");
        this.teacherEmail = teacherEmail;

        if (phone == null || !phone.matches("\\d{10}"))
            throw new SchoolDataException("Phone must be 10 digits");
        this.phone = phone;
    }

    public String getTeacherName() { return teacherName; }
    public String getSubject() { return subject; }
    public String getTeacherEmail() { return teacherEmail; }
    public String getPhone() { return phone; }
}
