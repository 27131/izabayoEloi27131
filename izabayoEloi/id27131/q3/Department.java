package id27131.q3;

public class Department extends Company {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate,
                      String companyName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) throws PayrollException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email);

        if (departmentName == null || departmentName.trim().isEmpty()) throw new PayrollException("Department name cannot be empty");
        if (departmentCode == null || departmentCode.trim().length() < 3) throw new PayrollException("Department code must be at least 3 characters");

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() { return departmentName; }
    public String getDepartmentCode() { return departmentCode; }
}
