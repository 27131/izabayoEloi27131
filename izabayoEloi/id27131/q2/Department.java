package id27131.q2;

import java.util.Date;

public class Department extends School{
    private String departmentName;
    private int departmentCode;
    public Department(int id, Date createdDate, Date updatedDate, String schoolName, String address, String email,
            int phoneNumber, String departmentName, int departmentCode) {
        super(id, createdDate, updatedDate, schoolName, address, email, phoneNumber);
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
    
    
}
