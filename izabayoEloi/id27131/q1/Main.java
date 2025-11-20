package id27131.q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Entity / Hospital info
            System.out.print("Enter ID (positive integer): ");
            int id = sc.nextInt(); sc.nextLine();

            System.out.print("Enter created date (e.g. 2025-11-20): ");
            String createdDate = sc.nextLine();

            System.out.print("Enter updated date (e.g. 2025-11-20): ");
            String updatedDate = sc.nextLine();

            System.out.print("Enter Hospital Name: ");
            String hospitalName = sc.nextLine();

            System.out.print("Enter Hospital Address: ");
            String hospitalAddress = sc.nextLine();

            System.out.print("Enter Hospital Phone (10 digits): ");
            String hospitalPhone = sc.nextLine();

            System.out.print("Enter Hospital Email: ");
            String hospitalEmail = sc.nextLine();

            // Department & staff
            System.out.print("Enter Department Name: ");
            String deptName = sc.nextLine();

            System.out.print("Enter Department Code (alphanumeric, >=3): ");
            String deptCode = sc.nextLine();

            System.out.print("Enter Doctor Name: ");
            String doctorName = sc.nextLine();

            System.out.print("Enter Doctor Specialization: ");
            String specialization = sc.nextLine();

            System.out.print("Enter Doctor Email: ");
            String doctorEmail = sc.nextLine();

            System.out.print("Enter Doctor Phone (10 digits): ");
            String doctorPhone = sc.nextLine();

            System.out.print("Enter Nurse Name: ");
            String nurseName = sc.nextLine();

            System.out.print("Enter Nurse Shift (Day/Night): ");
            String shift = sc.nextLine();

            System.out.print("Enter Nurse Years of Experience (integer): ");
            int yearsExp = sc.nextInt(); sc.nextLine();

            // Patient & admission & treatment & bill
            System.out.print("Enter Patient Name: ");
            String patientName = sc.nextLine();

            System.out.print("Enter Patient Age: ");
            int age = sc.nextInt(); sc.nextLine();

            System.out.print("Enter Patient Gender (Male/Female/Other): ");
            String gender = sc.nextLine();

            System.out.print("Enter Patient Contact Number (10 digits): ");
            String contact = sc.nextLine();

            System.out.print("Enter Admission Date (e.g. 2025-11-20): ");
            String admissionDate = sc.nextLine();

            System.out.print("Enter Room Number: ");
            int roomNumber = sc.nextInt(); sc.nextLine();

            System.out.print("Enter Room Charges: ");
            double roomCharges = sc.nextDouble(); sc.nextLine();

            System.out.print("Enter Diagnosis: ");
            String diagnosis = sc.nextLine();

            System.out.print("Enter Treatment Given (if none, type none): ");
            String treatmentGiven = sc.nextLine();

            System.out.print("Enter Treatment Cost: ");
            double treatmentCost = sc.nextDouble(); sc.nextLine();

            System.out.print("Enter Doctor Fee: ");
            double doctorFee = sc.nextDouble(); sc.nextLine();

            System.out.print("Enter Medicine Cost: ");
            double medicineCost = sc.nextDouble(); sc.nextLine();

            // Create the final object (this will run all validations)
            HospitalRecord record = new HospitalRecord(
                    id, createdDate, updatedDate,
                    hospitalName, hospitalAddress, hospitalPhone, hospitalEmail,
                    deptName, deptCode,
                    doctorName, specialization, doctorEmail, doctorPhone,
                    nurseName, shift, yearsExp,
                    patientName, age, gender, contact,
                    admissionDate, roomNumber, roomCharges,
                    diagnosis, treatmentGiven, treatmentCost,
                    doctorFee, medicineCost
            );

            // Display all required details and computed bill
            System.out.println("\n===== HOSPITAL & PATIENT DETAILS =====");
            System.out.println("Hospital: " + record.getHospitalName());
            System.out.println("Address: " + record.getAddress());
            System.out.println("Hospital Phone: " + record.getPhone());
            System.out.println("Hospital Email: " + record.getEmail());
            System.out.println("Department: " + record.getDepartmentName() + " (" + record.getDepartmentCode() + ")");
            System.out.println("Doctor: " + record.getDoctorName() + " - " + record.getSpecialization());
            System.out.println("Doctor Phone: " + record.getPhone());
            System.out.println("Nurse: " + record.getNurseName() + " (Shift: " + record.getShift() + ", Exp: " + record.getYearsOfExperience() + " years)");
            System.out.println("Patient: " + record.getPatientName() + " | Age: " + record.getAge() + " | Gender: " + record.getGender() + " | Contact: " + record.getContactNumber());
            System.out.println("Admission Date: " + record.getAdmissionDate() + " | Room #: " + record.getRoomNumber());

            System.out.println("\n--- CHARGES ---");
            System.out.printf("Room Charges: %.2f%n", record.getRoomCharges());
            System.out.printf("Treatment Cost: %.2f%n", record.getTreatmentCost());
            System.out.printf("Doctor Fee: %.2f%n", record.getDoctorFee());
            System.out.printf("Medicine Cost: %.2f%n", record.getMedicineCost());

            System.out.printf("\nTotal Bill: %.2f%n", record.generateBill());

        } catch (HospitalDataException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input error: please enter data in the correct format.");
        } finally {
            sc.close();
        }
    }
}
