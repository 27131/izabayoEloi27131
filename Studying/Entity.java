import java.util.Date;
public class Entity {
    private int id;
    private Date createdDate;
    private Date updatedDate;
    //Constructors
    public Entity(int id, Date creatDate, Date updatedDate){
        this.id=id;
        this.createdDate=creatDate;
        this.updatedDate=updatedDate;
    }
    //Getters
    public int getid(){
        return id;
    }
    public Date getcreatDate(){
        return createdDate;
    }
    public Date getupdatedDate(){
        return updatedDate;
    }
    //Setters
    public void setid(int id){
        if (id<=0) {
            throw new IllegalArgumentException("Id must be greater than 0");
        }
        this.id=id;
    }
    public void setcreatedDate(Date creatDate){
        if (creatDate==null) {
            throw new IllegalArgumentException("Date must not be Empty");
        }
        this.createdDate=creatDate;
    }
    public void setupdatedDate(Date updatedDate){
        if (updatedDate==null) {
            throw new IllegalArgumentException("Date must not be Empty");
        }
    }
}
