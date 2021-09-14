package com.lt.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.lt.bean.Course;
import com.lt.bean.Grade;

public class ProfessorImpl implements ProfessorInterface {

	@Override
	public void viewCourse() {
		// TODO Auto-generated method stub
		Course c1 = new Course();	
		c1.setCid(1);
		c1.setName("BCS");
		Course c2 = new Course();	
		c2.setCid(2);
		c2.setName("MCS");
		Course c3 = new Course();	
		c3.setCid(3);
		c3.setName("Engineering");
		Course c4 = new Course();	
		c4.setCid(4);
		c4.setName("BCS");
		
		List<Course> list = new ArrayList<Course>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		
		Iterator itr = list.iterator();
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		while(itr.hasNext())
		{
			Course course = (Course) itr.next();
		map.put(course.getCid(), course.getName());	
		}
		System.out.println("Course ID:\tCourse Name");
		for(Map.Entry ma:map.entrySet())
		{
		System.out.println(ma.getKey()+"\t\t "+ma.getValue());
		}
		//return list;
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

	
	
	public static void main(String args[])
	{
		ProfessorImpl pi=new ProfessorImpl();
		
		pi.viewCourse();
		
	}
}

