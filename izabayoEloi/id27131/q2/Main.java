package id27131.q2;

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

            System.out.print("Enter School Name: ");
            String schoolName = sc.nextLine();

            System.out.print("Enter School Address: ");
            String schoolAddress = sc.nextLine();

            System.out.print("Enter School Phone (10 digits): ");
            String schoolPhone = sc.nextLine();

            System.out.print("Enter School Email: ");
            String schoolEmail = sc.nextLine();

            System.out.print("Enter Department Name: ");
            String deptName = sc.nextLine();

            System.out.print("Enter Department Code (alphanumeric, >=3): ");
            String deptCode = sc.nextLine();

            System.out.print("Enter Teacher Name: ");
            String teacherName = sc.nextLine();

            System.out.print("Enter Teacher Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Teacher Email: ");
            String teacherEmail = sc.nextLine();

            System.out.print("Enter Teacher Phone (10 digits): ");
            String teacherPhone = sc.nextLine();

            System.out.print("Enter Student Name: ");
            String studentName = sc.nextLine();

            System.out.print("Enter Roll Number (positive integer): ");
            int rollNumber = sc.nextInt(); sc.nextLine();

            System.out.print("Enter Grade: ");
            String grade = sc.nextLine();

            System.out.print("Enter Student Contact Number (10 digits): ");
            String studentContact = sc.nextLine();

            System.out.print("Enter Course Name: ");
            String courseName = sc.nextLine();

            System.out.print("Enter Course Code: ");
            String courseCode = sc.nextLine();

            System.out.print("Enter Credit Hours (integer > 0): ");
            int creditHours = sc.nextInt(); sc.nextLine();

            System.out.print("Enter Exam Name: ");
            String examName = sc.nextLine();

            System.out.print("Enter Max Marks (>0): ");
            double maxMarks = sc.nextDouble(); sc.nextLine();

            System.out.print("Enter Exam Date: ");
            String examDate = sc.nextLine();

            System.out.print("Enter Obtained Marks (>=0): ");
            double obtainedMarks = sc.nextDouble(); sc.nextLine();

            System.out.print("Enter Remarks: ");
            String remarks = sc.nextLine();

            System.out.print("Enter Tuition Fee (>0): ");
            double tuitionFee = sc.nextDouble(); sc.nextLine();

            System.out.print("Enter Exam Fee (>0): ");
            double examFee = sc.nextDouble(); sc.nextLine();

            // Create the final object (runs validations)
            StudentRecord record = new StudentRecord(
                    id, createdDate, updatedDate,
                    schoolName, schoolAddress, schoolPhone, schoolEmail,
                    deptName, deptCode,
                    teacherName, subject, teacherEmail, teacherPhone,
                    studentName, rollNumber, grade, studentContact,
                    courseName, courseCode, creditHours,
                    examName, maxMarks, examDate,
                    obtainedMarks, remarks,
                    tuitionFee, examFee
            );

            // Display
            System.out.println("\n===== STUDENT RECORD =====");
            System.out.println("School: " + record.getSchoolName());
            System.out.println("Address: " + record.getAddress());
            System.out.println("School Phone: " + record.getPhoneNumber());
            System.out.println("School Email: " + record.getEmail());
            System.out.println("Department: " + record.getDepartmentName() + " (" + record.getDepartmentCode() + ")");
            System.out.println("Teacher: " + record.getTeacherName() + " | Subject: " + record.getSubject());
            System.out.println("Student: " + record.getStudentName() + " | Roll: " + record.getRollNumber() + " | Grade: " + record.getGrade() + " | Contact: " + record.getContactNumber());
            System.out.println("Course: " + record.getCourseName() + " (" + record.getCourseCode() + ") | Credit Hours: " + record.getCreditHours());
            System.out.println("Exam: " + record.getExamName() + " | Date: " + record.getExamDate());
            System.out.printf("\nMax Marks: %.2f%n", record.getMaxMarks());
            System.out.printf("Obtained Marks: %.2f%n", record.getObtainedMarks());
            System.out.println("Remarks: " + record.getRemarks());
            System.out.printf("\nTuition Fee: %.2f%n", record.getTuitionFee());
            System.out.printf("Exam Fee: %.2f%n", record.getExamFee());
            System.out.printf("Total Fee: %.2f%n", record.getTotalFee());

            System.out.printf("\nAverage Marks: %.2f%%%n", record.calculateAverageMarks());

        } catch (SchoolDataException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input error: please enter data in the correct format.");
        } finally {
            sc.close();
        }
    }
}
