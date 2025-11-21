package id27131.q1;

import java.util.Scanner;

public final class HospitalRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hospital hospital = null;
        Department department = null;
        Doctor doctor = null;
        Nurse nurse = null;
        Patient patient = null;
        Admission admission = null;
        Treatment treatment = null;
        Bill bill = null;

        // ===== Hospital =====
        while (hospital == null) {
            try {
                System.out.println("=== Enter Hospital Details ===");
                System.out.print("Hospital Name: ");
                String hName = sc.nextLine();
                System.out.print("Address: ");
                String hAddress = sc.nextLine();
                System.out.print("Phone (10 digits): ");
                String hPhone = sc.nextLine();
                System.out.print("Email: ");
                String hEmail = sc.nextLine();

                hospital = new Hospital(hName, hAddress, hPhone, hEmail);
            } catch (HospitalDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Department =====
        while (department == null) {
            try {
                System.out.println("=== Enter Department Details ===");
                System.out.print("Department Name: ");
                String dName = sc.nextLine();
                System.out.print("Department Code (≥3 chars): ");
                String dCode = sc.nextLine();

                department = new Department(dName, dCode);
            } catch (HospitalDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Doctor =====
        while (doctor == null) {
            try {
                System.out.println("=== Enter Doctor Details ===");
                System.out.print("Doctor Name: ");
                String docName = sc.nextLine();
                System.out.print("Specialization: ");
                String specialization = sc.nextLine();
                System.out.print("Email: ");
                String docEmail = sc.nextLine();
                System.out.print("Phone (10 digits): ");
                String docPhone = sc.nextLine();

                doctor = new Doctor(docName, specialization, docEmail, docPhone);
            } catch (HospitalDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Nurse =====
        while (nurse == null) {
            try {
                System.out.println("=== Enter Nurse Details ===");
                System.out.print("Nurse Name: ");
                String nurseName = sc.nextLine();
                System.out.print("Shift (Day/Night): ");
                String shift = sc.nextLine();
                System.out.print("Years of Experience: ");
                int years = Integer.parseInt(sc.nextLine());

                nurse = new Nurse(nurseName, shift, years);
            } catch (HospitalDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Years of experience must be a number");
            }
        }

        // ===== Patient =====
        while (patient == null) {
            try {
                System.out.println("=== Enter Patient Details ===");
                System.out.print("Patient Name: ");
                String pName = sc.nextLine();
                System.out.print("Age: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.print("Gender (Male/Female/Other): ");
                String gender = sc.nextLine();
                System.out.print("Contact Number (10 digits): ");
                String contact = sc.nextLine();

                patient = new Patient(pName, age, gender, contact);
            } catch (HospitalDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Age must be a number");
            }
        }

        // ===== Admission =====
        while (admission == null) {
            try {
                System.out.println("=== Enter Admission Details ===");
                System.out.print("Admission Date: ");
                String adDate = sc.nextLine();
                System.out.print("Room Number: ");
                String roomNumber = sc.nextLine();
                System.out.print("Room Charges: ");
                double roomCharges = Double.parseDouble(sc.nextLine());

                admission = new Admission(adDate, roomNumber, roomCharges);
            } catch (HospitalDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Room charges must be a number");
            }
        }

        // ===== Treatment =====
        while (treatment == null) {
            try {
                System.out.println("=== Enter Treatment Details ===");
                System.out.print("Diagnosis: ");
                String diagnosis = sc.nextLine();
                System.out.print("Treatment Given: ");
                String treatmentGiven = sc.nextLine();
                System.out.print("Treatment Cost: ");
                double treatmentCost = Double.parseDouble(sc.nextLine());

                treatment = new Treatment(diagnosis, treatmentGiven, treatmentCost);
            } catch (HospitalDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Treatment cost must be a number");
            }
        }

        // ===== Bill =====
        while (bill == null) {
            try {
                System.out.println("=== Enter Billing Details ===");
                System.out.print("Doctor Fee: ");
                double doctorFee = Double.parseDouble(sc.nextLine());
                System.out.print("Medicine Cost: ");
                double medicineCost = Double.parseDouble(sc.nextLine());

                bill = new Bill(admission.getRoomCharges(), treatment.getTreatmentCost(),
                        doctorFee, medicineCost);
            } catch (HospitalDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Fees must be numbers");
            }
        }

        // ===== Display Final Bill =====
        System.out.println("\n=== Final Hospital Billing Record ===");
        System.out.println("Hospital: " + hospital.getHospitalName());
        System.out.println("Patient: " + patient.getPatientName());
        System.out.println("Room Charges: " + admission.getRoomCharges());
        System.out.println("Treatment Cost: " + treatment.getTreatmentCost());
        System.out.println("Doctor Fee: " + bill.getDoctorFee());
        System.out.println("Medicine Cost: " + bill.getMedicineCost());
        System.out.println("Total Bill: " + bill.generateBill());
    }
}
