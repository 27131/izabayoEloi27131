package id27131.q1;

import java.util.Scanner;

public final class HospitalRecord {
    public static void main(String[] args) throws HospitalDataException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWork done by Eloi id:27131\n");
        // Entity
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
            } catch (HospitalDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        // Hospital
        Hospital hospital = null;
        while (hospital == null) {
            try {
                System.out.print("Hospital Name: ");
                String hospitalName = sc.nextLine();
                System.out.print("Hospital Address: ");
                String hospitalAddress = sc.nextLine();
                System.out.print("Hospital Phone (10 digits): ");
                String hospitalPhone = sc.nextLine();
                System.out.print("Hospital Email: ");
                String hospitalEmail = sc.nextLine();

                hospital = new Hospital(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                        hospitalName, hospitalAddress, hospitalPhone, hospitalEmail);
            } catch (HospitalDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        // Department
        Department department = null;
        while (department == null) {
            try {
                System.out.print("Department Name: ");
                String departmentName = sc.nextLine();
                System.out.print("Department Code (≥3 chars): ");
                String departmentCode = sc.nextLine();

                department = new Department(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                            hospital.getHospitalName(), hospital.getAddress(),
                                            hospital.getPhoneNumber(), hospital.getEmail(),
                                            departmentName, departmentCode);
            } catch (HospitalDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        // Doctor
        Doctor doctor = null;
        while (doctor == null) {
            try {
                System.out.print("Doctor Name: ");
                String doctorName = sc.nextLine();
                System.out.print("Specialization: ");
                String specialization = sc.nextLine();
                System.out.print("Doctor Email: ");
                String doctorEmail = sc.nextLine();
                System.out.print("Doctor Phone (10 digits): ");
                String doctorPhone = sc.nextLine();

                doctor = new Doctor(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                    hospital.getHospitalName(), hospital.getAddress(),
                                    hospital.getPhoneNumber(), hospital.getEmail(),
                                    department.getDepartmentName(), department.getDepartmentCode(),
                                    doctorName, specialization, doctorEmail, doctorPhone);
            } catch (HospitalDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        // Nurse
        Nurse nurse = null;
        while (nurse == null) {
            try {
                System.out.print("Nurse Name: ");
                String nurseName = sc.nextLine();
                System.out.print("Shift (Day/Night): ");
                String shift = sc.nextLine();
                System.out.print("Years of Experience: ");
                int yearsOfExperience = Integer.parseInt(sc.nextLine());

                nurse = new Nurse(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                  hospital.getHospitalName(), hospital.getAddress(),
                                  hospital.getPhoneNumber(), hospital.getEmail(),
                                  department.getDepartmentName(), department.getDepartmentCode(),
                                  doctor.getDoctorName(), doctor.getSpecialization(),
                                  doctor.getDoctorEmail(), doctor.getPhone(),
                                  nurseName, shift, yearsOfExperience);
            } catch (NumberFormatException e) {
                System.out.println("Years of Experience must be a number. Please try again.");
            } catch (HospitalDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        // Patient
        Patient patient = null;
        while (patient == null) {
            try {
                System.out.print("Patient Name: ");
                String patientName = sc.nextLine();
                System.out.print("Age: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.print("Gender (Male/Female/Other): ");
                String gender = sc.nextLine();
                System.out.print("Contact Number (10 digits): ");
                String contactNumber = sc.nextLine();

                patient = new Patient(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                      hospital.getHospitalName(), hospital.getAddress(),
                                      hospital.getPhoneNumber(), hospital.getEmail(),
                                      department.getDepartmentName(), department.getDepartmentCode(),
                                      doctor.getDoctorName(), doctor.getSpecialization(),
                                      doctor.getDoctorEmail(), doctor.getPhone(),
                                      nurse.getNurseName(), nurse.getShift(), nurse.getYearsOfExperience(),
                                      patientName, age, gender, contactNumber);
            } catch (NumberFormatException e) {
                System.out.println("Age must be a number. Please try again.");
            } catch (HospitalDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        // Admission
        Admission admission = null;
        while (admission == null) {
            try {
                System.out.print("Admission Date: ");
                String admissionDate = sc.nextLine();
                System.out.print("Room Number: ");
                String roomNumber = sc.nextLine();
                System.out.print("Room Charges: ");
                double roomCharges = Double.parseDouble(sc.nextLine());

                admission = new Admission(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                          hospital.getHospitalName(), hospital.getAddress(),
                                          hospital.getPhoneNumber(), hospital.getEmail(),
                                          department.getDepartmentName(), department.getDepartmentCode(),
                                          doctor.getDoctorName(), doctor.getSpecialization(),
                                          doctor.getDoctorEmail(), doctor.getPhone(),
                                          nurse.getNurseName(), nurse.getShift(), nurse.getYearsOfExperience(),
                                          patient.getPatientName(), patient.getAge(), patient.getGender(),
                                          patient.getContactNumber(),
                                          admissionDate, roomNumber, roomCharges);
            } catch (NumberFormatException e) {
                System.out.println("Room Charges must be a number. Please try again.");
            } catch (HospitalDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        // Treatment
        Treatment treatment = null;
        while (treatment == null) {
            try {
                System.out.print("Diagnosis: ");
                String diagnosis = sc.nextLine();
                System.out.print("Treatment Given: ");
                String treatmentGiven = sc.nextLine();
                System.out.print("Treatment Cost: ");
                double treatmentCost = Double.parseDouble(sc.nextLine());

                treatment = new Treatment(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                          hospital.getHospitalName(), hospital.getAddress(),
                                          hospital.getPhoneNumber(), hospital.getEmail(),
                                          department.getDepartmentName(), department.getDepartmentCode(),
                                          doctor.getDoctorName(), doctor.getSpecialization(),
                                          doctor.getDoctorEmail(), doctor.getPhone(),
                                          nurse.getNurseName(), nurse.getShift(), nurse.getYearsOfExperience(),
                                          patient.getPatientName(), patient.getAge(), patient.getGender(),
                                          patient.getContactNumber(),
                                          admission.getAdmissionDate(), admission.getRoomNumber(), admission.getRoomCharges(),
                                          diagnosis, treatmentGiven, treatmentCost);
            } catch (NumberFormatException e) {
                System.out.println("Treatment Cost must be a number. Please try again.");
            } catch (HospitalDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        // Bill
        Bill bill = null;
        while (bill == null) {
            try {
                System.out.print("Doctor Fee: ");
                double doctorFee = Double.parseDouble(sc.nextLine());
                System.out.print("Medicine Cost: ");
                double medicineCost = Double.parseDouble(sc.nextLine());

                bill = new Bill(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                hospital.getHospitalName(), hospital.getAddress(),
                                hospital.getPhoneNumber(), hospital.getEmail(),
                                department.getDepartmentName(), department.getDepartmentCode(),
                                doctor.getDoctorName(), doctor.getSpecialization(),
                                doctor.getDoctorEmail(), doctor.getPhone(),
                                nurse.getNurseName(), nurse.getShift(), nurse.getYearsOfExperience(),
                                patient.getPatientName(), patient.getAge(), patient.getGender(),
                                patient.getContactNumber(),
                                admission.getAdmissionDate(), admission.getRoomNumber(), admission.getRoomCharges(),
                                treatment.getDiagnosis(), treatment.getTreatmentGiven(), treatment.getTreatmentCost(),
                                doctorFee, medicineCost);
            } catch (NumberFormatException e) {
                System.out.println("Fees and Costs must be numbers. Please try again.");
            } catch (HospitalDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        //Display Final Bill
        System.out.println("\nWork done by Eloi id:27131");
        System.out.println("\n=== Final Hospital Billing Record ===");
        System.out.println("\nEntity Details");
        System.out.println("ID: " + entity.getId());
        System.out.println("Created Date: " + entity.getCreatedDate());
        System.out.println("Updated Date: " + entity.getUpdatedDate());
        System.out.println("\nHospital Details");
        System.out.println("Hospital Name: " + hospital.getHospitalName());
        System.out.println("Hospital Address: " + hospital.getAddress());
        System.out.println("Hospital Phone: " + hospital.getPhoneNumber());
        System.out.println("Hospital Email: " + hospital.getEmail());
        System.out.println("\nDepartment Details");
        System.out.println("Department Name: " + department.getDepartmentName());
        System.out.println("Department Code: " + department.getDepartmentCode());
        System.out.println("\nDoctor Details");
        System.out.println("Doctor Name: " + doctor.getDoctorName());
        System.out.println("Specialization: " + doctor.getSpecialization());
        System.out.println("Doctor Email: " + doctor.getDoctorEmail());
        System.out.println("Doctor Phone: " + doctor.getPhone());
        System.out.println("\nNurse Details");
        System.out.println("Nurse Name: " + nurse.getNurseName());
        System.out.println("Shift: " + nurse.getShift());
        System.out.println("Years of Experience: " + nurse.getYearsOfExperience());
        System.out.println("\nPatient Details");
        System.out.println("Patient Name: " + patient.getPatientName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Gender: " + patient.getGender());
        System.out.println("Contact Number: " + patient.getContactNumber());
        System.out.println("\nAdmission Details");
        System.out.println("Admission Date: " + admission.getAdmissionDate());
        System.out.println("Room Number: " + admission.getRoomNumber());
        System.out.println("Room Charges: " + admission.getRoomCharges());
        System.out.println("\nTreatment Detail");
        System.out.println("Diagnosis: " + treatment.getDiagnosis());
        System.out.println("Treatment Given: " + treatment.getTreatmentGiven());
        System.out.println("Treatment Cost: " + treatment.getTreatmentCost());
        System.out.println("\nBill Details");
        System.out.println("Doctor Fee: " + bill.getDoctorFee());
        System.out.println("Medicine Cost: " + bill.getMedicineCost());
        System.out.println("Total Bill: " + bill.generateBill());
    }
}
