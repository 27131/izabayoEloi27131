package id27131.q8;

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

            System.out.print("Enter Library Name: ");
            String libraryName = sc.nextLine();

            System.out.print("Enter Library Location: ");
            String location = sc.nextLine();

            System.out.print("Enter Library Phone (10 digits): ");
            String phoneNumber = sc.nextLine();

            System.out.print("Enter Section Name: ");
            String sectionName = sc.nextLine();

            System.out.print("Enter Section Code: ");
            String sectionCode = sc.nextLine();

            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Book Author: ");
            String author = sc.nextLine();

            System.out.print("Enter Book ISBN (≥10 chars): ");
            String ISBN = sc.nextLine();

            System.out.print("Enter Member Name: ");
            String memberName = sc.nextLine();

            System.out.print("Enter Member ID: ");
            int memberId = sc.nextInt(); sc.nextLine();

            System.out.print("Enter Member Contact (10 digits): ");
            String contactNumber = sc.nextLine();

            System.out.print("Enter Borrow Date: ");
            String borrowDate = sc.nextLine();

            System.out.print("Enter Return Date: ");
            String returnDate = sc.nextLine();

            System.out.print("Enter Fine Amount: ");
            double fineAmount = sc.nextDouble();

            System.out.print("Enter Days Late: ");
            int daysLate = sc.nextInt(); sc.nextLine();

            System.out.print("Enter Payment Date: ");
            String paymentDate = sc.nextLine();

            System.out.print("Enter Payment Mode: ");
            String paymentMode = sc.nextLine();

            LibraryRecord record = new LibraryRecord(
                id, createdDate, updatedDate, libraryName, location, phoneNumber,
                sectionName, sectionCode, title, author, ISBN,
                memberName, memberId, contactNumber,
                borrowDate, returnDate, fineAmount, daysLate,
                paymentDate, paymentMode
            );

            System.out.println("\n--- Library Record ---");
            System.out.println("Library: " + libraryName + " | Location: " + location + " | Phone: " + phoneNumber);
            System.out.println("Section: " + sectionName + " | Code: " + sectionCode);
            System.out.println("Book: " + title + " by " + author + " | ISBN: " + ISBN);
            System.out.println("Member: " + memberName + " | ID: " + memberId + " | Contact: " + contactNumber);
            System.out.println("Borrow Date: " + borrowDate + " | Return Date: " + returnDate);
            System.out.println("Fine: " + fineAmount + " | Days Late: " + daysLate);
            System.out.println("Total Fine: " + record.getTotalFine());
            System.out.println("Payment: " + paymentMode + " on " + paymentDate);

        } catch (LibraryDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
