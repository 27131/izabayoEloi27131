package id27131.q5;

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

            System.out.print("Enter Company Name: ");
            String companyName = sc.nextLine();

            System.out.print("Enter Company Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Company Phone: ");
            String companyPhone = sc.nextLine();

            System.out.print("Enter Branch Name: ");
            String branchName = sc.nextLine();

            System.out.print("Enter Location Code: ");
            String locationCode = sc.nextLine();

            System.out.print("Enter Vehicle Type: ");
            String vehicleType = sc.nextLine();

            System.out.print("Enter Vehicle Registration Number: ");
            String regNumber = sc.nextLine();

            System.out.print("Enter Daily Rate: ");
            double dailyRate = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Customer Name: ");
            String customerName = sc.nextLine();

            System.out.print("Enter License Number: ");
            String licenseNumber = sc.nextLine();

            System.out.print("Enter Customer Contact: ");
            String customerContact = sc.nextLine();

            System.out.print("Enter Rental Date: ");
            String rentalDate = sc.nextLine();

            System.out.print("Enter Return Date: ");
            String returnDate = sc.nextLine();

            System.out.print("Enter Rental Days: ");
            int rentalDays = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Rental Charge: ");
            double rentalCharge = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Penalty Charge: ");
            double penaltyCharge = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Payment Mode: ");
            String paymentMode = sc.nextLine();

            System.out.print("Enter Transaction ID: ");
            String transactionId = sc.nextLine();

            RentalRecord record = new RentalRecord(
                    id, createdDate, updatedDate, companyName, address, companyPhone,
                    branchName, locationCode, vehicleType, regNumber, dailyRate,
                    customerName, licenseNumber, customerContact,
                    rentalDate, returnDate, rentalDays,
                    rentalCharge, penaltyCharge,
                    paymentMode, transactionId
            );

            System.out.println("\n--- Rental Record ---");
            System.out.println("Company: " + record.getCompanyName());
            System.out.println("Branch: " + record.getBranchName() + " | Code: " + record.getLocationCode());
            System.out.println("Vehicle: " + record.getVehicleType() + " | Reg#: " + record.getRegistrationNumber());
            System.out.println("Customer: " + record.getCustomerName() + " | License: " + record.getLicenseNumber());
            System.out.println("Rental Days: " + record.getRentalDays());
            System.out.println("Rental Charge: " + record.getRentalCharge());
            System.out.println("Penalty Charge: " + record.getPenaltyCharge());
            System.out.println("Total Charge: " + record.calculateTotalCharge());
            System.out.println("Payment Mode: " + record.getPaymentMode());
            System.out.println("Transaction ID: " + record.getTransactionId());

        } catch (RentalDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
