package id27131.q8;

public class Fine extends Borrow {
    private double fineAmount;
    private int daysLate;

    public Fine(int id, String createdDate, String updatedDate,
                String libraryName, String location, String phoneNumber,
                String sectionName, String sectionCode,
                String title, String author, String ISBN,
                String memberName, int memberId, String contactNumber,
                String borrowDate, String returnDate,
                double fineAmount, int daysLate) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber,
              sectionName, sectionCode, title, author, ISBN,
              memberName, memberId, contactNumber,
              borrowDate, returnDate);
        setFineAmount(fineAmount);
        setDaysLate(daysLate);
    }

    public double getFineAmount() { return fineAmount; }
    public void setFineAmount(double fineAmount) throws LibraryDataException {
        if (fineAmount < 0) throw new LibraryDataException("Fine amount cannot be negative");
        this.fineAmount = fineAmount;
    }

    public int getDaysLate() { return daysLate; }
    public void setDaysLate(int daysLate) throws LibraryDataException {
        if (daysLate < 0) throw new LibraryDataException("Days late cannot be negative");
        this.daysLate = daysLate;
    }
}
