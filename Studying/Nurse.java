import java.util.Date;

public class Nurse extends Doctor {
    private String nurseName,shift;
    private int yearsOfExperience;
    //Constructor
    public Nurse(int id, Date creatDate, Date updatedDate,String hospitalName,
        String address,String email,String phoneNumber,String departmentName,
        String departmentCode,String doctorName,String specialization,
        String doctorEmail,String phone,String nurseName,String shift,
        int yearsOfExperience){
            super(id, creatDate, updatedDate, hospitalName, address, email, 
                phoneNumber, departmentName, departmentCode, doctorName, 
                specialization, doctorEmail, phone);
            this.nurseName=nurseName;
            this.shift=shift;
            this.yearsOfExperience=yearsOfExperience;
        }
        //Getters
        public String getnurseName(){
            return nurseName;
        }
        public String getshift(){
            return shift;
        }
        public int getyearsOfExperience(){
            return yearsOfExperience;
        }
        //Setters
        public void setnurseName(String nurseName){
            if (nurseName==null) {
                throw new IllegalArgumentException("Empty Nurse name");
            }
            this.nurseName=nurseName;
        }
        public void setshift(String shift){
            if (shift.matches("Day")||shift.matches("Night")) {
                throw new IllegalArgumentException("Shift must be Day or Night");
            }
            this.shift=shift;
        }
        public void setyearsOfExperience(int yearsOfExperience){
            if (yearsOfExperience<0) {
                throw new IllegalArgumentException("Invalid years of Experience");
            }
            this.yearsOfExperience=yearsOfExperience;
        }
}
