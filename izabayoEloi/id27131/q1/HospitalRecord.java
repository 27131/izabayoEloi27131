package id27131.q1;

import java.util.Scanner;

public final class HospitalRecord {
    public static void main(String[] args) throws HospitalDataException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWork done by Eloi id:27131\n");
        // ===== Entity =====
        int id = 0;
        while (true) {
            try {
                System.out.print("Enter ID: ");
                id = Integer.parseInt(sc.nextLine());
                if (id <= 0) throw new HospitalDataException("ID must be greater than 0");
                break;
            } catch (NumberFormatException e) {
                System.out.println("ID must be a number");
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        String createdDate = "";
        while (true) {
            try {
                System.out.print("Enter Created Date: ");
                createdDate = sc.nextLine();
                if (createdDate.trim().isEmpty()) throw new HospitalDataException("Created date cannot be empty");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        String updatedDate = "";
        while (true) {
            try {
                System.out.print("Enter Updated Date: ");
                updatedDate = sc.nextLine();
                if (updatedDate.trim().isEmpty()) throw new HospitalDataException("Updated date cannot be empty");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        Entity entity = new Entity(id, createdDate, updatedDate);

        // ===== Hospital =====
        String hospitalName = "";
        while (true) {
            try {
                System.out.print("Hospital Name: ");
                hospitalName = sc.nextLine();
                if (hospitalName.trim().isEmpty()) throw new HospitalDataException("Hospital name cannot be empty");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        String hospitalAddress = "";
        while (true) {
            try {
                System.out.print("Hospital Address: ");
                hospitalAddress = sc.nextLine();
                if (hospitalAddress.trim().isEmpty()) throw new HospitalDataException("Hospital address cannot be empty");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        String hospitalPhone = "";
        while (true) {
            try {
                System.out.print("Hospital Phone (10 digits): ");
                hospitalPhone = sc.nextLine();
                if (!hospitalPhone.matches("\\d{10}")) throw new HospitalDataException("Phone must be 10 digits");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        String hospitalEmail = "";
        while (true) {
            try {
                System.out.print("Hospital Email: ");
                hospitalEmail = sc.nextLine();
                if (!hospitalEmail.matches(".+@.+")) throw new HospitalDataException("Invalid email format");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        Hospital hospital= new Hospital(id, createdDate, updatedDate, hospitalName, hospitalAddress, hospitalPhone, hospitalEmail);

        // ===== Department =====
        String departmentName = "";
        while (true) {
            try {
                System.out.print("Department Name: ");
                departmentName = sc.nextLine();
                if (departmentName.trim().isEmpty()) throw new HospitalDataException("Department name cannot be empty");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        String departmentCode = "";
        while (true) {
            try {
                System.out.print("Department Code (≥3 chars): ");
                departmentCode = sc.nextLine();
                if (departmentCode.length() < 3) throw new HospitalDataException("Code must be at least 3 chars");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        Department department = new Department(id, createdDate, updatedDate, hospitalName, hospitalAddress, hospitalPhone, hospitalEmail, departmentName, departmentCode);

        // ===== Doctor =====
        String doctorName = "";
        while (true) {
            try {
                System.out.print("Doctor Name: ");
                doctorName = sc.nextLine();
                if (doctorName.trim().isEmpty()) throw new HospitalDataException("Doctor name cannot be empty");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        String specialization = "";
        while (true) {
            try {
                System.out.print("Specialization: ");
                specialization = sc.nextLine();
                if (specialization.trim().isEmpty()) throw new HospitalDataException("Specialization cannot be empty");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        String doctorEmail = "";
        while (true) {
            try {
                System.out.print("Doctor Email: ");
                doctorEmail = sc.nextLine();
                if (!doctorEmail.matches(".+@.+")) throw new HospitalDataException("Invalid email format");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        String doctorPhone = "";
        while (true) {
            try {
                System.out.print("Doctor Phone (10 digits): ");
                doctorPhone = sc.nextLine();
                if (!doctorPhone.matches("\\d{10}")) throw new HospitalDataException("Phone must be 10 digits");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        Doctor doctor=new Doctor(id, createdDate, updatedDate, hospitalName, hospitalAddress, hospitalPhone, 
            hospitalEmail, departmentName, departmentCode, doctorName, specialization, 
            doctorEmail, doctorPhone);

        // ===== Nurse =====
        String nurseName = "";
        while (true) {
            try {
                System.out.print("Nurse Name: ");
                nurseName = sc.nextLine();
                if (nurseName.trim().isEmpty()) throw new HospitalDataException("Nurse name cannot be empty");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        String shift = "";
        while (true) {
            try {
                System.out.print("Shift (Day/Night): ");
                shift = sc.nextLine();
                if (!shift.equalsIgnoreCase("Day") && !shift.equalsIgnoreCase("Night"))
                    throw new HospitalDataException("Shift must be Day or Night");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        int yearsOfExperience = 0;
        while (true) {
            try {
                System.out.print("Years of Experience: ");
                yearsOfExperience = Integer.parseInt(sc.nextLine());
                if (yearsOfExperience < 0) throw new HospitalDataException("Years must be ≥ 0");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Years must be a number");
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        Nurse nurse = new Nurse(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                  hospital.getHospitalName(), hospital.getAddress(),
                                  hospital.getPhoneNumber(), hospital.getEmail(),
                                  department.getDepartmentName(), department.getDepartmentCode(),
                                  doctor.getDoctorName(), doctor.getSpecialization(),
                                  doctor.getDoctorEmail(), doctor.getPhone(),
                                  nurseName, shift, yearsOfExperience);

        // ===== Patient =====
        String patientName = "";
        while (true) {
            try {
                System.out.print("Patient Name: ");
                patientName = sc.nextLine();
                if (patientName.trim().isEmpty()) throw new HospitalDataException("Patient name cannot be empty");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        int age = 0;
        while (true) {
            try {
                System.out.print("Age: ");
                age = Integer.parseInt(sc.nextLine());
                if (age <= 0) throw new HospitalDataException("Age must be > 0");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Age must be a number");
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        String gender = "";
        while (true) {
            try {
                System.out.print("Gender (Male/Female/Other): ");
                gender = sc.nextLine();
                if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female") && !gender.equalsIgnoreCase("Other"))
                    throw new HospitalDataException("Invalid gender");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        String contactNumber = "";
        while (true) {
            try {
                System.out.print("Contact Number (10 digits): ");
                contactNumber = sc.nextLine();
                if (!contactNumber.matches("\\d{10}")) throw new HospitalDataException("Contact number must be 10 digits");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        Patient patient = new Patient(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                      hospital.getHospitalName(), hospital.getAddress(),
                                      hospital.getPhoneNumber(), hospital.getEmail(),
                                      department.getDepartmentName(), department.getDepartmentCode(),
                                      doctor.getDoctorName(), doctor.getSpecialization(),
                                      doctor.getDoctorEmail(), doctor.getPhone(),
                                      nurse.getNurseName(), nurse.getShift(), nurse.getYearsOfExperience(),
                                      patientName, age, gender, contactNumber);

        // ===== Admission =====
        String admissionDate = "";
        while (true) {
            try {
                System.out.print("Admission Date: ");
                admissionDate = sc.nextLine();
                if (admissionDate.trim().isEmpty()) throw new HospitalDataException("Admission date cannot be empty");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        String roomNumber = "";
        while (true) {
            try {
                System.out.print("Room Number: ");
                roomNumber = sc.nextLine();
                if (roomNumber.trim().isEmpty()) throw new HospitalDataException("Room number cannot be empty");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        double roomCharges = 0;
        while (true) {
            try {
                System.out.print("Room Charges: ");
                roomCharges = Double.parseDouble(sc.nextLine());
                if (roomCharges <= 0) throw new HospitalDataException("Room charges must be > 0");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Room charges must be a number");
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        Admission admission = new Admission(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                          hospital.getHospitalName(), hospital.getAddress(),
                                          hospital.getPhoneNumber(), hospital.getEmail(),
                                          department.getDepartmentName(), department.getDepartmentCode(),
                                          doctor.getDoctorName(), doctor.getSpecialization(),
                                          doctor.getDoctorEmail(), doctor.getPhone(),
                                          nurse.getNurseName(), nurse.getShift(), nurse.getYearsOfExperience(),
                                          patient.getPatientName(), patient.getAge(), patient.getGender(),
                                          patient.getContactNumber(),
                                          admissionDate, roomNumber, roomCharges);

        // ===== Treatment =====
        String diagnosis = "";
        while (true) {
            try {
                System.out.print("Diagnosis: ");
                diagnosis = sc.nextLine();
                if (diagnosis.trim().isEmpty()) throw new HospitalDataException("Diagnosis cannot be empty");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        String treatmentGiven = "";
        while (true) {
            try {
                System.out.print("Treatment Given: ");
                treatmentGiven = sc.nextLine();
                if (treatmentGiven.trim().isEmpty()) throw new HospitalDataException("Treatment cannot be empty");
                break;
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        double treatmentCost = 0;
        while (true) {
            try {
                System.out.print("Treatment Cost: ");
                treatmentCost = Double.parseDouble(sc.nextLine());
                if (treatmentCost <= 0) throw new HospitalDataException("Treatment cost must be > 0");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Treatment cost must be a number");
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        Treatment treatment = new Treatment(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
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

        // ===== Bill =====
        double doctorFee = 0;
        while (true) {
            try {
                System.out.print("Doctor Fee: ");
                doctorFee = Double.parseDouble(sc.nextLine());
                if (doctorFee < 0) throw new HospitalDataException("Doctor fee must be >= 0");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Doctor fee must be a number");
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

        double medicineCost = 0;
        while (true) {
            try {
                System.out.print("Medicine Cost: ");
                medicineCost = Double.parseDouble(sc.nextLine());
                if (medicineCost < 0) throw new HospitalDataException("Medicine cost must be >= 0");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Medicine cost must be a number");
            } catch (HospitalDataException e) {
                System.out.println(e.getMessage());
            }
        }

            Bill bill = new Bill(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
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

        // ===== Display Final Bill =====
        System.out.println("\nWork done by Eloi id:27131");
        System.out.println("\n=== Final Hospital Billing Record ===");
        System.out.println("ID: " + entity.getId());
        System.out.println("Created Date: " + entity.getCreatedDate());
        System.out.println("Updated Date: " + entity.getUpdatedDate());
        System.out.println("Hospital Name: " + hospital.getHospitalName());
        System.out.println("Hospital Address: " + hospital.getAddress());
        System.out.println("Hospital Phone: " + hospital.getPhoneNumber());
        System.out.println("Hospital Email: " + hospital.getEmail());
        System.out.println("Department Name: " + department.getDepartmentName());
        System.out.println("Department Code: " + department.getDepartmentCode());
        System.out.println("Doctor Name: " + doctor.getDoctorName());
        System.out.println("Specialization: " + doctor.getSpecialization());
        System.out.println("Doctor Email: " + doctor.getDoctorEmail());
        System.out.println("Doctor Phone: " + doctor.getPhone());
        System.out.println("Nurse Name: " + nurse.getNurseName());
        System.out.println("Shift: " + nurse.getShift());
        System.out.println("Years of Experience: " + nurse.getYearsOfExperience());
        System.out.println("Patient Name: " + patient.getPatientName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Gender: " + patient.getGender());
        System.out.println("Contact Number: " + patient.getContactNumber());
        System.out.println("Admission Date: " + admission.getAdmissionDate());
        System.out.println("Room Number: " + admission.getRoomNumber());
        System.out.println("Room Charges: " + admission.getRoomCharges());
        System.out.println("Diagnosis: " + treatment.getDiagnosis());
        System.out.println("Treatment Given: " + treatment.getTreatmentGiven());
        System.out.println("Treatment Cost: " + treatment.getTreatmentCost());
        System.out.println("Doctor Fee: " + bill.getDoctorFee());
        System.out.println("Medicine Cost: " + bill.getMedicineCost());
        System.out.println("Total Bill: " + bill.generateBill());
    }
}
