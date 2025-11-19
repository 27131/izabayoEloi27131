package id27131.q2;
import java.util.Date;

public class Entity {
    private int id;
    private Date createdDate, updatedDate;
    public Entity(int id, Date createdDate, Date updatedDate) {
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}

