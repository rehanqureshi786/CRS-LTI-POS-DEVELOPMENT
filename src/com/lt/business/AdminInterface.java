package com.lt.business;

public interface AdminInterface {

	public String login(String username,String password);
	public void addProfessor();
	public String approveStudent();
	public void addCourses();
	public boolean removeCourse(int id);
	public void generateReport();

}
