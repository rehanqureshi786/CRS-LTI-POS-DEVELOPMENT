package com.lt.business;

import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Grade;

public interface ProfessorInterface {

	public void viewCourse();
	public void addGrade(Grade grade);
	public String login(String username,String password);
	
	
}
