import java.util.Date;

public class Department extends Hospital{
    private String departmentName,departmentCode;
    //Constructor
    public Department(int id, Date creatDate, Date updatedDate,String hospitalName,
        String address,String email,String phoneNumber,String departmentName,
        String departmentCode){
            super(id, creatDate, updatedDate, hospitalName, address, email, phoneNumber);
            this.departmentName=departmentName;
            this.departmentCode=departmentCode;
        }
    //Getters
    public String getdepartmentName(){
        return departmentName;
    }
}
