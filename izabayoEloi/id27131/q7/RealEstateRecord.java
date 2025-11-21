package id27131.q7;

import java.util.Scanner;

public final class RealEstateRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agency agency = null;
        Agent agent = null;
        Property property = null;
        Seller seller = null;
        Buyer buyer = null;
        Agreement agreement = null;
        Payment payment = null;
        Commission commission = null;

        // ===== Agency =====
        while (agency == null) {
            try {
                System.out.print("Agency Name: ");
                String name = sc.nextLine();
                System.out.print("Location: ");
                String loc = sc.nextLine();
                System.out.print("Phone (10 digits): ");
                String phone = sc.nextLine();
                agency = new Agency(1, "2025-11-21", "2025-11-21", name, loc, phone);
            } catch (RealEstateDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Agent =====
        while (agent == null) {
            try {
                System.out.print("Agent Name: ");
                String aName = sc.nextLine();
                System.out.print("Agent Email: ");
                String email = sc.nextLine();
                System.out.print("License Number: ");
                String license = sc.nextLine();
                agent = new Agent(1, "2025-11-21", "2025-11-21", aName, email, license);
            } catch (RealEstateDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Property =====
        while (property == null) {
            try {
                System.out.print("Property Code: ");
                String code = sc.nextLine();
                System.out.print("Property Type: ");
                String type = sc.nextLine();
                System.out.print("Price: ");
                double price = Double.parseDouble(sc.nextLine());
                property = new Property(1, "2025-11-21", "2025-11-21", code, type, price);
            } catch (RealEstateDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Price must be a number");
            }
        }

        // ===== Seller =====
        while (seller == null) {
            try {
                System.out.print("Seller Name: ");
                String sName = sc.nextLine();
                System.out.print("Contact Number (10 digits): ");
                String contact = sc.nextLine();
                seller = new Seller(1, "2025-11-21", "2025-11-21", sName, contact);
            } catch (RealEstateDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Buyer =====
        while (buyer == null) {
            try {
                System.out.print("Buyer Name: ");
                String bName = sc.nextLine();
                System.out.print("Buyer Email: ");
                String email = sc.nextLine();
                buyer = new Buyer(1, "2025-11-21", "2025-11-21", bName, email);
            } catch (RealEstateDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Agreement =====
        while (agreement == null) {
            try {
                System.out.print("Agreement Date: ");
                String aDate = sc.nextLine();
                System.out.print("Terms: ");
                String terms = sc.nextLine();
                agreement = new Agreement(1, "2025-11-21", "2025-11-21", aDate, terms);
            } catch (RealEstateDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Payment =====
        while (payment == null) {
            try {
                System.out.print("Payment Amount: ");
                double pAmount = Double.parseDouble(sc.nextLine());
                System.out.print("Payment Date: ");
                String pDate = sc.nextLine();
                payment = new Payment(1, "2025-11-21", "2025-11-21", pAmount, pDate);
            } catch (RealEstateDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Payment amount must be a number");
            }
        }

        // ===== Commission =====
        while (commission == null) {
            try {
                System.out.print("Commission Rate (%): ");
                double rate = Double.parseDouble(sc.nextLine());
                commission = new Commission(1, "2025-11-21", "2025-11-21", property.getPrice(), rate);
            } catch (RealEstateDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Rate must be a number");
            }
        }

        // ===== Display =====
        System.out.println("\n=== Real Estate Record ===");
        System.out.println("Work done by Eloi id:27131");
        System.out.println("Agency: " + agency.getAgencyName());
        System.out.println("Agent: " + agent.getAgentName() + " | License: " + agent.getLicenseNumber());
        System.out.println("Property: " + property.getPropertyCode() + " | Type: " + property.getPropertyType() + " | Price: " + property.getPrice());
        System.out.println("Seller: " + seller.getSellerName() + " | Contact: " + seller.getContactNumber());
        System.out.println("Buyer: " + buyer.getBuyerName() + " | Email: " + buyer.getEmail());
        System.out.println("Agreement Date: " + agreement.getAgreementDate() + " | Terms: " + agreement.getTerms());
        System.out.println("Payment: " + payment.getPaymentAmount() + " | Date: " + payment.getPaymentDate());
        System.out.println("Commission: " + commission.getCommissionAmount() + " (" + commission.getCommissionRate() + "%)");
    }
}
