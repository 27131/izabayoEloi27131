package id27131.q7;

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

            System.out.print("Enter Agency Name: ");
            String agencyName = sc.nextLine();

            System.out.print("Enter Agency Location: ");
            String location = sc.nextLine();

            System.out.print("Enter Agency Phone (10 digits): ");
            String phoneNumber = sc.nextLine();

            System.out.print("Enter Agent Name: ");
            String agentName = sc.nextLine();

            System.out.print("Enter Agent Email: ");
            String agentEmail = sc.nextLine();

            System.out.print("Enter Agent License Number: ");
            String licenseNumber = sc.nextLine();

            System.out.print("Enter Property Code: ");
            String propertyCode = sc.nextLine();

            System.out.print("Enter Property Type: ");
            String propertyType = sc.nextLine();

            System.out.print("Enter Property Price: ");
            double price = sc.nextDouble(); sc.nextLine();

            System.out.print("Enter Seller Name: ");
            String sellerName = sc.nextLine();

            System.out.print("Enter Seller Contact (10 digits): ");
            String sellerContact = sc.nextLine();

            System.out.print("Enter Buyer Name: ");
            String buyerName = sc.nextLine();

            System.out.print("Enter Buyer Email: ");
            String buyerEmail = sc.nextLine();

            System.out.print("Enter Agreement Date: ");
            String agreementDate = sc.nextLine();

            System.out.print("Enter Agreement Terms: ");
            String terms = sc.nextLine();

            System.out.print("Enter Payment Amount: ");
            double paymentAmount = sc.nextDouble(); sc.nextLine();

            System.out.print("Enter Payment Date: ");
            String paymentDate = sc.nextLine();

            System.out.print("Enter Commission Rate (%): ");
            double commissionRate = sc.nextDouble();

            RealEstateRecord record = new RealEstateRecord(
                id, createdDate, updatedDate, agencyName, location, phoneNumber,
                agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price,
                sellerName, sellerContact, buyerName, buyerEmail,
                agreementDate, terms, paymentAmount, paymentDate, commissionRate
            );

            System.out.println("\n--- Real Estate Record ---");
            System.out.println("Agency: " + agencyName + " | Location: " + location + " | Phone: " + phoneNumber);
            System.out.println("Agent: " + agentName + " | Email: " + agentEmail + " | License: " + licenseNumber);
            System.out.println("Property: " + propertyCode + " | Type: " + propertyType + " | Price: " + price);
            System.out.println("Seller: " + sellerName + " | Contact: " + sellerContact);
            System.out.println("Buyer: " + buyerName + " | Email: " + buyerEmail);
            System.out.println("Agreement Date: " + agreementDate + " | Terms: " + terms);
            System.out.println("Payment: " + paymentAmount + " on " + paymentDate);
            System.out.println("Commission (" + commissionRate + "%): " + record.getCommissionAmount());

        } catch (RealEstateDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
