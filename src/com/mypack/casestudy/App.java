package com.mypack.casestudy;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		scenario1();
        scenario2();
        scenario3();
        
        AppEngine appEngine = new AppEngine();

        Course javaCourse = new Course(1, "Java Programming", 12, 500.0);
        Course pythonCourse = new Course(2, "Python Programming", 10, 450.0);

        appEngine.introduce(javaCourse);
        appEngine.introduce(pythonCourse);

        Student johnDoe = new Student(1, "John Doe", "2000-01-01");
        Student janeSmith = new Student(2, "Jane Smith", "1999-05-15");

        appEngine.register(johnDoe);
        appEngine.register(janeSmith);

        appEngine.enroll(johnDoe, javaCourse);
        appEngine.enroll(janeSmith, pythonCourse);

        displayEnrollmentsInfo(appEngine.listOfEnrollments());
    }

    public static void scenario1() {
        Student student1 = new Student(1, "John Doe", "2000-01-01");
        Student student2 = new Student(2, "Jane Smith", "1999-05-15");

        Info info = new Info();
        info.display(student1);
        info.display(student2);
    }

    public static void scenario2() {
        Student[] students = new Student[2];
        students[0] = new Student(3, "Bob Johnson", "1998-08-20");
        students[1] = new Student(4, "Alice Williams", "1997-03-10");

        Info info = new Info();
        for (Student student : students) {
            info.display(student);
        }
    }

    public static void scenario3() {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[2];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume the newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Date of Birth: ");
            String dateOfBirth = scanner.nextLine();

            students[i] = new Student(id, name, dateOfBirth);
        }

        Info info = new Info();
        for (Student student : students) {
            info.display(student);
        }

	}
    private static void displayEnrollmentsInfo(Enroll[] enrollments) {
        Info info = new Info();

        System.out.println("Enrollments Information:");
        for (Enroll enrollment : enrollments) {
            info.display( enrollment);
        }
    }

}
