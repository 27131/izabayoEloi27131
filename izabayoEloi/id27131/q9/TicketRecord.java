package id27131.q9;

import java.util.Scanner;

public final class TicketRecord {
    public static void main(String[] args) throws TicketDataException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWork done by Eloi, id: 27131\n");

        // --- Entity ---
        Entity entity = null;
        while (entity == null) {
            try {
                System.out.print("Entity ID (>0): ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.print("Created Date: ");
                String createdDate = sc.nextLine();
                System.out.print("Updated Date: ");
                String updatedDate = sc.nextLine();

                entity = new Entity(id, createdDate, updatedDate);
            } catch (NumberFormatException e) {
                System.out.println("ID must be a number. Try again.");
            } catch (TicketDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Airline ---
        Airline airline = null;
        while (airline == null) {
            try {
                System.out.print("Airline Name: ");
                String name = sc.nextLine();
                System.out.print("Address: ");
                String address = sc.nextLine();
                System.out.print("Contact Email: ");
                String email = sc.nextLine();

                airline = new Airline(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        name, address, email);
            } catch (TicketDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Flight ---
        Flight flight = null;
        while (flight == null) {
            try {
                System.out.print("Flight Number: ");
                String number = sc.nextLine();
                System.out.print("Destination: ");
                String destination = sc.nextLine();
                System.out.print("Departure Time: ");
                String departureTime = sc.nextLine();

                flight = new Flight(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        number, destination, departureTime);
            } catch (TicketDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Passenger ---
        Passenger passenger = null;
        while (passenger == null) {
            try {
                System.out.print("Passenger Name: ");
                String name = sc.nextLine();
                System.out.print("Passport Number: ");
                String passport = sc.nextLine();
                System.out.print("Nationality: ");
                String nationality = sc.nextLine();

                passenger = new Passenger(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        name, passport, nationality);
            } catch (TicketDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Seat ---
        Seat seat = null;
        while (seat == null) {
            try {
                System.out.print("Seat Number: ");
                String seatNumber = sc.nextLine();
                System.out.print("Seat Type (Economy/Business): ");
                String seatType = sc.nextLine();

                seat = new Seat(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        seatNumber, seatType);
            } catch (TicketDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Ticket ---
        Ticket ticket = null;
        while (ticket == null) {
            try {
                System.out.print("Ticket Number: ");
                String ticketNumber = sc.nextLine();
                System.out.print("Price (>0): ");
                double price = Double.parseDouble(sc.nextLine());

                ticket = new Ticket(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        ticketNumber, price);
            } catch (NumberFormatException e) {
                System.out.println("Price must be a number. Try again.");
            } catch (TicketDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Baggage ---
        Baggage baggage = null;
        while (baggage == null) {
            try {
                System.out.print("Baggage Weight (kg ≥0): ");
                double weight = Double.parseDouble(sc.nextLine());
                System.out.print("Baggage Fee (≥0): ");
                double fee = Double.parseDouble(sc.nextLine());

                baggage = new Baggage(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        weight, fee);
            } catch (NumberFormatException e) {
                System.out.println("Weight and fee must be numbers. Try again.");
            } catch (TicketDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Payment ---
        Payment payment = null;
        while (payment == null) {
            try {
                System.out.print("Payment Date: ");
                String paymentDate = sc.nextLine();
                System.out.print("Payment Mode: ");
                String paymentMode = sc.nextLine();

                payment = new Payment(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        paymentDate, paymentMode);
            } catch (TicketDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Invoice ---
        Invoice invoice = null;
        while (invoice == null) {
            try {
                double totalFare = ticket.getPrice() + baggage.getBaggageFee();
                invoice = new Invoice(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        totalFare);
            } catch (TicketDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Display Ticket Record ---
        System.out.println("\n=== Ticket Record ===");
        System.out.println("Work done by Eloi, id:27131");

        System.out.println("\nAirline Details");
        System.out.println("Name: " + airline.getAirlineName());
        System.out.println("Address: " + airline.getAddress());
        System.out.println("Contact Email: " + airline.getContactEmail());

        System.out.println("\nFlight Details");
        System.out.println("Flight Number: " + flight.getFlightNumber());
        System.out.println("Destination: " + flight.getDestination());
        System.out.println("Departure Time: " + flight.getDepartureTime());

        System.out.println("\nPassenger Details");
        System.out.println("Name: " + passenger.getPassengerName());
        System.out.println("Passport Number: " + passenger.getPassportNumber());
        System.out.println("Nationality: " + passenger.getNationality());

        System.out.println("\nSeat Details");
        System.out.println("Seat Number: " + seat.getSeatNumber());
        System.out.println("Seat Type: " + seat.getSeatType());

        System.out.println("\nTicket Details");
        System.out.println("Ticket Number: " + ticket.getTicketNumber());
        System.out.println("Price: " + ticket.getPrice());

        System.out.println("\nBaggage Details");
        System.out.println("Weight: " + baggage.getBaggageWeight() + "kg");
        System.out.println("Fee: " + baggage.getBaggageFee());

        System.out.println("\nPayment Details");
        System.out.println("Payment Date: " + payment.getPaymentDate());
        System.out.println("Payment Mode: " + payment.getPaymentMode());

        System.out.println("\nInvoice Details");
        System.out.println("Total Fare: " + invoice.getTotalFare());
    }
}
