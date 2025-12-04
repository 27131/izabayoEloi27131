import java.util.Date;

public class Patient extends Nurse{
    private String patientName,gender,contactNumber;
    private int age;
    //Constructor
    public Patient(int id, Date creatDate, Date updatedDate,String hospitalName,
        String address,String email,String phoneNumber,String departmentName,
        String departmentCode,String doctorName,String specialization,
        String doctorEmail,String phone,String nurseName,String shift,
        int yearsOfExperience,String patientName,String gender,String 
        contactNumber,int age){
            super(id, creatDate, updatedDate, hospitalName, address, email,
                 phoneNumber, departmentName, departmentCode, doctorName, 
                 specialization, doctorEmail, phone, nurseName, shift, 
                 yearsOfExperience);
            this.patientName=patientName;
            this.gender=gender;
            this.contactNumber=contactNumber;
            this.age=age;
        }
        //Getters
    public String getPatientName() {
        return patientName;
    }
    public String getGender() {
        return gender;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public int getAge() {
        return age;
    }
    //Setters
    public void setPatientName(String patientName) {
        if (patientName==null) {
            throw new IllegalArgumentException("Empty Patient Name");
        }
        this.patientName = patientName;
    }
    public void setGender(String gender) {
        if (gender.contains("Male")||gender.contains("Female")) {
            throw new IllegalArgumentException("Invalid Gender Entered Male/Female");
        }
        this.gender = gender;
    }
    public void setContactNumber(String contactNumber) {
        if (!contactNumber.matches("//{10}")) {
            throw new IllegalArgumentException("Contact Number must be 10");
        }
        this.contactNumber = contactNumber;
    }
    public void setAge(int age) {
        if (age<=0) {
            throw new IllegalArgumentException("Age must be Greater than 0");
        }
        this.age = age;
    }
    
}
