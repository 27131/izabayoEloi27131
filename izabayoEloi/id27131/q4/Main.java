package id27131.q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Created Date: ");
            String createdDate = sc.nextLine();

            System.out.print("Enter Updated Date: ");
            String updatedDate = sc.nextLine();

            System.out.print("Enter Hotel Name: ");
            String hotelName = sc.nextLine();

            System.out.print("Enter Hotel Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Hotel Phone Number: ");
            String hotelPhone = sc.nextLine();

            System.out.print("Enter Hotel Email: ");
            String hotelEmail = sc.nextLine();

            System.out.print("Enter Room Number: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Room Type: ");
            String roomType = sc.nextLine();

            System.out.print("Enter Price Per Night: ");
            double pricePerNight = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Customer Name: ");
            String customerName = sc.nextLine();

            System.out.print("Enter Customer Email: ");
            String customerEmail = sc.nextLine();

            System.out.print("Enter Customer Contact Number: ");
            String customerContact = sc.nextLine();

            System.out.print("Enter Booking Date: ");
            String bookingDate = sc.nextLine();

            System.out.print("Enter Check-In Date: ");
            String checkInDate = sc.nextLine();

            System.out.print("Enter Check-Out Date: ");
            String checkOutDate = sc.nextLine();

            System.out.print("Enter Service Name: ");
            String serviceName = sc.nextLine();

            System.out.print("Enter Service Cost: ");
            double serviceCost = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Payment Method: ");
            String paymentMethod = sc.nextLine();

            System.out.print("Enter Payment Date: ");
            String paymentDate = sc.nextLine();

            System.out.print("Enter Room Charge: ");
            double roomCharge = sc.nextDouble();

            System.out.print("Enter Service Charge: ");
            double serviceCharge = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Rating (1-5): ");
            int rating = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Comments: ");
            String comments = sc.nextLine();

            ReservationRecord record = new ReservationRecord(
                    id, createdDate, updatedDate,
                    hotelName, address, hotelPhone, hotelEmail,
                    roomNumber, roomType, pricePerNight,
                    customerName, customerEmail, customerContact,
                    bookingDate, checkInDate, checkOutDate,
                    serviceName, serviceCost,
                    paymentMethod, paymentDate,
                    roomCharge, serviceCharge, roomCharge + serviceCharge,
                    rating, comments
            );

            System.out.println("\n--- Reservation Details ---");
            System.out.println("Hotel: " + record.getHotelName());
            System.out.println("Address: " + record.getAddress());
            System.out.println("Room Number: " + record.getRoomNumber());
            System.out.println("Room Type: " + record.getRoomType());
            System.out.println("Price Per Night: " + record.getPricePerNight());
            System.out.println("Customer: " + record.getCustomerName());
            System.out.println("Email: " + record.getCustomerEmail());
            System.out.println("Contact: " + record.getContactNumber());
            System.out.println("Booking Date: " + record.getBookingDate());
            System.out.println("Check-In: " + record.getCheckInDate());
            System.out.println("Check-Out: " + record.getCheckOutDate());
            System.out.println("Service: " + record.getServiceName() + " | Cost: " + record.getServiceCost());
            System.out.println("Payment Method: " + record.getPaymentMethod());
            System.out.println("Payment Date: " + record.getPaymentDate());
            System.out.println("Room Charge: " + record.getRoomCharge());
            System.out.println("Service Charge: " + record.getServiceCharge());
            System.out.println("Total Bill: " + record.generateBill());
            System.out.println("Rating: " + record.getRating());
            System.out.println("Comments: " + record.getComments());

        } catch (ReservationDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
