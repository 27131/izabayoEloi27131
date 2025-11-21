package id27131.q3;

import java.util.Scanner;

public final class PayrollRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Company company = null;
        Department department = null;
        Manager manager = null;
        Employee employee = null;
        Attendance attendance = null;
        Allowance allowance = null;
        Deduction deduction = null;
        Salary salary = null;

        // ===== Company =====
        while (company == null) {
            try {
                System.out.print("Company Name: ");
                String name = sc.nextLine();
                System.out.print("Address: ");
                String address = sc.nextLine();
                System.out.print("Phone (10 digits): ");
                String phone = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();

                company = new Company(name, address, phone, email);
            } catch (PayrollDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Department =====
        while (department == null) {
            try {
                System.out.print("Department Name: ");
                String dName = sc.nextLine();
                System.out.print("Department Code: ");
                String dCode = sc.nextLine();

                department = new Department(dName, dCode);
            } catch (PayrollDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Manager =====
        while (manager == null) {
            try {
                System.out.print("Manager Name: ");
                String mName = sc.nextLine();
                System.out.print("Manager Email: ");
                String mEmail = sc.nextLine();
                System.out.print("Manager Phone (10 digits): ");
                String mPhone = sc.nextLine();

                manager = new Manager(mName, mEmail, mPhone);
            } catch (PayrollDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Employee =====
        while (employee == null) {
            try {
                System.out.print("Employee Name: ");
                String eName = sc.nextLine();
                System.out.print("Employee ID: ");
                int eId = Integer.parseInt(sc.nextLine());
                System.out.print("Designation: ");
                String desig = sc.nextLine();
                System.out.print("Contact Number (10 digits): ");
                String contact = sc.nextLine();

                employee = new Employee(eName, eId, desig, contact);
            } catch (PayrollDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Employee ID must be a number");
            }
        }

        // ===== Attendance =====
        while (attendance == null) {
            try {
                System.out.print("Total Days: ");
                int total = Integer.parseInt(sc.nextLine());
                System.out.print("Present Days: ");
                int present = Integer.parseInt(sc.nextLine());
                System.out.print("Leave Days: ");
                int leave = Integer.parseInt(sc.nextLine());

                attendance = new Attendance(total, present, leave);
            } catch (PayrollDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Days must be numbers");
            }
        }

        // ===== Allowance =====
        while (allowance == null) {
            try {
                System.out.print("Housing Allowance: ");
                double house = Double.parseDouble(sc.nextLine());
                System.out.print("Transport Allowance: ");
                double trans = Double.parseDouble(sc.nextLine());

                allowance = new Allowance(house, trans);
            } catch (PayrollDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Allowance must be numbers");
            }
        }

        // ===== Deduction =====
        while (deduction == null) {
            try {
                System.out.print("Tax Deduction: ");
                double tax = Double.parseDouble(sc.nextLine());
                System.out.print("Loan Deduction: ");
                double loan = Double.parseDouble(sc.nextLine());

                deduction = new Deduction(tax, loan);
            } catch (PayrollDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Deductions must be numbers");
            }
        }

        // ===== Salary =====
        while (salary == null) {
            try {
                System.out.print("Basic Salary: ");
                double basic = Double.parseDouble(sc.nextLine());
                salary = new Salary(basic);
                salary.calculateNetSalary(allowance, deduction);
            } catch (PayrollDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Salary must be a number");
            }
        }

        // ===== Display =====
        System.out.println("\n=== Payroll Record ===");
        System.out.println("Work done by Eloi id:27131");
        System.out.println("Employee: " + employee.getEmployeeName() + " | ID: " + employee.getEmployeeId());
        System.out.println("Basic Salary: " + salary.getBasicSalary());
        System.out.println("Gross Salary: " + salary.getGrossSalary());
        System.out.println("Net Salary: " + salary.getNetSalary());
    }
}
