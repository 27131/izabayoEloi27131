package id27131.q9;

public class Ticket extends Entity {
    private String ticketNumber;
    private double price;

    public Ticket(int id, String createdDate, String updatedDate, String ticketNumber, double price) throws TicketDataException {
        super(id, createdDate, updatedDate);
        if (ticketNumber == null || ticketNumber.isEmpty()) throw new TicketDataException("Ticket number cannot be empty");
        if (price <= 0) throw new TicketDataException("Price must be greater than 0");
        this.ticketNumber = ticketNumber;
        this.price = price;
    }

    public String getTicketNumber() { return ticketNumber; }
    public double getPrice() { return price; }
}
