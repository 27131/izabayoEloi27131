package id27131.q3;

public class Employee {
    private String employeeName;
    private int employeeId;
    private String designation;
    private String contactNumber;

    public Employee(String employeeName, int employeeId, String designation, String contactNumber) throws PayrollDataException {
        if (employeeName == null || employeeName.trim().isEmpty())
            throw new PayrollDataException("Employee name cannot be empty");
        this.employeeName = employeeName;

        if (employeeId <= 0)
            throw new PayrollDataException("Employee ID must be > 0");
        this.employeeId = employeeId;

        if (designation == null || designation.trim().isEmpty())
            throw new PayrollDataException("Designation cannot be empty");
        this.designation = designation;

        if (contactNumber == null || !contactNumber.matches("\\d{10}"))
            throw new PayrollDataException("Contact number must be 10 digits");
        this.contactNumber = contactNumber;
    }

    public String getEmployeeName() { return employeeName; }
    public int getEmployeeId() { return employeeId; }
    public String getDesignation() { return designation; }
    public String getContactNumber() { return contactNumber; }
}
