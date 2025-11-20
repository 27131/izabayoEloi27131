package id27131.q8;

public class Borrow extends Member {
    private String borrowDate;
    private String returnDate;

    public Borrow(int id, String createdDate, String updatedDate,
                  String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId, String contactNumber,
                  String borrowDate, String returnDate) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber,
              sectionName, sectionCode, title, author, ISBN,
              memberName, memberId, contactNumber);
        setBorrowDate(borrowDate);
        setReturnDate(returnDate);
    }

    public String getBorrowDate() { return borrowDate; }
    public void setBorrowDate(String borrowDate) throws LibraryDataException {
        if (borrowDate == null || borrowDate.trim().isEmpty())
            throw new LibraryDataException("Borrow date required");
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() { return returnDate; }
    public void setReturnDate(String returnDate) throws LibraryDataException {
        if (returnDate == null || returnDate.trim().isEmpty())
            throw new LibraryDataException("Return date required");
        this.returnDate = returnDate;
    }
}
