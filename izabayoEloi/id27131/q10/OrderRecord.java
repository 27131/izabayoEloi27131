package id27131.q10;

import java.util.Scanner;

public final class OrderRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Store store = null;
        Category category = null;
        Product product = null;
        Customer customer = null;
        Order order = null;
        Payment payment = null;
        Shipping shipping = null;
        Invoice invoice = null;

        // ===== Store =====
        while (store == null) {
            try {
                System.out.print("Store Name: ");
                String sName = sc.nextLine();
                System.out.print("Address: ");
                String addr = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                store = new Store(1, "2025-11-21", "2025-11-21", sName, addr, email);
            } catch (OrderDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Category =====
        while (category == null) {
            try {
                System.out.print("Category Name: ");
                String cName = sc.nextLine();
                System.out.print("Category Code: ");
                String cCode = sc.nextLine();
                category = new Category(1, "2025-11-21", "2025-11-21", cName, cCode);
            } catch (OrderDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Product =====
        while (product == null) {
            try {
                System.out.print("Product Name: ");
                String pName = sc.nextLine();
                System.out.print("Product Code: ");
                String pCode = sc.nextLine();
                System.out.print("Price: ");
                double price = Double.parseDouble(sc.nextLine());
                product = new Product(1, "2025-11-21", "2025-11-21", pName, pCode, price);
            } catch (OrderDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Price must be a number");
            }
        }

        // ===== Customer =====
        while (customer == null) {
            try {
                System.out.print("Customer Name: ");
                String cName = sc.nextLine();
                System.out.print("Contact Number: ");
                String cContact = sc.nextLine();
                System.out.print("Address: ");
                String cAddr = sc.nextLine();
                customer = new Customer(1, "2025-11-21", "2025-11-21", cName, cContact, cAddr);
            } catch (OrderDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Order =====
        while (order == null) {
            try {
                System.out.print("Order Date: ");
                String oDate = sc.nextLine();
                System.out.print("Order ID: ");
                String oId = sc.nextLine();
                order = new Order(1, "2025-11-21", "2025-11-21", oDate, oId);
            } catch (OrderDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Payment =====
        while (payment == null) {
            try {
                System.out.print("Payment Method: ");
                String pMethod = sc.nextLine();
                System.out.print("Payment Status: ");
                String pStatus = sc.nextLine();
                payment = new Payment(1, "2025-11-21", "2025-11-21", pMethod, pStatus);
            } catch (OrderDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Shipping =====
        while (shipping == null) {
            try {
                System.out.print("Shipping Address: ");
                String shAddr = sc.nextLine();
                System.out.print("Shipping Cost: ");
                double shCost = Double.parseDouble(sc.nextLine());
                shipping = new Shipping(1, "2025-11-21", "2025-11-21", shAddr, shCost);
            } catch (OrderDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Shipping cost must be a number");
            }
        }

        // ===== Invoice =====
        while (invoice == null) {
            try {
                invoice = new Invoice(1, "2025-11-21", "2025-11-21", product.getPrice() + shipping.getShippingCost());
            } catch (OrderDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Display =====
        System.out.println("\n=== Order Record ===");
        System.out.println("Store: " + store.getStoreName() + " | Email: " + store.getEmail());
        System.out.println("Category: " + category.getCategoryName() + " | Code: " + category.getCategoryCode());
        System.out.println("Product: " + product.getProductName() + " | Price: " + product.getPrice());
        System.out.println("Customer: " + customer.getCustomerName() + " | Contact: " + customer.getContactNumber());
        System.out.println("Order: " + order.getOrderId() + " | Date: " + order.getOrderDate());
        System.out.println("Payment: " + payment.getPaymentMethod() + " | Status: " + payment.getPaymentStatus());
        System.out.println("Shipping: " + shipping.getShippingAddress() + " | Cost: " + shipping.getShippingCost());
        System.out.println("Total Amount: " + invoice.getTotalAmount());
    }
}
