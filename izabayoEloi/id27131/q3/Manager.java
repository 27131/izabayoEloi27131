package id27131.q3;

public class Manager {
    private String managerName;
    private String managerEmail;
    private String phone;

    public Manager(String managerName, String managerEmail, String phone) throws PayrollDataException {
        if (managerName == null || managerName.trim().isEmpty())
            throw new PayrollDataException("Manager name cannot be empty");
        this.managerName = managerName;

        if (managerEmail == null || !managerEmail.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$"))
            throw new PayrollDataException("Invalid email format");
        this.managerEmail = managerEmail;

        if (phone == null || !phone.matches("\\d{10}"))
            throw new PayrollDataException("Phone must be 10 digits");
        this.phone = phone;
    }

    public String getManagerName() { return managerName; }
    public String getManagerEmail() { return managerEmail; }
    public String getPhone() { return phone; }
}
