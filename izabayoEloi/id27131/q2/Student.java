package id27131.q2;

public class Student {
    private String studentName;
    private int rollNumber;
    private String grade;
    private String contactNumber;

    public Student(String studentName, int rollNumber, String grade, String contactNumber) throws SchoolDataException {
        if (studentName == null || studentName.trim().isEmpty())
            throw new SchoolDataException("Student name cannot be empty");
        this.studentName = studentName;

        if (rollNumber <= 0)
            throw new SchoolDataException("Roll number must be > 0");
        this.rollNumber = rollNumber;

        if (grade == null || grade.trim().isEmpty())
            throw new SchoolDataException("Grade cannot be empty");
        this.grade = grade;

        if (contactNumber == null || !contactNumber.matches("\\d{10}"))
            throw new SchoolDataException("Contact number must be 10 digits");
        this.contactNumber = contactNumber;
    }

    public String getStudentName() { return studentName; }
    public int getRollNumber() { return rollNumber; }
    public String getGrade() { return grade; }
    public String getContactNumber() { return contactNumber; }
}
