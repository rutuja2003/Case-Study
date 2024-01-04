package com.mypack.casestudy;
import java.time.format.DateTimeFormatter;

public class Info {
	 public void display(Student student ) {
	        System.out.println("Student Details:");
	        System.out.println("ID: " + student.getId());
	        System.out.println("Name: " + student.getName());
	        System.out.println("Date of Birth: " + student.getDateOfBirth());
	        
	    }

	    public void display(Course course) {
	        System.out.println("Course Details:");
	        System.out.println("ID: " + course.getId());
	        System.out.println("Name: " + course.getName());
	        System.out.println("Duration: " + course.getDuration());
	        System.out.println("Fees: " + course.getFees());
	        
	       
	    }
	    
	    public void display(Enroll enrollment) {
	        System.out.println("Enrollment Details:");
	        System.out.println("Student ID: " + enrollment.getStudent().getId());
	        System.out.println("Student Name: " + enrollment.getStudent().getName());
	        System.out.println("Course ID: " + enrollment.getCourse().getId());
	        System.out.println("Course Name: " + enrollment.getCourse().getName());
	        System.out.println("Enrollment Date: " + enrollment.getEnrollmentDate().format(DateTimeFormatter.ISO_DATE));
	    }

}
