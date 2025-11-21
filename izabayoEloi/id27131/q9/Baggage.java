package id27131.q9;

public class Baggage extends Entity {
    private double baggageWeight;
    private double baggageFee;

    public Baggage(int id, String createdDate, String updatedDate, double baggageWeight, double baggageFee) throws TicketDataException {
        super(id, createdDate, updatedDate);
        if (baggageWeight < 0) throw new TicketDataException("Baggage weight cannot be negative");
        if (baggageFee < 0) throw new TicketDataException("Baggage fee cannot be negative");
        this.baggageWeight = baggageWeight;
        this.baggageFee = baggageFee;
    }

    public double getBaggageWeight() { return baggageWeight; }
    public double getBaggageFee() { return baggageFee; }
}
