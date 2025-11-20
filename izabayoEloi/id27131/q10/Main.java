package id27131.q10;

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

            System.out.print("Enter Store Name: ");
            String storeName = sc.nextLine();

            System.out.print("Enter Store Address: ");
            String storeAddress = sc.nextLine();

            System.out.print("Enter Store Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Category Name: ");
            String categoryName = sc.nextLine();

            System.out.print("Enter Category Code: ");
            String categoryCode = sc.nextLine();

            System.out.print("Enter Product Name: ");
            String productName = sc.nextLine();

            System.out.print("Enter Product Code: ");
            String productCode = sc.nextLine();

            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble(); sc.nextLine();

            System.out.print("Enter Customer Name: ");
            String customerName = sc.nextLine();

            System.out.print("Enter Customer Contact Number: ");
            String contactNumber = sc.nextLine();

            System.out.print("Enter Customer Address: ");
            String customerAddress = sc.nextLine();

            System.out.print("Enter Order Date: ");
            String orderDate = sc.nextLine();

            System.out.print("Enter Order ID: ");
            String orderId = sc.nextLine();

            System.out.print("Enter Payment Method: ");
            String paymentMethod = sc.nextLine();

            System.out.print("Enter Payment Status: ");
            String paymentStatus = sc.nextLine();

            System.out.print("Enter Shipping Address: ");
            String shippingAddress = sc.nextLine();

            System.out.print("Enter Shipping Cost: ");
            double shippingCost = sc.nextDouble(); sc.nextLine();

            OrderRecord record = new OrderRecord(
                id, createdDate, updatedDate, storeName, storeAddress, email,
                categoryName, categoryCode, productName, productCode, price,
                customerName, contactNumber, customerAddress,
                orderDate, orderId, paymentMethod, paymentStatus,
                shippingAddress, shippingCost
            );

            System.out.println("\n--- Online Shopping Record ---");
            System.out.println("Store: " + storeName + " | Email: " + email);
            System.out.println("Category: " + categoryName + " | Code: " + categoryCode);
            System.out.println("Product: " + productName + " | Code: " + productCode + " | Price: " + price);
            System.out.println("Customer: " + customerName + " | Contact: " + contactNumber + " | Address: " + customerAddress);
            System.out.println("Order: " + orderId + " | Date: " + orderDate);
            System.out.println("Payment: " + paymentMethod + " | Status: " + paymentStatus);
            System.out.println("Shipping: " + shippingAddress + " | Cost: " + shippingCost);
            System.out.println("Total Amount: " + record.getTotalAmount());

        } catch (OnlineShoppingDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
