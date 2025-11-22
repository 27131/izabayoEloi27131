package id27131.q10;

import java.util.Scanner;

public final class OrderRecord {
    public static void main(String[] args) throws OrderDataException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWork done by Eloi, id:27131\n");

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
            } catch (OrderDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Store ---
        Store store = null;
        while (store == null) {
            try {
                System.out.print("Store Name: ");
                String name = sc.nextLine();
                System.out.print("Address: ");
                String address = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();

                store = new Store(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        name, address, email);
            } catch (OrderDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Category ---
        Category category = null;
        while (category == null) {
            try {
                System.out.print("Category Name: ");
                String name = sc.nextLine();
                System.out.print("Category Code: ");
                String code = sc.nextLine();

                category = new Category(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        name, code);
            } catch (OrderDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Product ---
        Product product = null;
        while (product == null) {
            try {
                System.out.print("Product Name: ");
                String name = sc.nextLine();
                System.out.print("Product Code: ");
                String code = sc.nextLine();
                System.out.print("Price (>0): ");
                double price = Double.parseDouble(sc.nextLine());

                product = new Product(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        name, code, price);
            } catch (NumberFormatException e) {
                System.out.println("Price must be a number. Try again.");
            } catch (OrderDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Customer ---
        Customer customer = null;
        while (customer == null) {
            try {
                System.out.print("Customer Name: ");
                String name = sc.nextLine();
                System.out.print("Contact Number: ");
                String contact = sc.nextLine();
                System.out.print("Address: ");
                String address = sc.nextLine();

                customer = new Customer(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        name, contact, address);
            } catch (OrderDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Order ---
        Order order = null;
        while (order == null) {
            try {
                System.out.print("Order Date: ");
                String date = sc.nextLine();
                System.out.print("Order ID: ");
                String idStr = sc.nextLine();

                order = new Order(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        date, idStr);
            } catch (OrderDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Payment ---
        Payment payment = null;
        while (payment == null) {
            try {
                System.out.print("Payment Method: ");
                String method = sc.nextLine();
                System.out.print("Payment Status: ");
                String status = sc.nextLine();

                payment = new Payment(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        method, status);
            } catch (OrderDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Shipping ---
        Shipping shipping = null;
        while (shipping == null) {
            try {
                System.out.print("Shipping Address: ");
                String address = sc.nextLine();
                System.out.print("Shipping Cost (>0): ");
                double cost = Double.parseDouble(sc.nextLine());

                shipping = new Shipping(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        address, cost);
            } catch (NumberFormatException e) {
                System.out.println("Shipping cost must be a number. Try again.");
            } catch (OrderDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Invoice ---
        Invoice invoice = null;
        while (invoice == null) {
            try {
                double totalAmount = product.getPrice() + shipping.getShippingCost();
                invoice = new Invoice(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        totalAmount);
            } catch (OrderDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Display Order Record ---
        System.out.println("\n=== Order Record ===");
        System.out.println("Work done by Eloi, id:27131");

        System.out.println("\nStore Details");
        System.out.println("Name: " + store.getStoreName());
        System.out.println("Address: " + store.getAddress());
        System.out.println("Email: " + store.getEmail());

        System.out.println("\nCategory Details");
        System.out.println("Name: " + category.getCategoryName());
        System.out.println("Code: " + category.getCategoryCode());

        System.out.println("\nProduct Details");
        System.out.println("Name: " + product.getProductName());
        System.out.println("Code: " + product.getProductCode());
        System.out.println("Price: " + product.getPrice());

        System.out.println("\nCustomer Details");
        System.out.println("Name: " + customer.getCustomerName());
        System.out.println("Contact: " + customer.getContactNumber());
        System.out.println("Address: " + customer.getAddress());

        System.out.println("\nOrder Details");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Order Date: " + order.getOrderDate());

        System.out.println("\nPayment Details");
        System.out.println("Method: " + payment.getPaymentMethod());
        System.out.println("Status: " + payment.getPaymentStatus());

        System.out.println("\nShipping Details");
        System.out.println("Address: " + shipping.getShippingAddress());
        System.out.println("Cost: " + shipping.getShippingCost());

        System.out.println("\nInvoice Details");
        System.out.println("Total Amount: " + invoice.getTotalAmount());
    }
}
