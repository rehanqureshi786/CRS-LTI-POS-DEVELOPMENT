package com.lt.business;

import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Grade;

public class StudentImpl implements StudentInterface{

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
	public void registerCourse(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Grade> viewReport() {
		// TODO Auto-generated method stub
		return null;
	}

}
