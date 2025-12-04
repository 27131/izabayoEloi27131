import java.util.Date;

public class Doctor extends  Department{
    private String doctorName,specialization,doctorEmail,phone;
    //Constructor
    public Doctor(int id, Date creatDate, Date updatedDate,String hospitalName,
        String address,String email,String phoneNumber,String departmentName,
        String departmentCode,String doctorName,String specialization,
        String doctorEmail,String phone){
            super(id, creatDate, updatedDate, hospitalName, address, email, 
                phoneNumber,departmentName,departmentCode);
                this.doctorName=doctorName;
                this.specialization=specialization;
                this.doctorEmail=doctorEmail;
                this.phone=phone;
    }
    //Getters
    public String getdoctorName(){
        return doctorName;
    }
    public String getspecialization(){
        return specialization;
    }
    public String getdoctorEmail(){
        return doctorEmail;
    }
    public String getphone(){
        return phone;
    }
    //Setters
    public void setdoctorName(String doctorName){
        this.doctorName=doctorName;
    }
    public void setspecialization(String specialization){
        if (specialization==null) {
            throw new IllegalArgumentException("Empty Specialization");
        }
        this.specialization=specialization;
    }
    public void setdoctorEmail(String doctorEmail){
        if (!doctorEmail.contains("@")&&!doctorEmail.contains(".")) {
            throw new IllegalArgumentException("Wrong Email");
        }
        this.doctorEmail=doctorEmail;
    }
    public void setphone(String phone){
        if (!phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Enter Phone number correct.");
        }
        this.phone=phone;}
    }