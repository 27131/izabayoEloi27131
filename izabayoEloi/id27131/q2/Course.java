package id27131.q2;

public class Course {
    private String courseName;
    private String courseCode;
    private int creditHours;

    public Course(String courseName, String courseCode, int creditHours) throws SchoolDataException {
        if (courseName == null || courseName.trim().isEmpty())
            throw new SchoolDataException("Course name cannot be empty");
        this.courseName = courseName;

        if (courseCode == null || courseCode.trim().length() < 1)
            throw new SchoolDataException("Course code cannot be empty");
        this.courseCode = courseCode;

        if (creditHours <= 0)
            throw new SchoolDataException("Credit hours must be > 0");
        this.creditHours = creditHours;
    }

    public String getCourseName() { return courseName; }
    public String getCourseCode() { return courseCode; }
    public int getCreditHours() { return creditHours; }
}
