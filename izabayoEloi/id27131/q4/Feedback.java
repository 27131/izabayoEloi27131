package id27131.q4;

public class Feedback extends Entity {
    private int rating;
    private String comments;

    public Feedback(int id, String createdDate, String updatedDate, int rating, String comments) throws ReservationDataException {
        super(id, createdDate, updatedDate);

        if (rating < 1 || rating > 5)
            throw new ReservationDataException("Rating must be between 1 and 5");
        this.rating = rating;

        if (comments == null || comments.trim().isEmpty())
            throw new ReservationDataException("Comments cannot be empty");
        this.comments = comments;
    }

    public int getRating() { return rating; }
    public String getComments() { return comments; }
}
