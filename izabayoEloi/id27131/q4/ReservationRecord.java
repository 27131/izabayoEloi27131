package id27131.q4;

import java.util.Scanner;

public final class ReservationRecord {
    public static void main(String[] args) throws ReservationException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWork done by Eloi id:27131\n");

        // --- Entity ---
        Entity entity = null;
        while (entity == null) {
            try {
                System.out.print("Enter ID: ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.print("Enter Created Date: ");
                String createdDate = sc.nextLine();
                System.out.print("Enter Updated Date: ");
                String updatedDate = sc.nextLine();

                entity = new Entity(id, createdDate, updatedDate);
            } catch (NumberFormatException e) {
                System.out.println("ID must be a number. Please try again.");
            } catch (ReservationException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Hotel ---
        Hotel hotel = null;
        while (hotel == null) {
            try {
                System.out.print("Hotel Name: ");
                String hotelName = sc.nextLine();
                System.out.print("Hotel Address: ");
                String hotelAddress = sc.nextLine();
                System.out.print("Hotel Phone (10 digits): ");
                String hotelPhone = sc.nextLine();
                System.out.print("Hotel Email: ");
                String hotelEmail = sc.nextLine();

                hotel = new Hotel(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                  hotelName, hotelAddress, hotelPhone, hotelEmail);
            } catch (ReservationException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Room ---
        Room room = null;
        while (room == null) {
            try {
                System.out.print("Room Number: ");
                int roomNumber = Integer.parseInt(sc.nextLine());
                System.out.print("Room Type: ");
                String roomType = sc.nextLine();
                System.out.print("Price Per Night: ");
                double pricePerNight = Double.parseDouble(sc.nextLine());

                room = new Room(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                hotel.getHotelName(), hotel.getAddress(), hotel.getPhoneNumber(), hotel.getEmail(),
                                roomNumber, roomType, pricePerNight);
            } catch (NumberFormatException e) {
                System.out.println("Room number and price must be numbers. Try again.");
            } catch (ReservationException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Customer ---
        Customer customer = null;
        while (customer == null) {
            try {
                System.out.print("Customer Name: ");
                String customerName = sc.nextLine();
                System.out.print("Customer Email: ");
                String customerEmail = sc.nextLine();
                System.out.print("Customer Contact (10 digits): ");
                String customerContact = sc.nextLine();

                customer = new Customer(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                        hotel.getHotelName(), hotel.getAddress(), hotel.getPhoneNumber(), hotel.getEmail(),
                                        room.getRoomNumber(), room.getRoomType(), room.getPricePerNight(),
                                        customerName, customerEmail, customerContact);
            } catch (ReservationException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Booking ---
        Booking booking = null;
        while (booking == null) {
            try {
                System.out.print("Booking Date: ");
                String bookingDate = sc.nextLine();
                System.out.print("Check-In Date: ");
                String checkInDate = sc.nextLine();
                System.out.print("Check-Out Date: ");
                String checkOutDate = sc.nextLine();

                booking = new Booking(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                      hotel.getHotelName(), hotel.getAddress(), hotel.getPhoneNumber(), hotel.getEmail(),
                                      room.getRoomNumber(), room.getRoomType(), room.getPricePerNight(),
                                      customer.getCustomerName(), customer.getCustomerEmail(), customer.getContactNumber(),
                                      bookingDate, checkInDate, checkOutDate);
            } catch (ReservationException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Service ---
        Service service = null;
        while (service == null) {
            try {
                System.out.print("Service Name: ");
                String serviceName = sc.nextLine();
                System.out.print("Service Cost: ");
                double serviceCost = Double.parseDouble(sc.nextLine());

                service = new Service(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                      hotel.getHotelName(), hotel.getAddress(), hotel.getPhoneNumber(), hotel.getEmail(),
                                      room.getRoomNumber(), room.getRoomType(), room.getPricePerNight(),
                                      customer.getCustomerName(), customer.getCustomerEmail(), customer.getContactNumber(),
                                      booking.getBookingDate(), booking.getCheckInDate(), booking.getCheckOutDate(),
                                      serviceName, serviceCost);
            } catch (NumberFormatException e) {
                System.out.println("Service cost must be a number. Try again.");
            } catch (ReservationException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Payment ---
        Payment payment = null;
        while (payment == null) {
            try {
                System.out.print("Payment Method: ");
                String paymentMethod = sc.nextLine();
                System.out.print("Payment Date: ");
                String paymentDate = sc.nextLine();

                payment = new Payment(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                      hotel.getHotelName(), hotel.getAddress(), hotel.getPhoneNumber(), hotel.getEmail(),
                                      room.getRoomNumber(), room.getRoomType(), room.getPricePerNight(),
                                      customer.getCustomerName(), customer.getCustomerEmail(), customer.getContactNumber(),
                                      booking.getBookingDate(), booking.getCheckInDate(), booking.getCheckOutDate(),
                                      service.getServiceName(), service.getServiceCost(),
                                      paymentMethod, paymentDate);
            } catch (ReservationException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Bill ---
        Bill bill = new Bill(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                             hotel.getHotelName(), hotel.getAddress(), hotel.getPhoneNumber(), hotel.getEmail(),
                             room.getRoomNumber(), room.getRoomType(), room.getPricePerNight(),
                             customer.getCustomerName(), customer.getCustomerEmail(), customer.getContactNumber(),
                             booking.getBookingDate(), booking.getCheckInDate(), booking.getCheckOutDate(),
                             service.getServiceName(), service.getServiceCost(),
                             payment.getPaymentMethod(), payment.getPaymentDate());

        // --- Feedback ---
        Feedback feedback = null;
        while (feedback == null) {
            try {
                System.out.print("Rating (1-5): ");
                int rating = Integer.parseInt(sc.nextLine());
                System.out.print("Comments: ");
                String comments = sc.nextLine();

                feedback = new Feedback(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                        hotel.getHotelName(), hotel.getAddress(), hotel.getPhoneNumber(), hotel.getEmail(),
                                        room.getRoomNumber(), room.getRoomType(), room.getPricePerNight(),
                                        customer.getCustomerName(), customer.getCustomerEmail(), customer.getContactNumber(),
                                        booking.getBookingDate(), booking.getCheckInDate(), booking.getCheckOutDate(),
                                        service.getServiceName(), service.getServiceCost(),
                                        payment.getPaymentMethod(), payment.getPaymentDate(),
                                        rating, comments);
            } catch (NumberFormatException e) {
                System.out.println("Rating must be a number. Try again.");
            } catch (ReservationException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Display Reservation Record ---
        System.out.println("\n=== Final Reservation Record ===");
        System.out.println("\nq4 Done by Eloi id:27131");

        System.out.println("\nEntity Details");
        System.out.println("ID: " + entity.getId());
        System.out.println("Created Date: " + entity.getCreatedDate());
        System.out.println("Updated Date: " + entity.getUpdatedDate());

        System.out.println("\nHotel Details");
        System.out.println("Hotel Name: " + hotel.getHotelName());
        System.out.println("Address: " + hotel.getAddress());
        System.out.println("Phone: " + hotel.getPhoneNumber());
        System.out.println("Email: " + hotel.getEmail());

        System.out.println("\nRoom Details");
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Room Type: " + room.getRoomType());
        System.out.println("Price per Night: " + room.getPricePerNight());

        System.out.println("\nCustomer Details");
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Email: " + customer.getCustomerEmail());
        System.out.println("Contact: " + customer.getContactNumber());

        System.out.println("\nBooking Details");
        System.out.println("Booking Date: " + booking.getBookingDate());
        System.out.println("Check-In: " + booking.getCheckInDate());
        System.out.println("Check-Out: " + booking.getCheckOutDate());

        System.out.println("\nService Details");
        System.out.println("Service Name: " + service.getServiceName());
        System.out.println("Service Cost: " + service.getServiceCost());

        System.out.println("\nPayment Details");
        System.out.println("Payment Method: " + payment.getPaymentMethod());
        System.out.println("Payment Date: " + payment.getPaymentDate());

        System.out.println("\nBill Details");
        System.out.println("Room Charge: " + bill.getRoomCharge());
        System.out.println("Service Charge: " + bill.getServiceCharge());
        System.out.println("Total Bill: " + bill.getTotalBill());

        System.out.println("\nFeedback Details");
        System.out.println("Rating: " + feedback.getRating());
        System.out.println("Comments: " + feedback.getComments());
    }
}
