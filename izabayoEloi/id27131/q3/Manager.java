package id27131.q3;

public class Manager extends Department {
    private String managerName;
    private String managerEmail;
    private String phoneNumber;

    public Manager(int id, String createdDate, String updatedDate,
                   String companyName, String address, String companyPhone, String email,
                   String departmentName, String departmentCode,
                   String managerName, String managerEmail, String phoneNumber) throws PayrollException {
        super(id, createdDate, updatedDate, companyName, address, companyPhone, email, departmentName, departmentCode);

        if (managerName == null || managerName.trim().isEmpty()) throw new PayrollException("Manager name cannot be empty");
        if (!managerEmail.matches(".+@.+")) throw new PayrollException("Invalid email format");
        if (!phoneNumber.matches("\\d{10}")) throw new PayrollException("Phone must be 10 digits");

        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.phoneNumber = phoneNumber;
    }

    public String getManagerName() { return managerName; }
    public String getManagerEmail() { return managerEmail; }
    public String getPhoneNumber() { return phoneNumber; }
}
