package id27131.q9;

import java.util.Scanner;

public final class TicketRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Airline airline = null;
        Flight flight = null;
        Passenger passenger = null;
        Seat seat = null;
        Ticket ticket = null;
        Baggage baggage = null;
        Payment payment = null;
        Invoice invoice = null;

        // ===== Airline =====
        while (airline == null) {
            try {
                System.out.print("Airline Name: ");
                String aName = sc.nextLine();
                System.out.print("Address: ");
                String addr = sc.nextLine();
                System.out.print("Contact Email: ");
                String email = sc.nextLine();
                airline = new Airline(1, "2025-11-21", "2025-11-21", aName, addr, email);
            } catch (TicketDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Flight =====
        while (flight == null) {
            try {
                System.out.print("Flight Number: ");
                String fNum = sc.nextLine();
                System.out.print("Destination: ");
                String dest = sc.nextLine();
                System.out.print("Departure Time: ");
                String depTime = sc.nextLine();
                flight = new Flight(1, "2025-11-21", "2025-11-21", fNum, dest, depTime);
            } catch (TicketDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Passenger =====
        while (passenger == null) {
            try {
                System.out.print("Passenger Name: ");
                String pName = sc.nextLine();
                System.out.print("Passport Number: ");
                String passport = sc.nextLine();
                System.out.print("Nationality: ");
                String nationality = sc.nextLine();
                passenger = new Passenger(1, "2025-11-21", "2025-11-21", pName, passport, nationality);
            } catch (TicketDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Seat =====
        while (seat == null) {
            try {
                System.out.print("Seat Number: ");
                String sNum = sc.nextLine();
                System.out.print("Seat Type (Economy/Business): ");
                String sType = sc.nextLine();
                seat = new Seat(1, "2025-11-21", "2025-11-21", sNum, sType);
            } catch (TicketDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Ticket =====
        while (ticket == null) {
            try {
                System.out.print("Ticket Number: ");
                String tNum = sc.nextLine();
                System.out.print("Price: ");
                double price = Double.parseDouble(sc.nextLine());
                ticket = new Ticket(1, "2025-11-21", "2025-11-21", tNum, price);
            } catch (TicketDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Price must be a number");
            }
        }

        // ===== Baggage =====
        while (baggage == null) {
            try {
                System.out.print("Baggage Weight: ");
                double weight = Double.parseDouble(sc.nextLine());
                System.out.print("Baggage Fee: ");
                double fee = Double.parseDouble(sc.nextLine());
                baggage = new Baggage(1, "2025-11-21", "2025-11-21", weight, fee);
            } catch (TicketDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Weight and fee must be numbers");
            }
        }

        // ===== Payment =====
        while (payment == null) {
            try {
                System.out.print("Payment Date: ");
                String payDate = sc.nextLine();
                System.out.print("Payment Mode: ");
                String payMode = sc.nextLine();
                payment = new Payment(1, "2025-11-21", "2025-11-21", payDate, payMode);
            } catch (TicketDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Invoice =====
        while (invoice == null) {
            try {
                invoice = new Invoice(1, "2025-11-21", "2025-11-21", ticket.getPrice() + baggage.getBaggageFee());
            } catch (TicketDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Display =====
        System.out.println("\n=== Ticket Record ===");
        System.out.println("Airline: " + airline.getAirlineName() + " | Contact: " + airline.getContactEmail());
        System.out.println("Flight: " + flight.getFlightNumber() + " | Destination: " + flight.getDestination() + " | Departure: " + flight.getDepartureTime());
        System.out.println("Passenger: " + passenger.getPassengerName() + " | Passport: " + passenger.getPassportNumber());
        System.out.println("Seat: " + seat.getSeatNumber() + " | Type: " + seat.getSeatType());
        System.out.println("Ticket: " + ticket.getTicketNumber() + " | Price: " + ticket.getPrice());
        System.out.println("Baggage: " + baggage.getBaggageWeight() + "kg | Fee: " + baggage.getBaggageFee());
        System.out.println("Payment: " + payment.getPaymentDate() + " | Mode: " + payment.getPaymentMode());
        System.out.println("Total Fare: " + invoice.getTotalFare());
    }
}
