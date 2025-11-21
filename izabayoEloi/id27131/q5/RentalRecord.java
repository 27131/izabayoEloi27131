package id27131.q5;

import java.util.Scanner;

public final class RentalRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Company company = null;
        Branch branch = null;
        Vehicle vehicle = null;
        Customer customer = null;
        Rental rental = null;
        Charge charge = null;
        Payment payment = null;
        Invoice invoice = null;

        // ===== Company =====
        while (company == null) {
            try {
                System.out.println("=== Enter Company Details ===");
                System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
                System.out.print("Created Date: "); String cd = sc.nextLine();
                System.out.print("Updated Date: "); String ud = sc.nextLine();
                System.out.print("Company Name: "); String name = sc.nextLine();
                System.out.print("Address: "); String addr = sc.nextLine();
                System.out.print("Phone (10 digits): "); String phone = sc.nextLine();

                company = new Company(id, cd, ud, name, addr, phone);
            } catch (RentalDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("ID must be a number");
            }
        }

        // ===== Branch =====
        while (branch == null) {
            try {
                System.out.println("=== Enter Branch Details ===");
                System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
                System.out.print("Created Date: "); String cd = sc.nextLine();
                System.out.print("Updated Date: "); String ud = sc.nextLine();
                System.out.print("Branch Name: "); String bName = sc.nextLine();
                System.out.print("Location Code (≥3 chars): "); String code = sc.nextLine();

                branch = new Branch(id, cd, ud, bName, code);
            } catch (RentalDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("ID must be a number");
            }
        }

        // ===== Vehicle =====
        while (vehicle == null) {
            try {
                System.out.println("=== Enter Vehicle Details ===");
                System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
                System.out.print("Created Date: "); String cd = sc.nextLine();
                System.out.print("Updated Date: "); String ud = sc.nextLine();
                System.out.print("Vehicle Type: "); String type = sc.nextLine();
                System.out.print("Registration Number: "); String reg = sc.nextLine();
                System.out.print("Daily Rate: "); double rate = Double.parseDouble(sc.nextLine());

                vehicle = new Vehicle(id, cd, ud, type, reg, rate);
            } catch (RentalDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Daily Rate must be a number");
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
                System.out.print("License Number: "); String license = sc.nextLine();
                System.out.print("Contact Number (10 digits): "); String contact = sc.nextLine();

                customer = new Customer(id, cd, ud, name, license, contact);
            } catch (RentalDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("ID must be a number");
            }
        }

        // ===== Rental =====
        while (rental == null) {
            try {
                System.out.println("=== Enter Rental Details ===");
                System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
                System.out.print("Created Date: "); String cd = sc.nextLine();
                System.out.print("Updated Date: "); String ud = sc.nextLine();
                System.out.print("Rental Date: "); String rDate = sc.nextLine();
                System.out.print("Return Date: "); String retDate = sc.nextLine();
                System.out.print("Rental Days: "); int days = Integer.parseInt(sc.nextLine());

                rental = new Rental(id, cd, ud, rDate, retDate, days);
            } catch (RentalDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Rental Days must be a number");
            }
        }

        // ===== Charge =====
        while (charge == null) {
            try {
                System.out.println("=== Enter Charge Details ===");
                System.out.print("Rental Charge: "); double rentalCharge = Double.parseDouble(sc.nextLine());
                System.out.print("Penalty Charge: "); double penaltyCharge = Double.parseDouble(sc.nextLine());

                charge = new Charge(rentalCharge, penaltyCharge);
            } catch (RentalDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Charges must be numbers");
            }
        }

        // ===== Payment =====
        while (payment == null) {
            try {
                System.out.println("=== Enter Payment Details ===");
                System.out.print("Payment Mode: "); String mode = sc.nextLine();
                System.out.print("Transaction ID: "); String txnId = sc.nextLine();

                payment = new Payment(mode, txnId);
            } catch (RentalDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Invoice =====
        while (invoice == null) {
            try {
                invoice = new Invoice(charge);
            } catch (RentalDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Display Summary =====
        System.out.println("\n=== Vehicle Rental Summary ===");
        System.out.println("Company: " + company.getCompanyName() + ", Phone: " + company.getPhoneNumber());
        System.out.println("Branch: " + branch.getBranchName() + ", Code: " + branch.getLocationCode());
        System.out.println("Vehicle: " + vehicle.getVehicleType() + " (" + vehicle.getRegistrationNumber() + "), Daily Rate: " + vehicle.getDailyRate());
        System.out.println("Customer: " + customer.getCustomerName() + ", License: " + customer.getLicenseNumber() + ", Contact: " + customer.getContactNumber());
        System.out.println("Rental: " + rental.getRentalDate() + " to " + rental.getReturnDate() + " | Days: " + rental.getRentalDays());
        System.out.println("Charges: Rental " + charge.getRentalCharge() + ", Penalty " + charge.getPenaltyCharge());
        System.out.println("Invoice Total: " + invoice.getTotalCharge());
        System.out.println("Payment: Mode " + payment.getPaymentMode() + ", Transaction ID " + payment.getTransactionId());

        sc.close();
    }
}
