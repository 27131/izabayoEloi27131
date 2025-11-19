package id27131.q2;

import java.util.Date;

public class School extends Entity{
    private String schoolName, address,email;
    private int phoneNumber;
    public School(int id, Date createdDate, Date updatedDate, String schoolName, String address, String email,
            int phoneNumber) {
        super(id, createdDate, updatedDate);
        this.schoolName = schoolName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    
    
}
