package id27131.q3;

public class Employee extends Manager {
    private String employeeName;
    private int employeeId;
    private String designation;
    private String contactNumber;

    public Employee(int id, String createdDate, String updatedDate,
                    String companyName, String address, String companyPhone, String email,
                    String departmentName, String departmentCode,
                    String managerName, String managerEmail, String managerPhone,
                    String employeeName, int employeeId, String designation, String contactNumber) throws PayrollException {
        super(id, createdDate, updatedDate, companyName, address, companyPhone, email,
              departmentName, departmentCode, managerName, managerEmail, managerPhone);

        if (employeeName == null || employeeName.trim().isEmpty()) throw new PayrollException("Employee name cannot be empty");
        if (employeeId <= 0) throw new PayrollException("Employee ID must be > 0");
        if (designation == null || designation.trim().isEmpty()) throw new PayrollException("Designation cannot be empty");
        if (!contactNumber.matches("\\d{10}")) throw new PayrollException("Contact must be 10 digits");

        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.designation = designation;
        this.contactNumber = contactNumber;
    }

    public String getEmployeeName() { return employeeName; }
    public int getEmployeeId() { return employeeId; }
    public String getDesignation() { return designation; }
    public String getContactNumber() { return contactNumber; }
}
