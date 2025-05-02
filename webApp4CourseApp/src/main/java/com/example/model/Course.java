package com.example.model;

public class Course {

	private String CourseId;
	private String CourseName;
	private double CoursePrice;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String courseId, String courseName, double coursePrice) {
		super();
		CourseId = courseId;
		CourseName = courseName;
		CoursePrice = coursePrice;
	}
	public String getCourseId() {
		return CourseId;
	}
	public void setCourseId(String courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public double getCoursePrice() {
		return CoursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		CoursePrice = coursePrice;
	}
	
	
	
	
}
