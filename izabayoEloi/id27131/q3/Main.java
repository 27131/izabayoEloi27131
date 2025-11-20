package id27131.q3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter ID (positive integer): ");
            int id = sc.nextInt(); sc.nextLine();

            System.out.print("Enter created date (e.g. 2025-11-20): ");
            String createdDate = sc.nextLine();

            System.out.print("Enter updated date (e.g. 2025-11-20): ");
            String updatedDate = sc.nextLine();

            System.out.print("Enter Company Name: ");
            String companyName = sc.nextLine();

            System.out.print("Enter Company Address: ");
            String companyAddress = sc.nextLine();

            System.out.print("Enter Company Phone (10 digits): ");
            String companyPhone = sc.nextLine();

            System.out.print("Enter Company Email: ");
            String companyEmail = sc.nextLine();

            System.out.print("Enter Department Name: ");
            String deptName = sc.nextLine();

            System.out.print("Enter Department Code (alphanumeric, >=3): ");
            String deptCode = sc.nextLine();

            System.out.print("Enter Manager Name: ");
            String managerName = sc.nextLine();

            System.out.print("Enter Manager Email: ");
            String managerEmail = sc.nextLine();

            System.out.print("Enter Manager Phone (10 digits): ");
            String managerPhone = sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String employeeName = sc.nextLine();

            System.out.print("Enter Employee ID (positive integer): ");
            int employeeId = sc.nextInt(); sc.nextLine();

            System.out.print("Enter Designation: ");
            String designation = sc.nextLine();

            System.out.print("Enter Employee Contact Number (10 digits): ");
            String employeeContact = sc.nextLine();

            System.out.print("Enter Total Days (>=0): ");
            int totalDays = sc.nextInt();

            System.out.print("Enter Present Days (>=0 and <= totalDays): ");
            int presentDays = sc.nextInt();

            System.out.print("Enter Leave Days (>=0): ");
            int leaveDays = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Housing Allowance (>=0): ");
            double housingAllowance = sc.nextDouble();

            System.out.print("Enter Transport Allowance (>=0): ");
            double transportAllowance = sc.nextDouble();

            System.out.print("Enter Tax Deduction (>=0): ");
            double taxDeduction = sc.nextDouble();

            System.out.print("Enter Loan Deduction (>=0): ");
            double loanDeduction = sc.nextDouble();

            System.out.print("Enter Basic Salary (>0): ");
            double basicSalary = sc.nextDouble();

            PayrollRecord record = new PayrollRecord(
                    id, createdDate, updatedDate,
                    companyName, companyAddress, companyPhone, companyEmail,
                    deptName, deptCode,
                    managerName, managerEmail, managerPhone,
                    employeeName, employeeId, designation, employeeContact,
                    totalDays, presentDays, leaveDays,
                    housingAllowance, transportAllowance,
                    taxDeduction, loanDeduction,
                    basicSalary
            );

            record.generatePayroll();

        } catch (PayrollDataException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input error: please enter data in the correct format.");
        } finally {
            sc.close();
        }
    }
}
