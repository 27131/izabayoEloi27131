package id27131.q2;

import java.util.Scanner;

public final class SchoolRecord {
    public static void main(String[] args) throws SchoolDataException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWork done by Eloi id:27131\n"); // Entity
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
            } catch (SchoolDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        // School
        School school = null;
        while (school == null) {
            try {
                System.out.print("School Name: ");
                String schoolName = sc.nextLine();
                System.out.print("School Address: ");
                String schoolAddress = sc.nextLine();
                System.out.print("School Phone (10 digits): ");
                String schoolPhone = sc.nextLine();
                System.out.print("School Email: ");
                String schoolEmail = sc.nextLine();

                school = new School(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                    schoolName, schoolAddress, schoolPhone, schoolEmail);
            } catch (SchoolDataException e) {
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
                                            school.getSchoolName(), school.getAddress(), school.getPhoneNumber(), school.getEmail(),
                                            departmentName, departmentCode);
            } catch (SchoolDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        // Teacher
        Teacher teacher = null;
        while (teacher == null) {
            try {
                System.out.print("Teacher Name: ");
                String teacherName = sc.nextLine();
                System.out.print("Subject: ");
                String subject = sc.nextLine();
                System.out.print("Teacher Email: ");
                String teacherEmail = sc.nextLine();
                System.out.print("Teacher Phone (10 digits): ");
                String teacherPhone = sc.nextLine();

                teacher = new Teacher(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                      school.getSchoolName(), school.getAddress(), school.getPhoneNumber(), school.getEmail(),
                                      department.getDepartmentName(), department.getDepartmentCode(),
                                      teacherName, subject, teacherEmail, teacherPhone);
            } catch (SchoolDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        // Student
        Student student = null;
        while (student == null) {
            try {
                System.out.print("Student Name: ");
                String studentName = sc.nextLine();
                System.out.print("Roll Number: ");
                int rollNumber = Integer.parseInt(sc.nextLine());
                System.out.print("Grade: ");
                String grade = sc.nextLine();
                System.out.print("Contact Number (10 digits): ");
                String studentContact = sc.nextLine();

                student = new Student(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                      school.getSchoolName(), school.getAddress(), school.getPhoneNumber(), school.getEmail(),
                                      department.getDepartmentName(), department.getDepartmentCode(),
                                      teacher.getTeacherName(), teacher.getSubject(), teacher.getTeacherEmail(), teacher.getPhone(),
                                      studentName, rollNumber, grade, studentContact);
            } catch (NumberFormatException e) {
                System.out.println("Roll number must be a number. Please try again.");
            } catch (SchoolDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        // Course
        Course course = null;
        while (course == null) {
            try {
                System.out.print("Course Name: ");
                String courseName = sc.nextLine();
                System.out.print("Course Code: ");
                String courseCode = sc.nextLine();
                System.out.print("Credit Hours: ");
                int creditHours = Integer.parseInt(sc.nextLine());

                course = new Course(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                    school.getSchoolName(), school.getAddress(), school.getPhoneNumber(), school.getEmail(),
                                    department.getDepartmentName(), department.getDepartmentCode(),
                                    teacher.getTeacherName(), teacher.getSubject(), teacher.getTeacherEmail(), teacher.getPhone(),
                                    student.getStudentName(), student.getRollNumber(), student.getGrade(), student.getContactNumber(),
                                    courseName, courseCode, creditHours);
            } catch (NumberFormatException e) {
                System.out.println("Credit hours must be a number. Please try again.");
            } catch (SchoolDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        // Exam
        Exam exam = null;
        while (exam == null) {
            try {
                System.out.print("Exam Name: ");
                String examName = sc.nextLine();
                System.out.print("Max Marks: ");
                int maxMarks = Integer.parseInt(sc.nextLine());
                System.out.print("Exam Date: ");
                String examDate = sc.nextLine();

                exam = new Exam(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                school.getSchoolName(), school.getAddress(), school.getPhoneNumber(), school.getEmail(),
                                department.getDepartmentName(), department.getDepartmentCode(),
                                teacher.getTeacherName(), teacher.getSubject(), teacher.getTeacherEmail(), teacher.getPhone(),
                                student.getStudentName(), student.getRollNumber(), student.getGrade(), student.getContactNumber(),
                                course.getCourseName(), course.getCourseCode(), course.getCreditHours(),
                                examName, maxMarks, examDate);
            } catch (NumberFormatException e) {
                System.out.println("Max marks must be a number. Please try again.");
            } catch (SchoolDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        // Result
        Result result = null;
        while (result == null) {
            try {
                System.out.print("Obtained Marks: ");
                int obtainedMarks = Integer.parseInt(sc.nextLine());
                System.out.print("Remarks: ");
                String remarks = sc.nextLine();

                result = new Result(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                                    school.getSchoolName(), school.getAddress(), school.getPhoneNumber(), school.getEmail(),
                                    department.getDepartmentName(), department.getDepartmentCode(),
                                    teacher.getTeacherName(), teacher.getSubject(), teacher.getTeacherEmail(), teacher.getPhone(),
                                    student.getStudentName(), student.getRollNumber(), student.getGrade(), student.getContactNumber(),
                                    course.getCourseName(), course.getCourseCode(), course.getCreditHours(),
                                    exam.getExamName(), exam.getMaxMarks(), exam.getExamDate(),
                                    obtainedMarks, remarks);
            } catch (NumberFormatException e) {
                System.out.println("Obtained marks must be a number. Please try again.");
            } catch (SchoolDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        // Fee
        Fee fee = null;
        while (fee == null) {
            try {
                System.out.print("Tuition Fee: ");
                double tuitionFee = Double.parseDouble(sc.nextLine());
                System.out.print("Exam Fee: ");
                double examFee = Double.parseDouble(sc.nextLine());

                fee = new Fee(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                              school.getSchoolName(), school.getAddress(), school.getPhoneNumber(), school.getEmail(),
                              department.getDepartmentName(), department.getDepartmentCode(),
                              teacher.getTeacherName(), teacher.getSubject(), teacher.getTeacherEmail(), teacher.getPhone(),
                              student.getStudentName(), student.getRollNumber(), student.getGrade(), student.getContactNumber(),
                              course.getCourseName(), course.getCourseCode(), course.getCreditHours(),
                              exam.getExamName(), exam.getMaxMarks(), exam.getExamDate(),
                              result.getObtainedMarks(), result.getRemarks(),
                              tuitionFee, examFee, tuitionFee + examFee);
            } catch (NumberFormatException e) {
                System.out.println("Fees must be a number. Please try again.");
            } catch (SchoolDataException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        }

        // Display
        System.out.println("\nQ2 done by Eloi id:27131");
        System.out.println("\n=== Final Student Record ===");
        System.out.println("\nEntity Details");
        System.out.println("ID: " + entity.getId());
        System.out.println("Created Date: " + entity.getCreatedDate());
        System.out.println("Updated Date: " + entity.getUpdatedDate());

        System.out.println("\nSchool Details");
        System.out.println("School Name: " + school.getSchoolName());
        System.out.println("Address: " + school.getAddress());
        System.out.println("Phone: " + school.getPhoneNumber());
        System.out.println("Email: " + school.getEmail());

        System.out.println("\nDepartment Details");
        System.out.println("Department Name: " + department.getDepartmentName());
        System.out.println("Department Code: " + department.getDepartmentCode());

        System.out.println("\nTeacher Details");
        System.out.println("Teacher Name: " + teacher.getTeacherName());
        System.out.println("Subject: " + teacher.getSubject());
        System.out.println("Teacher Email: " + teacher.getTeacherEmail());
        System.out.println("Teacher Phone: " + teacher.getPhone());

        System.out.println("\nStudent Details");
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Contact: " + student.getContactNumber());

        System.out.println("\nCourse Details");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Credit Hours: " + course.getCreditHours());

        System.out.println("\nExam Details");
        System.out.println("Exam Name: " + exam.getExamName());
        System.out.println("Max Marks: " + exam.getMaxMarks());
        System.out.println("Exam Date: " + exam.getExamDate());

        System.out.println("\nResult Details");
        System.out.println("Obtained Marks: " + result.getObtainedMarks());
        System.out.println("Remarks: " + result.getRemarks());
        System.out.println("Average Marks: " + result.calculateAverageMarks());

        System.out.println("\nFee Details");
        System.out.println("Tuition Fee: " + fee.getTuitionFee());
        System.out.println("Exam Fee: " + fee.getExamFee());
        System.out.println("Total Fee: " + fee.getTotalFee());
    }
}
