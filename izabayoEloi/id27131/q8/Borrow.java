package id27131.q8;

public class Borrow extends Entity {
    private String borrowDate;
    private String returnDate;

    public Borrow(int id, String createdDate, String updatedDate, String borrowDate, String returnDate) throws LibraryDataException {
        super(id, createdDate, updatedDate);
        if (borrowDate == null || borrowDate.isEmpty()) throw new LibraryDataException("Borrow date cannot be empty");
        if (returnDate == null || returnDate.isEmpty()) throw new LibraryDataException("Return date cannot be empty");
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getBorrowDate() { return borrowDate; }
    public String getReturnDate() { return returnDate; }
}
