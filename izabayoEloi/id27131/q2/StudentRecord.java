package id27131.q2;

import java.util.Scanner;

public final class StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        School school = null;
        Department department = null;
        Teacher teacher = null;
        Student student = null;
        Course course = null;
        Exam exam = null;
        Result result = null;
        Fee fee = null;

        // ===== School =====
        while (school == null) {
            try {
                System.out.print("School Name: ");
                String name = sc.nextLine();
                System.out.print("Address: ");
                String address = sc.nextLine();
                System.out.print("Phone (10 digits): ");
                String phone = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();

                school = new School(name, address, phone, email);
            } catch (SchoolDataException e) {
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
            } catch (SchoolDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Teacher =====
        while (teacher == null) {
            try {
                System.out.print("Teacher Name: ");
                String tName = sc.nextLine();
                System.out.print("Subject: ");
                String subject = sc.nextLine();
                System.out.print("Email: ");
                String tEmail = sc.nextLine();
                System.out.print("Phone (10 digits): ");
                String phone = sc.nextLine();

                teacher = new Teacher(tName, subject, tEmail, phone);
            } catch (SchoolDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Student =====
        while (student == null) {
            try {
                System.out.print("Student Name: ");
                String sName = sc.nextLine();
                System.out.print("Roll Number: ");
                int roll = Integer.parseInt(sc.nextLine());
                System.out.print("Grade: ");
                String grade = sc.nextLine();
                System.out.print("Contact Number: ");
                String contact = sc.nextLine();

                student = new Student(sName, roll, grade, contact);
            } catch (SchoolDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Roll number must be a number");
            }
        }

        // ===== Course =====
        while (course == null) {
            try {
                System.out.print("Course Name: ");
                String cName = sc.nextLine();
                System.out.print("Course Code: ");
                String cCode = sc.nextLine();
                System.out.print("Credit Hours: ");
                int credit = Integer.parseInt(sc.nextLine());

                course = new Course(cName, cCode, credit);
            } catch (SchoolDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Credit hours must be a number");
            }
        }

        // ===== Exam =====
        while (exam == null) {
            try {
                System.out.print("Exam Name: ");
                String exName = sc.nextLine();
                System.out.print("Max Marks: ");
                int max = Integer.parseInt(sc.nextLine());
                System.out.print("Exam Date: ");
                String date = sc.nextLine();

                exam = new Exam(exName, max, date);
            } catch (SchoolDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Max marks must be a number");
            }
        }

        // ===== Result =====
        while (result == null) {
            try {
                System.out.print("Obtained Marks: ");
                int marks = Integer.parseInt(sc.nextLine());
                System.out.print("Remarks: ");
                String remarks = sc.nextLine();

                result = new Result(marks, remarks);
            } catch (SchoolDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Obtained marks must be a number");
            }
        }

        // ===== Fee =====
        while (fee == null) {
            try {
                System.out.print("Tuition Fee: ");
                double tuition = Double.parseDouble(sc.nextLine());
                System.out.print("Exam Fee: ");
                double examFee = Double.parseDouble(sc.nextLine());

                fee = new Fee(tuition, examFee);
            } catch (SchoolDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Fees must be numbers");
            }
        }

        // ===== Display Summary =====
        double averageMarks = ((double) result.getObtainedMarks() / exam.getMaxMarks()) * 100;

        System.out.println("\n=== Student Record ===");
        System.out.println("Work done by Eloi id:27131");
        System.out.println("Student: " + student.getStudentName() + " | Roll: " + student.getRollNumber());
        System.out.println("Course: " + course.getCourseName() + " | Credit Hours: " + course.getCreditHours());
        System.out.println("Exam: " + exam.getExamName() + " | Obtained Marks: " + result.getObtainedMarks());
        System.out.println("Average Marks: " + averageMarks + "%");
        System.out.println("Total Fee: " + fee.getTotalFee());
    }
}
