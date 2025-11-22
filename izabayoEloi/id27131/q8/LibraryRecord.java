package id27131.q8;

import java.util.Scanner;

public final class LibraryRecord {
    public static void main(String[] args) throws LibraryException {
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
            }
        }

        // --- Library ---
        Library library = null;
        while (library == null) {
            try {
                System.out.print("Library Name: ");
                String libraryName = sc.nextLine();
                System.out.print("Library Location: ");
                String libraryLocation = sc.nextLine();
                System.out.print("Library Phone (10 digits): ");
                String libraryPhone = sc.nextLine();

                library = new Library(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        libraryName, libraryLocation, libraryPhone);
            } catch (LibraryException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Section ---
        Section section = null;
        while (section == null) {
            try {
                System.out.print("Section Name: ");
                String sectionName = sc.nextLine();
                System.out.print("Section Code (≥3 chars): ");
                String sectionCode = sc.nextLine();

                section = new Section(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        sectionName, sectionCode);
            } catch (LibraryException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Book ---
        Book book = null;
        while (book == null) {
            try {
                System.out.print("Book Title: ");
                String title = sc.nextLine();
                System.out.print("Author: ");
                String author = sc.nextLine();
                System.out.print("ISBN (≥10 chars): ");
                String isbn = sc.nextLine();

                book = new Book(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        title, author, isbn);
            } catch (LibraryException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Member ---
        Member member = null;
        while (member == null) {
            try {
                System.out.print("Member Name: ");
                String memberName = sc.nextLine();
                System.out.print("Member ID (>0): ");
                int memberId = Integer.parseInt(sc.nextLine());
                System.out.print("Contact Number (10 digits): ");
                String memberContact = sc.nextLine();

                member = new Member(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        memberName, memberId, memberContact);
            } catch (NumberFormatException e) {
                System.out.println("Member ID must be a number. Try again.");
            } catch (LibraryException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Borrow ---
        Borrow borrow = null;
        while (borrow == null) {
            try {
                System.out.print("Borrow Date: ");
                String borrowDate = sc.nextLine();
                System.out.print("Return Date: ");
                String returnDate = sc.nextLine();

                borrow = new Borrow(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        borrowDate, returnDate);
            } catch (LibraryException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Fine ---
        Fine fine = null;
        while (fine == null) {
            try {
                System.out.print("Fine Amount (≥0): ");
                double fineAmount = Double.parseDouble(sc.nextLine());
                System.out.print("Days Late (≥0): ");
                int daysLate = Integer.parseInt(sc.nextLine());

                fine = new Fine(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        fineAmount, daysLate);
            } catch (NumberFormatException e) {
                System.out.println("Enter valid numbers for fine and days late.");
            } catch (LibraryException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Payment ---
        Payment payment = null;
        while (payment == null) {
            try {
                System.out.print("Payment Date: ");
                String paymentDate = sc.nextLine();
                System.out.print("Payment Mode: ");
                String paymentMode = sc.nextLine();

                payment = new Payment(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        paymentDate, paymentMode);
            } catch (LibraryException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Record ---
        Record record = new Record(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                fine.calculateFine());

        // --- Display Library Record ---
        System.out.println("\n=== Final Library Record ===");
        System.out.println("\nEntity Details");
        System.out.println("ID: " + entity.getId());
        System.out.println("Created Date: " + entity.getCreatedDate());
        System.out.println("Updated Date: " + entity.getUpdatedDate());

        System.out.println("\nLibrary Details");
        System.out.println("Library Name: " + library.getLibraryName());
        System.out.println("Location: " + library.getLocation());
        System.out.println("Phone: " + library.getPhoneNumber());

        System.out.println("\nSection Details");
        System.out.println("Section Name: " + section.getSectionName());
        System.out.println("Section Code: " + section.getSectionCode());

        System.out.println("\nBook Details");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getISBN());

        System.out.println("\nMember Details");
        System.out.println("Member Name: " + member.getMemberName());
        System.out.println("Member ID: " + member.getMemberId());
        System.out.println("Contact: " + member.getContactNumber());

        System.out.println("\nBorrow Details");
        System.out.println("Borrow Date: " + borrow.getBorrowDate());
        System.out.println("Return Date: " + borrow.getReturnDate());

        System.out.println("\nFine Details");
        System.out.println("Fine Amount: " + fine.getFineAmount());
        System.out.println("Days Late: " + fine.getDaysLate());
        System.out.println("Total Fine: " + record.getTotalFine());

        System.out.println("\nPayment Details");
        System.out.println("Payment Date: " + payment.getPaymentDate());
        System.out.println("Payment Mode: " + payment.getPaymentMode());
    }
}
