package com.lt.business;

import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Grade;

public interface StudentInterface {

	public String login(String username,String password);
	public void registerCourse(Course course);
	public List<Grade> viewReport();
	}
