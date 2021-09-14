package com.lt.business;

import com.lt.bean.Course;
import com.lt.bean.GradeCard;
import com.lt.bean.Professor;
import com.lt.bean.Student;

public class AdminImpl implements AdminInterface {

	@Override
	public String login(String username, String password) {
		// TODO Auto-generated method stub
		String response="Fail";
		
		if(username.equals("admin") && password.equals("admin"))
		{
			response="Success";
		}
		
		return response;
	}


	@Override
	public void addProfessor(Professor prof) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void approveStudent(Student std) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCourses(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean removeCourse(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void generateReport(GradeCard grade) {
		// TODO Auto-generated method stub
		
	}

	
}
