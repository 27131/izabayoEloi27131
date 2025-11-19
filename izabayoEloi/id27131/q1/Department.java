package id27131.q1;

import java.util.Date;

public class Department extends Hospital{
    private String departmentName;
    private int departmentCode;
    public Department(int id, Date createdDate, Date updatedDate, String hospitalName, String address, int phoneNumber,
            String email, String departmentName, int departmentCode) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email);
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public int getDepartmentCode() {
        return departmentCode;
    }
    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }
    
    
    
}
