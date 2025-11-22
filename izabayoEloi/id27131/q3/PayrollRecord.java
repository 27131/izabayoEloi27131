package id27131.q3;

import java.util.Scanner;

public final class PayrollRecord {
    public static void main(String[] args) throws PayrollException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWork done by Eloi id:27131\n");
        // --- Entity ---
        Entity entity = null;
        while (entity == null) {
            try {
                System.out.print("Enter ID: ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.print("Enter Created Date: ");
                String createdDate = sc.nextLine();
                System.out.print("Enter Updated Date: ");
                String updatedDate = sc.nextLine();

                entity = new Entity(id, createdDate, updatedDate);
            } catch (NumberFormatException e) {
                System.out.println("ID must be a number. Please try again.");
            } catch (PayrollException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Company ---
        Company company = null;
        while (company == null) {
            try {
                System.out.print("Company Name: ");
                String companyName = sc.nextLine();
                System.out.print("Company Address: ");
                String companyAddress = sc.nextLine();
                System.out.print("Company Phone (10 digits): ");
                String companyPhone = sc.nextLine();
                System.out.print("Company Email: ");
                String companyEmail = sc.nextLine();

                company = new Company(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                      companyName, companyAddress, companyPhone, companyEmail);
            } catch (PayrollException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Department ---
        Department department = null;
        while (department == null) {
            try {
                System.out.print("Department Name: ");
                String departmentName = sc.nextLine();
                System.out.print("Department Code (≥3 chars): ");
                String departmentCode = sc.nextLine();

                department = new Department(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                            company.getCompanyName(), company.getAddress(), company.getPhoneNumber(), company.getEmail(),
                                            departmentName, departmentCode);
            } catch (PayrollException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Manager ---
        Manager manager = null;
        while (manager == null) {
            try {
                System.out.print("Manager Name: ");
                String managerName = sc.nextLine();
                System.out.print("Manager Email: ");
                String managerEmail = sc.nextLine();
                System.out.print("Manager Phone (10 digits): ");
                String managerPhone = sc.nextLine();

                manager = new Manager(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                      company.getCompanyName(), company.getAddress(), company.getPhoneNumber(), company.getEmail(),
                                      department.getDepartmentName(), department.getDepartmentCode(),
                                      managerName, managerEmail, managerPhone);
            } catch (PayrollException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Employee ---
        Employee employee = null;
        while (employee == null) {
            try {
                System.out.print("Employee Name: ");
                String employeeName = sc.nextLine();
                System.out.print("Employee ID: ");
                int employeeId = Integer.parseInt(sc.nextLine());
                System.out.print("Designation: ");
                String designation = sc.nextLine();
                System.out.print("Contact Number (10 digits): ");
                String employeeContact = sc.nextLine();

                employee = new Employee(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                        company.getCompanyName(), company.getAddress(), company.getPhoneNumber(), company.getEmail(),
                                        department.getDepartmentName(), department.getDepartmentCode(),
                                        manager.getManagerName(), manager.getManagerEmail(), manager.getPhoneNumber(),
                                        employeeName, employeeId, designation, employeeContact);
            } catch (NumberFormatException e) {
                System.out.println("Employee ID must be a number. Please try again.");
            } catch (PayrollException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Attendance ---
        Attendance attendance = null;
        while (attendance == null) {
            try {
                System.out.print("Total Days: ");
                int totalDays = Integer.parseInt(sc.nextLine());
                System.out.print("Present Days: ");
                int presentDays = Integer.parseInt(sc.nextLine());
                System.out.print("Leave Days: ");
                int leaveDays = Integer.parseInt(sc.nextLine());

                attendance = new Attendance(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                            company.getCompanyName(), company.getAddress(), company.getPhoneNumber(), company.getEmail(),
                                            department.getDepartmentName(), department.getDepartmentCode(),
                                            manager.getManagerName(), manager.getManagerEmail(), manager.getPhoneNumber(),
                                            employee.getEmployeeName(), employee.getEmployeeId(), employee.getDesignation(), employee.getContactNumber(),
                                            totalDays, presentDays, leaveDays);
            } catch (NumberFormatException e) {
                System.out.println("Attendance must be numbers. Please try again.");
            } catch (PayrollException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Allowances ---
        Allowance allowance = null;
        while (allowance == null) {
            try {
                System.out.print("Housing Allowance: ");
                double housingAllowance = Double.parseDouble(sc.nextLine());
                System.out.print("Transport Allowance: ");
                double transportAllowance = Double.parseDouble(sc.nextLine());

                allowance = new Allowance(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                          company.getCompanyName(), company.getAddress(), company.getPhoneNumber(), company.getEmail(),
                                          department.getDepartmentName(), department.getDepartmentCode(),
                                          manager.getManagerName(), manager.getManagerEmail(), manager.getPhoneNumber(),
                                          employee.getEmployeeName(), employee.getEmployeeId(), employee.getDesignation(), employee.getContactNumber(),
                                          attendance.getTotalDays(), attendance.getPresentDays(), attendance.getLeaveDays(),
                                          housingAllowance, transportAllowance);
            } catch (NumberFormatException e) {
                System.out.println("Allowances must be numbers. Please try again.");
            } catch (PayrollException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Deductions ---
        Deduction deduction = null;
        while (deduction == null) {
            try {
                System.out.print("Tax Deduction: ");
                double taxDeduction = Double.parseDouble(sc.nextLine());
                System.out.print("Loan Deduction: ");
                double loanDeduction = Double.parseDouble(sc.nextLine());

                deduction = new Deduction(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                          company.getCompanyName(), company.getAddress(), company.getPhoneNumber(), company.getEmail(),
                                          department.getDepartmentName(), department.getDepartmentCode(),
                                          manager.getManagerName(), manager.getManagerEmail(), manager.getPhoneNumber(),
                                          employee.getEmployeeName(), employee.getEmployeeId(), employee.getDesignation(), employee.getContactNumber(),
                                          attendance.getTotalDays(), attendance.getPresentDays(), attendance.getLeaveDays(),
                                          allowance.getHousingAllowance(), allowance.getTransportAllowance(),
                                          taxDeduction, loanDeduction);
            } catch (NumberFormatException e) {
                System.out.println("Deductions must be numbers. Please try again.");
            } catch (PayrollException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Salary ---
        Salary salary = null;
        while (salary == null) {
            try {
                System.out.print("Basic Salary: ");
                double basicSalary = Double.parseDouble(sc.nextLine());
                System.out.print("Gross Salary: ");
                double grossSalary = Double.parseDouble(sc.nextLine());

                salary = new Salary(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                    company.getCompanyName(), company.getAddress(), company.getPhoneNumber(), company.getEmail(),
                                    department.getDepartmentName(), department.getDepartmentCode(),
                                    manager.getManagerName(), manager.getManagerEmail(), manager.getPhoneNumber(),
                                    employee.getEmployeeName(), employee.getEmployeeId(), employee.getDesignation(), employee.getContactNumber(),
                                    attendance.getTotalDays(), attendance.getPresentDays(), attendance.getLeaveDays(),
                                    allowance.getHousingAllowance(), allowance.getTransportAllowance(),
                                    deduction.getTaxDeduction(), deduction.getLoanDeduction(),
                                    basicSalary, grossSalary);
            } catch (NumberFormatException e) {
                System.out.println("Salary must be numbers. Please try again.");
            } catch (PayrollException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // --- Display Payroll Record ---
        System.out.println("\n=== Final Payroll Record ===");
        System.out.println("\nq3 Done by Eloi id:27131");

        System.out.println("\nEntity Details");
        System.out.println("ID: " + entity.getId());
        System.out.println("Created Date: " + entity.getCreatedDate());
        System.out.println("Updated Date: " + entity.getUpdatedDate());

        System.out.println("\nCompany Details");
        System.out.println("Company Name: " + company.getCompanyName());
        System.out.println("Address: " + company.getAddress());
        System.out.println("Phone: " + company.getPhoneNumber());
        System.out.println("Email: " + company.getEmail());

        System.out.println("\nDepartment Details");
        System.out.println("Department Name: " + department.getDepartmentName());
        System.out.println("Department Code: " + department.getDepartmentCode());

        System.out.println("\nManager Details");
        System.out.println("Manager Name: " + manager.getManagerName());
        System.out.println("Manager Email: " + manager.getManagerEmail());
        System.out.println("Manager Phone: " + manager.getPhoneNumber());

        System.out.println("\nEmployee Details");
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Contact: " + employee.getContactNumber());

        System.out.println("\nAttendance Details");
        System.out.println("Total Days: " + attendance.getTotalDays());
        System.out.println("Present Days: " + attendance.getPresentDays());
        System.out.println("Leave Days: " + attendance.getLeaveDays());

        System.out.println("\nAllowance Details");
        System.out.println("Housing: " + allowance.getHousingAllowance());
        System.out.println("Transport: " + allowance.getTransportAllowance());

        System.out.println("\nDeduction Details");
        System.out.println("Tax: " + deduction.getTaxDeduction());
        System.out.println("Loan: " + deduction.getLoanDeduction());

        System.out.println("\nSalary Details");
        System.out.println("Basic Salary: " + salary.getBasicSalary());
        System.out.println("Gross Salary: " + salary.getGrossSalary());
        System.out.println("Net Salary: " + salary.getNetSalary());
    }
}
