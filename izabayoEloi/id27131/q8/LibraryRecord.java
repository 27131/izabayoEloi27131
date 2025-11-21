package id27131.q8;

import java.util.Scanner;

public final class LibraryRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library library = null;
        Section section = null;
        Book book = null;
        Member member = null;
        Borrow borrow = null;
        Fine fine = null;
        Payment payment = null;
        Record record = null;

        // ===== Library =====
        while (library == null) {
            try {
                System.out.print("Library Name: ");
                String libName = sc.nextLine();
                System.out.print("Location: ");
                String loc = sc.nextLine();
                System.out.print("Phone (10 digits): ");
                String phone = sc.nextLine();
                library = new Library(1, "2025-11-21", "2025-11-21", libName, loc, phone);
            } catch (LibraryDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Section =====
        while (section == null) {
            try {
                System.out.print("Section Name: ");
                String secName = sc.nextLine();
                System.out.print("Section Code (≥3 chars): ");
                String secCode = sc.nextLine();
                section = new Section(1, "2025-11-21", "2025-11-21", secName, secCode);
            } catch (LibraryDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Book =====
        while (book == null) {
            try {
                System.out.print("Book Title: ");
                String title = sc.nextLine();
                System.out.print("Author: ");
                String author = sc.nextLine();
                System.out.print("ISBN (≥10 chars): ");
                String isbn = sc.nextLine();
                book = new Book(1, "2025-11-21", "2025-11-21", title, author, isbn);
            } catch (LibraryDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Member =====
        while (member == null) {
            try {
                System.out.print("Member Name: ");
                String mName = sc.nextLine();
                System.out.print("Member ID (>0): ");
                int mId = Integer.parseInt(sc.nextLine());
                System.out.print("Contact Number (10 digits): ");
                String contact = sc.nextLine();
                member = new Member(1, "2025-11-21", "2025-11-21", mName, mId, contact);
            } catch (LibraryDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Member ID must be a number");
            }
        }

        // ===== Borrow =====
        while (borrow == null) {
            try {
                System.out.print("Borrow Date: ");
                String bDate = sc.nextLine();
                System.out.print("Return Date: ");
                String rDate = sc.nextLine();
                borrow = new Borrow(1, "2025-11-21", "2025-11-21", bDate, rDate);
            } catch (LibraryDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Fine =====
        while (fine == null) {
            try {
                System.out.print("Fine Amount: ");
                double fAmount = Double.parseDouble(sc.nextLine());
                System.out.print("Days Late (>0): ");
                int daysLate = Integer.parseInt(sc.nextLine());
                fine = new Fine(1, "2025-11-21", "2025-11-21", fAmount, daysLate);
            } catch (LibraryDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Fine and days late must be numbers");
            }
        }

        // ===== Payment =====
        while (payment == null) {
            try {
                System.out.print("Payment Date: ");
                String pDate = sc.nextLine();
                System.out.print("Payment Mode: ");
                String pMode = sc.nextLine();
                payment = new Payment(1, "2025-11-21", "2025-11-21", pDate, pMode);
            } catch (LibraryDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Record =====
        while (record == null) {
            try {
                record = new Record(1, "2025-11-21", "2025-11-21", fine.calculateFine());
            } catch (LibraryDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Display =====
        System.out.println("\n=== Library Record ===");
        System.out.println("Work done by Eloi id:27131");
        System.out.println("Library: " + library.getLibraryName() + " | Location: " + library.getLocation());
        System.out.println("Section: " + section.getSectionName() + " | Code: " + section.getSectionCode());
        System.out.println("Book: " + book.getTitle() + " | Author: " + book.getAuthor() + " | ISBN: " + book.getISBN());
        System.out.println("Member: " + member.getMemberName() + " | ID: " + member.getMemberId() + " | Contact: " + member.getContactNumber());
        System.out.println("Borrow: " + borrow.getBorrowDate() + " -> " + borrow.getReturnDate());
        System.out.println("Fine: " + fine.getFineAmount() + " x " + fine.getDaysLate() + " = " + fine.calculateFine());
        System.out.println("Payment: " + payment.getPaymentDate() + " | Mode: " + payment.getPaymentMode());
        System.out.println("Total Fine: " + record.getTotalFine());
    }
}
