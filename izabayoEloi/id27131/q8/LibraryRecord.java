package id27131.q8;

public final class LibraryRecord extends Record {
    public LibraryRecord(int id, String createdDate, String updatedDate,
                         String libraryName, String location, String phoneNumber,
                         String sectionName, String sectionCode,
                         String title, String author, String ISBN,
                         String memberName, int memberId, String contactNumber,
                         String borrowDate, String returnDate,
                         double fineAmount, int daysLate,
                         String paymentDate, String paymentMode) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber,
              sectionName, sectionCode, title, author, ISBN,
              memberName, memberId, contactNumber,
              borrowDate, returnDate, fineAmount, daysLate,
              paymentDate, paymentMode);
    }
}
