package id27131.q4;

import java.util.Scanner;

public final class ReservationRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hotel hotel = null;
        Room room = null;
        Customer customer = null;
        Booking booking = null;
        Service service = null;
        Payment payment = null;
        Bill bill = null;
        Feedback feedback = null;

        // ===== Hotel =====
        while (hotel == null) {
            try {
                System.out.println("=== Enter Hotel Details ===");
                System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
                System.out.print("Created Date: "); String cd = sc.nextLine();
                System.out.print("Updated Date: "); String ud = sc.nextLine();
                System.out.print("Hotel Name: "); String name = sc.nextLine();
                System.out.print("Address: "); String addr = sc.nextLine();
                System.out.print("Phone (10 digits): "); String phone = sc.nextLine();
                System.out.print("Email: "); String email = sc.nextLine();

                hotel = new Hotel(id, cd, ud, name, addr, phone, email);
            } catch (ReservationDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("ID must be a number");
            }
        }

        // ===== Room =====
        while (room == null) {
            try {
                System.out.println("=== Enter Room Details ===");
                System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
                System.out.print("Created Date: "); String cd = sc.nextLine();
                System.out.print("Updated Date: "); String ud = sc.nextLine();
                System.out.print("Room Number: "); String number = sc.nextLine();
                System.out.print("Room Type: "); String type = sc.nextLine();
                System.out.print("Price Per Night: "); double price = Double.parseDouble(sc.nextLine());

                room = new Room(id, cd, ud, number, type, price);
            } catch (ReservationDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Price must be a number");
            }
        }

        // ===== Customer =====
        while (customer == null) {
            try {
                System.out.println("=== Enter Customer Details ===");
                System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
                System.out.print("Created Date: "); String cd = sc.nextLine();
                System.out.print("Updated Date: "); String ud = sc.nextLine();
                System.out.print("Customer Name: "); String name = sc.nextLine();
                System.out.print("Customer Email: "); String email = sc.nextLine();
                System.out.print("Contact Number (10 digits): "); String contact = sc.nextLine();

                customer = new Customer(id, cd, ud, name, email, contact);
            } catch (ReservationDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("ID must be a number");
            }
        }

        // ===== Booking =====
        while (booking == null) {
            try {
                System.out.println("=== Enter Booking Details ===");
                System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
                System.out.print("Created Date: "); String cd = sc.nextLine();
                System.out.print("Updated Date: "); String ud = sc.nextLine();
                System.out.print("Booking Date: "); String bDate = sc.nextLine();
                System.out.print("Check-in Date: "); String inDate = sc.nextLine();
                System.out.print("Check-out Date: "); String outDate = sc.nextLine();

                booking = new Booking(id, cd, ud, bDate, inDate, outDate);
            } catch (ReservationDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("ID must be a number");
            }
        }

        // ===== Service =====
        while (service == null) {
            try {
                System.out.println("=== Enter Service Details ===");
                System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
                System.out.print("Created Date: "); String cd = sc.nextLine();
                System.out.print("Updated Date: "); String ud = sc.nextLine();
                System.out.print("Service Name: "); String sName = sc.nextLine();
                System.out.print("Service Cost: "); double cost = Double.parseDouble(sc.nextLine());

                service = new Service(id, cd, ud, sName, cost);
            } catch (ReservationDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Service cost must be a number");
            }
        }

        // ===== Payment =====
        while (payment == null) {
            try {
                System.out.println("=== Enter Payment Details ===");
                System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
                System.out.print("Created Date: "); String cd = sc.nextLine();
                System.out.print("Updated Date: "); String ud = sc.nextLine();
                System.out.print("Payment Method: "); String method = sc.nextLine();
                System.out.print("Payment Date: "); String pDate = sc.nextLine();

                payment = new Payment(id, cd, ud, method, pDate);
            } catch (ReservationDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("ID must be a number");
            }
        }

        // ===== Bill =====
        while (bill == null) {
            try {
                System.out.println("=== Enter Bill Details ===");
                System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
                System.out.print("Created Date: "); String cd = sc.nextLine();
                System.out.print("Updated Date: "); String ud = sc.nextLine();
                System.out.print("Room Charge: "); double roomCharge = Double.parseDouble(sc.nextLine());
                System.out.print("Service Charge: "); double serviceCharge = Double.parseDouble(sc.nextLine());

                bill = new Bill(id, cd, ud, roomCharge, serviceCharge);
            } catch (ReservationDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Charges must be numbers");
            }
        }

        // ===== Feedback =====
        while (feedback == null) {
            try {
                System.out.println("=== Enter Feedback Details ===");
                System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
                System.out.print("Created Date: "); String cd = sc.nextLine();
                System.out.print("Updated Date: "); String ud = sc.nextLine();
                System.out.print("Rating (1-5): "); int rating = Integer.parseInt(sc.nextLine());
                System.out.print("Comments: "); String comments = sc.nextLine();

                feedback = new Feedback(id, cd, ud, rating, comments);
            } catch (ReservationDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Rating must be a number");
            }
        }

        // ===== Display Summary =====
        System.out.println("\n=== Reservation Summary ===");
        System.out.println("Work done by Eloi id:27131");
        System.out.println("Hotel: " + hotel.getHotelName() + ", Phone: " + hotel.getPhoneNumber());
        System.out.println("Room: " + room.getRoomNumber() + " (" + room.getRoomType() + "), Price/Night: " + room.getPricePerNight());
        System.out.println("Customer: " + customer.getCustomerName() + ", Contact: " + customer.getContactNumber());
        System.out.println("Booking: " + booking.getBookingDate() + " | Check-in: " + booking.getCheckInDate() + " | Check-out: " + booking.getCheckOutDate());
        System.out.println("Service: " + service.getServiceName() + ", Cost: " + service.getServiceCost());
        System.out.println("Bill Total: " + bill.getTotalBill());
        System.out.println("Feedback: Rating " + feedback.getRating() + " | Comments: " + feedback.getComments());

        sc.close();
    }
}
