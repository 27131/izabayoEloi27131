package id27131.q1;

public class Department extends Hospital {
    private String departmentName;
    private String departmentCode; // alphanumeric >= 3 chars

    public Department(int id, String createdDate, String updatedDate,
                      String hospitalName, String address, String phone, String email,
                      String departmentName, String departmentCode) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phone, email);
        setDepartmentName(departmentName);
        setDepartmentCode(departmentCode);
    }

    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) throws HospitalDataException {
        if (departmentName == null || departmentName.trim().isEmpty())
            throw new HospitalDataException("Department name cannot be empty");
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() { return departmentCode; }
    public void setDepartmentCode(String departmentCode) throws HospitalDataException {
        if (departmentCode == null || !departmentCode.matches("[A-Za-z0-9]{3,}"))
            throw new HospitalDataException("Department code must be alphanumeric and at least 3 characters");
        this.departmentCode = departmentCode;
    }
}
