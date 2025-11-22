package id27131.q5;

import java.util.Scanner;

public final class RentalRecord {
    public static void main(String[] args) throws RentalException {
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
            } catch (RentalException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Company ---
        Company company = null;
        while (company == null) {
            try {
                System.out.print("Company Name: ");
                String companyName = sc.nextLine();
                System.out.print("Address: ");
                String companyAddress = sc.nextLine();
                System.out.print("Phone (10 digits): ");
                String companyPhone = sc.nextLine();

                company = new Company(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        companyName, companyAddress, companyPhone);
            } catch (RentalException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Branch ---
        Branch branch = null;
        while (branch == null) {
            try {
                System.out.print("Branch Name: ");
                String branchName = sc.nextLine();
                System.out.print("Location Code (≥3 chars): ");
                String locationCode = sc.nextLine();

                branch = new Branch(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        company.getCompanyName(), company.getAddress(), company.getPhoneNumber(),
                        branchName, locationCode);
            } catch (RentalException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Vehicle ---
        Vehicle vehicle = null;
        while (vehicle == null) {
            try {
                System.out.print("Vehicle Type: ");
                String vehicleType = sc.nextLine();
                System.out.print("Registration Number: ");
                String registrationNumber = sc.nextLine();
                System.out.print("Daily Rate (>0): ");
                double dailyRate = Double.parseDouble(sc.nextLine());

                vehicle = new Vehicle(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        company.getCompanyName(), company.getAddress(), company.getPhoneNumber(),
                        branch.getBranchName(), branch.getLocationCode(),
                        vehicleType, registrationNumber, dailyRate);
            } catch (NumberFormatException e) {
                System.out.println("Daily Rate must be a number. Try again.");
            } catch (RentalException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Customer ---
        Customer customer = null;
        while (customer == null) {
            try {
                System.out.print("Customer Name: ");
                String customerName = sc.nextLine();
                System.out.print("License Number: ");
                String licenseNumber = sc.nextLine();
                System.out.print("Contact Number (10 digits): ");
                String customerContact = sc.nextLine();

                customer = new Customer(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        company.getCompanyName(), company.getAddress(), company.getPhoneNumber(),
                        branch.getBranchName(), branch.getLocationCode(),
                        vehicle.getVehicleType(), vehicle.getRegistrationNumber(), vehicle.getDailyRate(),
                        customerName, licenseNumber, customerContact);
            } catch (RentalException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Rental ---
        Rental rental = null;
        while (rental == null) {
            try {
                System.out.print("Rental Date: ");
                String rentalDate = sc.nextLine();
                System.out.print("Return Date: ");
                String returnDate = sc.nextLine();
                System.out.print("Rental Days (>0): ");
                int rentalDays = Integer.parseInt(sc.nextLine());

                rental = new Rental(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        company.getCompanyName(), company.getAddress(), company.getPhoneNumber(),
                        branch.getBranchName(), branch.getLocationCode(),
                        vehicle.getVehicleType(), vehicle.getRegistrationNumber(), vehicle.getDailyRate(),
                        customer.getCustomerName(), customer.getLicenseNumber(), customer.getContactNumber(),
                        rentalDate, returnDate, rentalDays);
            } catch (NumberFormatException e) {
                System.out.println("Rental Days must be a number. Try again.");
            } catch (RentalException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Charge ---
        Charge charge = null;
        while (charge == null) {
            try {
                System.out.print("Rental Charge (≥0): ");
                double rentalCharge = Double.parseDouble(sc.nextLine());
                System.out.print("Penalty Charge (≥0): ");
                double penaltyCharge = Double.parseDouble(sc.nextLine());

                charge = new Charge(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        company.getCompanyName(), company.getAddress(), company.getPhoneNumber(),
                        branch.getBranchName(), branch.getLocationCode(),
                        vehicle.getVehicleType(), vehicle.getRegistrationNumber(), vehicle.getDailyRate(),
                        customer.getCustomerName(), customer.getLicenseNumber(), customer.getContactNumber(),
                        rental.getRentalDate(), rental.getReturnDate(), rental.getRentalDays(),
                        rentalCharge, penaltyCharge);
            } catch (NumberFormatException e) {
                System.out.println("Charges must be numbers. Try again.");
            } catch (RentalException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Payment ---
        Payment payment = null;
        while (payment == null) {
            try {
                System.out.print("Payment Mode: ");
                String paymentMode = sc.nextLine();
                System.out.print("Transaction ID: ");
                String transactionId = sc.nextLine();

                payment = new Payment(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        company.getCompanyName(), company.getAddress(), company.getPhoneNumber(),
                        branch.getBranchName(), branch.getLocationCode(),
                        vehicle.getVehicleType(), vehicle.getRegistrationNumber(), vehicle.getDailyRate(),
                        customer.getCustomerName(), customer.getLicenseNumber(), customer.getContactNumber(),
                        rental.getRentalDate(), rental.getReturnDate(), rental.getRentalDays(),
                        charge.getRentalCharge(), charge.getPenaltyCharge(),
                        paymentMode, transactionId);
            } catch (RentalException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Invoice ---
        Invoice invoice = new Invoice(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                company.getCompanyName(), company.getAddress(), company.getPhoneNumber(),
                branch.getBranchName(), branch.getLocationCode(),
                vehicle.getVehicleType(), vehicle.getRegistrationNumber(), vehicle.getDailyRate(),
                customer.getCustomerName(), customer.getLicenseNumber(), customer.getContactNumber(),
                rental.getRentalDate(), rental.getReturnDate(), rental.getRentalDays(),
                charge.getRentalCharge(), charge.getPenaltyCharge(),
                payment.getPaymentMode(), payment.getTransactionId());


        // --- Display Rental Record ---
        System.out.println("\n=== Final Rental Record ===");
        System.out.println("\nq5 Done by Eloi id:27131");
        System.out.println("\nEntity Details");
        System.out.println("ID: " + entity.getId());
        System.out.println("Created Date: " + entity.getCreatedDate());
        System.out.println("Updated Date: " + entity.getUpdatedDate());

        System.out.println("\nCompany Details");
        System.out.println("Company Name: " + company.getCompanyName());
        System.out.println("Address: " + company.getAddress());
        System.out.println("Phone: " + company.getPhoneNumber());

        System.out.println("\nBranch Details");
        System.out.println("Branch Name: " + branch.getBranchName());
        System.out.println("Location Code: " + branch.getLocationCode());

        System.out.println("\nVehicle Details");
        System.out.println("Vehicle Type: " + vehicle.getVehicleType());
        System.out.println("Registration Number: " + vehicle.getRegistrationNumber());
        System.out.println("Daily Rate: " + vehicle.getDailyRate());

        System.out.println("\nCustomer Details");
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("License Number: " + customer.getLicenseNumber());
        System.out.println("Contact: " + customer.getContactNumber());

        System.out.println("\nRental Details");
        System.out.println("Rental Date: " + rental.getRentalDate());
        System.out.println("Return Date: " + rental.getReturnDate());
        System.out.println("Rental Days: " + rental.getRentalDays());

        System.out.println("\nCharges Details");
        System.out.println("Rental Charge: " + charge.getRentalCharge());
        System.out.println("Penalty Charge: " + charge.getPenaltyCharge());
        System.out.println("Total Charge: " + invoice.getTotalCharge());

        System.out.println("\nPayment Details");
        System.out.println("Payment Mode: " + payment.getPaymentMode());
        System.out.println("Transaction ID: " + payment.getTransactionId());
    }
}
