package com.lt.business;

import com.lt.bean.Course;
import com.lt.bean.GradeCard;
import com.lt.bean.Professor;
import com.lt.bean.Student;

public interface AdminInterface {

	public String login(String username,String password);
	public void addProfessor();
	public String approveStudent();
	public void addCourses(Course course);
	public boolean removeCourse(int id);
	public void generateReport();

}
