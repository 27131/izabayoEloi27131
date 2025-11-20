package id27131.q9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter ID: ");
            int id = sc.nextInt(); sc.nextLine();

            System.out.print("Enter Created Date: ");
            String createdDate = sc.nextLine();

            System.out.print("Enter Updated Date: ");
            String updatedDate = sc.nextLine();

            System.out.print("Enter Airline Name: ");
            String airlineName = sc.nextLine();

            System.out.print("Enter Airline Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Contact Email: ");
            String contactEmail = sc.nextLine();

            System.out.print("Enter Flight Number: ");
            String flightNumber = sc.nextLine();

            System.out.print("Enter Destination: ");
            String destination = sc.nextLine();

            System.out.print("Enter Departure Time: ");
            String departureTime = sc.nextLine();

            System.out.print("Enter Passenger Name: ");
            String passengerName = sc.nextLine();

            System.out.print("Enter Passport Number: ");
            String passportNumber = sc.nextLine();

            System.out.print("Enter Nationality: ");
            String nationality = sc.nextLine();

            System.out.print("Enter Seat Number: ");
            String seatNumber = sc.nextLine();

            System.out.print("Enter Seat Type (Economy/Business): ");
            String seatType = sc.nextLine();

            System.out.print("Enter Ticket Number: ");
            String ticketNumber = sc.nextLine();

            System.out.print("Enter Ticket Price: ");
            double price = sc.nextDouble(); sc.nextLine();

            System.out.print("Enter Baggage Weight: ");
            double baggageWeight = sc.nextDouble(); sc.nextLine();

            System.out.print("Enter Baggage Fee: ");
            double baggageFee = sc.nextDouble(); sc.nextLine();

            System.out.print("Enter Payment Date: ");
            String paymentDate = sc.nextLine();

            System.out.print("Enter Payment Mode: ");
            String paymentMode = sc.nextLine();

            TicketRecord record = new TicketRecord(
                id, createdDate, updatedDate, airlineName, address, contactEmail,
                flightNumber, destination, departureTime,
                passengerName, passportNumber, nationality,
                seatNumber, seatType, ticketNumber, price,
                baggageWeight, baggageFee, paymentDate, paymentMode
            );

            System.out.println("\n--- Airline Ticket Record ---");
            System.out.println("Airline: " + airlineName + " | Contact: " + contactEmail);
            System.out.println("Flight: " + flightNumber + " | Destination: " + destination + " | Departure: " + departureTime);
            System.out.println("Passenger: " + passengerName + " | Passport: " + passportNumber + " | Nationality: " + nationality);
            System.out.println("Seat: " + seatNumber + " | Type: " + seatType);
            System.out.println("Ticket: " + ticketNumber + " | Price: " + price);
            System.out.println("Baggage: " + baggageWeight + "kg | Fee: " + baggageFee);
            System.out.println("Total Fare: " + record.getTotalFare());
            System.out.println("Payment: " + paymentMode + " on " + paymentDate);

        } catch (AirlineDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
