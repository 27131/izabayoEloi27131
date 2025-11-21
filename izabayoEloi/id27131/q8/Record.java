package id27131.q8;

public class Record extends Entity {
    private double totalFine;

    public Record(int id, String createdDate, String updatedDate, double totalFine) throws LibraryDataException {
        super(id, createdDate, updatedDate);
        if (totalFine < 0) throw new LibraryDataException("Total fine cannot be negative");
        this.totalFine = totalFine;
    }

    public double getTotalFine() { return totalFine; }
}
