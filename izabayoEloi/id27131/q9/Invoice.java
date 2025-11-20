package id27131.q9;

public class Invoice extends Payment {
    private double totalFare;

    public Invoice(int id, String createdDate, String updatedDate,
                   String airlineName, String address, String contactEmail,
                   String flightNumber, String destination, String departureTime,
                   String passengerName, String passportNumber, String nationality,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee,
                   String paymentDate, String paymentMode) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
              flightNumber, destination, departureTime,
              passengerName, passportNumber, nationality,
              seatNumber, seatType,
              ticketNumber, price,
              baggageWeight, baggageFee,
              paymentDate, paymentMode);
        generateInvoice();
    }

    public double getTotalFare() { return totalFare; }

    public void generateInvoice() {
        this.totalFare = getPrice() + getBaggageFee();
    }
}
