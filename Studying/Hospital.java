import java.util.Date;

public class Hospital extends Entity{
    private String hospitalName,address,email;
    private String phoneNumber;
    //Constructor
    public Hospital(int id, Date creatDate, Date updatedDate,String hospitalName,
        String address,String email,String phoneNumber){
            super(id, creatDate, updatedDate);
            this.hospitalName=hospitalName;
            this.address=address;
            this.email=email;
            this.phoneNumber=phoneNumber;
        }
    //Getters
    public String gethospitalName(){
        return hospitalName;
    }
    public String getaddress(){
        return address;
    }
    public String getemail(){
        return email;
    }
    public String phoneNumber(){
        return phoneNumber;
    }
    
    //Setters
    public void sethospitalName(String hospitalName){
        this.hospitalName=hospitalName;
    }
    public void setaddress(String address){
        this.address=address;
    }
    public void setemail(String email){
        if (email==null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid Email");
        }
        this.email=email;
    }
    public void setphoneNumber(String phoneNumber){
        if (!phoneNumber.matches("\\d{10}")|| phoneNumber==null) {
            throw new IllegalArgumentException("Invalid Phone number");
        }
    }
}
