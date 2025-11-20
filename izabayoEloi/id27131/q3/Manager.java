package id27131.q3;

public class Manager extends Department {
    private String managerName;
    private String managerEmail;
    private String managerPhone;

    public Manager(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String managerName, String managerEmail, String managerPhone)
            throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode);
        setManagerName(managerName);
        setManagerEmail(managerEmail);
        setManagerPhone(managerPhone);
    }

    public String getManagerName() { return managerName; }
    public void setManagerName(String managerName) throws PayrollDataException {
        if (managerName == null || managerName.trim().isEmpty())
            throw new PayrollDataException("Manager name cannot be empty");
        this.managerName = managerName;
    }

    public String getManagerEmail() { return managerEmail; }
    public void setManagerEmail(String managerEmail) throws PayrollDataException {
        if (managerEmail == null || !managerEmail.contains("@"))
            throw new PayrollDataException("Invalid manager email");
        this.managerEmail = managerEmail;
    }

    public String getManagerPhone() { return managerPhone; }
    public void setManagerPhone(String managerPhone) throws PayrollDataException {
        if (managerPhone == null || !managerPhone.matches("\\d{10}"))
            throw new PayrollDataException("Manager phone must be 10 digits");
        this.managerPhone = managerPhone;
    }
}
