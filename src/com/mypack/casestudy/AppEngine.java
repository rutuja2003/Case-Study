package com.mypack.casestudy;
import java.util.ArrayList;
import java.util.List;

public class AppEngine {
	
	 private List<Student> students;
	    private List<Course> courses;
	    private List<Enroll> enrollments;

	    public AppEngine() {
	        this.students = new ArrayList<>();
	        this.courses = new ArrayList<>();
	        this.enrollments = new ArrayList<>();
	    }

	    public void introduce(Course course) {
	        // Implement the method to introduce a course
	    }

	    public void register(Student student) {
	        students.add(student);
	    }

	    public Student[] listOfStudents() {
	        return students.toArray(new Student[0]);
	    }

	    public Course[] listOfCourses() {
	        return courses.toArray(new Course[0]);
	    }

	    public void enroll(Student student, Course course) {
	        Enroll enrollment = new Enroll(student, course, java.time.LocalDate.now());
	        enrollments.add(enrollment);
	    }

	    public Enroll[] listOfEnrollments() {
	        return enrollments.toArray(new Enroll[0]);

}
}
