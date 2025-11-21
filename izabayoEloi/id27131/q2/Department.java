package id27131.q2;

public class Department {
    private String departmentName;
    private String departmentCode;

    public Department(String departmentName, String departmentCode) throws SchoolDataException {
        if (departmentName == null || departmentName.trim().isEmpty())
            throw new SchoolDataException("Department name cannot be empty");
        this.departmentName = departmentName;

        if (departmentCode == null || departmentCode.trim().length() < 3)
            throw new SchoolDataException("Department code must be at least 3 characters");
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() { return departmentName; }
    public String getDepartmentCode() { return departmentCode; }
}
