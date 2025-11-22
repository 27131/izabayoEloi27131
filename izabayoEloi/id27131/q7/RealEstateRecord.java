package id27131.q7;

import java.util.Scanner;

public final class RealEstateRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWork done by Eloi id:27131\n");

        // --- ENTITY input ---
        Entity entity = null;
        while(entity == null){
            try{
                System.out.print("Enter ID (>0): ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.print("Enter Created Date: ");
                String createdDate = sc.nextLine();
                System.out.print("Enter Updated Date: ");
                String updatedDate = sc.nextLine();

                entity = new Entity(id, createdDate, updatedDate);
            } catch(NumberFormatException e){
                System.out.println("ID must be a number");
            } catch(RealEstateDataException e){
                System.out.println(e.getMessage());
            }
        }

        // --- AGENCY input ---
        Agency agency = null;
        while(agency == null){
            try{
                System.out.print("Agency Name: ");
                String agencyName = sc.nextLine();
                System.out.print("Location: ");
                String location = sc.nextLine();
                System.out.print("Agency Phone (10 digits): ");
                String agencyPhone = sc.nextLine();

                agency = new Agency(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        agencyName, location, agencyPhone);
            } catch(RealEstateDataException e){
                System.out.println(e.getMessage());
            }
        }

        // --- AGENT input ---
        Agent agent = null;
        while(agent == null){
            try{
                System.out.print("Agent Name: ");
                String agentName = sc.nextLine();
                System.out.print("Agent Email: ");
                String agentEmail = sc.nextLine();
                System.out.print("License Number: ");
                String license = sc.nextLine();

                agent = new Agent(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        agency.getAgencyName(), agency.getLocation(), agency.getPhoneNumber(),
                        agentName, agentEmail, license);
            } catch(RealEstateDataException e){
                System.out.println(e.getMessage());
            }
        }

        // --- PROPERTY input ---
        Property property = null;
        while(property == null){
            try{
                System.out.print("Property Code: ");
                String propCode = sc.nextLine();
                System.out.print("Property Type: ");
                String propType = sc.nextLine();
                System.out.print("Price (>0): ");
                double price = Double.parseDouble(sc.nextLine());

                property = new Property(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        agency.getAgencyName(), agency.getLocation(), agency.getPhoneNumber(),
                        agent.getAgentName(), agent.getEmail(), agent.getLicenseNumber(),
                        propCode, propType, price);
            } catch(NumberFormatException e){
                System.out.println("Price must be a number");
            } catch(RealEstateDataException e){
                System.out.println(e.getMessage());
            }
        }

        // --- SELLER input ---
        Seller seller = null;
        while(seller == null){
            try{
                System.out.print("Seller Name: ");
                String sellerName = sc.nextLine();
                System.out.print("Seller Contact Number: ");
                String sellerContact = sc.nextLine();

                seller = new Seller(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        agency.getAgencyName(), agency.getLocation(), agency.getPhoneNumber(),
                        agent.getAgentName(), agent.getEmail(), agent.getLicenseNumber(),
                        property.getPropertyCode(), property.getPropertyType(), property.getPrice(),
                        sellerName, sellerContact);
            } catch(RealEstateDataException e){
                System.out.println(e.getMessage());
            }
        }

        // --- BUYER input ---
        Buyer buyer = null;
        while(buyer == null){
            try{
                System.out.print("Buyer Name: ");
                String buyerName = sc.nextLine();
                System.out.print("Buyer Email: ");
                String buyerEmail = sc.nextLine();

                buyer = new Buyer(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        agency.getAgencyName(), agency.getLocation(), agency.getPhoneNumber(),
                        agent.getAgentName(), agent.getEmail(), agent.getLicenseNumber(),
                        property.getPropertyCode(), property.getPropertyType(), property.getPrice(),
                        seller.getSellerName(), seller.getContactNumber(),
                        buyerName, buyerEmail);
            } catch(RealEstateDataException e){
                System.out.println(e.getMessage());
            }
        }

        // --- AGREEMENT input ---
        Agreement agreement = null;
        while(agreement == null){
            try{
                System.out.print("Agreement Date: ");
                String agreementDate = sc.nextLine();
                System.out.print("Agreement Terms: ");
                String terms = sc.nextLine();

                agreement = new Agreement(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        agency.getAgencyName(), agency.getLocation(), agency.getPhoneNumber(),
                        agent.getAgentName(), agent.getEmail(), agent.getLicenseNumber(),
                        property.getPropertyCode(), property.getPropertyType(), property.getPrice(),
                        seller.getSellerName(), seller.getContactNumber(),
                        buyer.getBuyerName(), buyer.getEmail(),
                        agreementDate, terms);
            } catch(RealEstateDataException e){
                System.out.println(e.getMessage());
            }
        }

        // --- PAYMENT input ---
        Payment payment = null;
        while(payment == null){
            try{
                System.out.print("Payment Amount (>0): ");
                double paymentAmount = Double.parseDouble(sc.nextLine());
                System.out.print("Payment Date: ");
                String paymentDate = sc.nextLine();

                payment = new Payment(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        agency.getAgencyName(), agency.getLocation(), agency.getPhoneNumber(),
                        agent.getAgentName(), agent.getEmail(), agent.getLicenseNumber(),
                        property.getPropertyCode(), property.getPropertyType(), property.getPrice(),
                        seller.getSellerName(), seller.getContactNumber(),
                        buyer.getBuyerName(), buyer.getEmail(),
                        agreement.getAgreementDate(), agreement.getTerms(),
                        paymentAmount, paymentDate);
            } catch(NumberFormatException e){
                System.out.println("Payment must be a number");
            } catch(RealEstateDataException e){
                System.out.println(e.getMessage());
            }
        }

        // --- COMMISSION input ---
        Commission commission = null;
        while(commission == null){
            try{
                System.out.print("Commission Rate (% >=0): ");
                double commissionRate = Double.parseDouble(sc.nextLine());

                commission = new Commission(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        agency.getAgencyName(), agency.getLocation(), agency.getPhoneNumber(),
                        agent.getAgentName(), agent.getEmail(), agent.getLicenseNumber(),
                        property.getPropertyCode(), property.getPropertyType(), property.getPrice(),
                        seller.getSellerName(), seller.getContactNumber(),
                        buyer.getBuyerName(), buyer.getEmail(),
                        agreement.getAgreementDate(), agreement.getTerms(),
                        payment.getPaymentAmount(), payment.getPaymentDate(),
                        commissionRate);
            } catch(NumberFormatException e){
                System.out.println("Commission rate must be a number");
            } catch(RealEstateDataException e){
                System.out.println(e.getMessage());
            }
        }

        // --- DISPLAY ---
        System.out.println("\n=== Real Estate Transaction Record ===");
        System.out.println("Entity ID: " + entity.getId() + ", Created: " + entity.getCreatedDate() + ", Updated: " + entity.getUpdatedDate());
        System.out.println("Agency: " + agency.getAgencyName() + ", Location: " + agency.getLocation() + ", Phone: " + agency.getPhoneNumber());
        System.out.println("Agent: " + agent.getAgentName() + ", Email: " + agent.getEmail() + ", License: " + agent.getLicenseNumber());
        System.out.println("Property: " + property.getPropertyCode() + ", Type: " + property.getPropertyType() + ", Price: " + property.getPrice());
        System.out.println("Seller: " + seller.getSellerName() + ", Contact: " + seller.getContactNumber());
        System.out.println("Buyer: " + buyer.getBuyerName() + ", Email: " + buyer.getEmail());
        System.out.println("Agreement Date: " + agreement.getAgreementDate() + ", Terms: " + agreement.getTerms());
        System.out.println("Payment Amount: " + payment.getPaymentAmount() + ", Date: " + payment.getPaymentDate());
        System.out.println("Commission Rate: " + commission.getCommissionRate() + "%, Amount: " + commission.getCommissionAmount());
    }
}
