package id27131.q8;

public class Fine extends Entity {
    private double fineAmount;
    private int daysLate;

    public Fine(int id, String createdDate, String updatedDate, double fineAmount, int daysLate) throws LibraryDataException {
        super(id, createdDate, updatedDate);
        if (fineAmount < 0) throw new LibraryDataException("Fine amount cannot be negative");
        if (daysLate <= 0) throw new LibraryDataException("Days late must be greater than 0");
        this.fineAmount = fineAmount;
        this.daysLate = daysLate;
    }

    public double getFineAmount() { return fineAmount; }
    public int getDaysLate() { return daysLate; }
    public double calculateFine() { return fineAmount * daysLate; }
}
