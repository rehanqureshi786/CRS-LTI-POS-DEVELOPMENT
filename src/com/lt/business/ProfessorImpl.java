package com.lt.business;

import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Grade;

public class ProfessorImpl implements ProfessorInterface {

	@Override
	public List<Course> viewCourse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addGrade(Grade grade) {
		// TODO Auto-generated method stub
		
	}

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

}
