package com.lt.business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.lt.bean.Course;
import com.lt.bean.GradeCard;
import com.lt.bean.Professor;
import com.lt.bean.Student;
import com.lt.bean.User;

public class AdminImpl implements AdminInterface {

	@Override
	public String login(String username, String password) {
		// TODO Auto-generated method stub
	
		String response="";
		User u1 = new User();
		u1.setUsername("test");
		u1.setPassword("test");
		u1.setUsertype("admin");
	
			if(username.equals(u1.getUsername()) && password.equals(u1.getPassword()))
			{
				response="Success";
			}
			else
			{
				response="Fail";
			}
			
		return response;
	}


	@Override
	public void addProfessor() {
		// TODO Auto-generated method stub
		Professor p1=new Professor();
		p1.setPid(100);
		p1.setName("Test1");
		p1.setDepartment("Computer Science");
		p1.setUsername("test1.com");
		p1.setPassword("test1@123");

		Professor p2=new Professor();
		p2.setPid(101);
		p2.setName("Test2");
		p2.setDepartment("Mathematics");
		p2.setUsername("test2.com");
		p2.setPassword("test2@123");
		
		Professor p3=new Professor();
		p1.setPid(102);
		p1.setName("Test3");
		p1.setDepartment("Electronics");
		p1.setUsername("test3.com");
		p1.setPassword("test3@123");
		
		LinkedList<Professor> list=new LinkedList<Professor>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println("Professor Added Sucessfully");
	}

	@Override
	public String approveStudent() {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		s1.setId(100);
		s1.setName("Rehan");
		s1.setDepartment("Computer Science");
		s1.setUsername("rehan.com");
		s1.setPassword("rehan123");
		
		String status="";
		
		System.out.println("Student Approval Status");
		if(s1.getName().equals("Rehan")&&s1.getDepartment().equals("Computer Science")&&s1.getUsername().equals("rehan.com")&&s1.getPassword().equals("rehan123"))
		{
			status="Approved";
		}
		else
		{
			status="Not Approved";		
		}
		
		
		return status;
	}

	Course[] course=new Course[4];
	
	@Override
	public void addCourses() {
		// TODO Auto-generated method stub
		Course c1 = new Course();	
		c1.setCid(1);
		c1.setName("Java");
		Course c2 = new Course();	
		c2.setCid(2);
		c2.setName("Theory Of Computation");
		Course c3 = new Course();	
		c3.setCid(3);
		c3.setName("HTML");
		Course c4 = new Course();	
		c4.setCid(4);
		c4.setName("Javascript");
		
		course[0]=c1;
		course[1]=c2;
		course[2]=c3;
		course[3]=c4;
		
		
		
		//Now We add that courses into a list
		List<Course> list = new ArrayList<>();
	
		for (int i = 0; i < course.length; i++) {
			list.add(course[i]);
		}
		System.out.println(list);
		
		System.out.println("Course Added Successfully");
	
	}

	@Override
	public boolean removeCourse(int id) {
		// TODO Auto-generated method stub
		boolean isDelete=false;
		for (int i = 0; i < course.length; i++) {
			if(course[i].getCid()==id)
			{
				course[i]=null;
				isDelete=true;	
			}	
		}
		System.out.println("After Delete Courses Remaining are ");
		for (int i = 0; i < course.length; i++) {
		
			if(course[i]!=null)
			{
			System.out.println(course[i].getCid()+"\t"+course[i].getName());
			}
			
		}
		return isDelete;
	}

	@Override
	public void generateReport() {
		// TODO Auto-generated method stub
		
		GradeCard gc1=new GradeCard();
		gc1.setGrade("A");
		gc1.setDepartment("Computer Science");
		gc1.setStd_id(100);
		gc1.setStd_name("Rehan");
		gc1.setRemarks("Pass");
		
		GradeCard gc2=new GradeCard();
		gc2.setGrade("E");
		gc2.setDepartment("IT Science");
		gc2.setStd_id(101);
		gc2.setStd_name("Tushar");
		gc2.setRemarks("Fail");
		
		List<GradeCard> list = new ArrayList<>();
		list.add(gc1);
		list.add(gc2);
		
		Iterator itr = list.iterator();
		System.out.println("----------------Grade Card Report Generated-------------------");
		while(itr.hasNext())
		{
			GradeCard grade=(GradeCard)itr.next();
			System.out.println("Student Id: "+grade.getStd_id());
			System.out.println("Student Name: "+grade.getStd_name());
			System.out.println("Department :"+grade.getDepartment());
			System.out.println("Grade :"+grade.getGrade());
			System.out.println("Remarks: "+grade.getRemarks());
			System.out.println("---------------------------------------");
			
		}
	}
	
	public static void main(String[] args) {
		
		AdminImpl prof=new AdminImpl();
		
		//  Login Functionality 
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Username : "); String username=sc.next();
		  System.out.println("Enter Password : "); String password=sc.next();
		  
		  String response=prof.login(username, password);
		 System.out.println(response); if(response.equals("Success")) {
		  System.out.println("Login Successfully"); } else {
		  System.out.println("Login Failed Try Again"); }
		 
		 //Call Add Professor Method 
		prof.addProfessor();
		//call generateReport of Grade Card
		prof.generateReport();
		//This is Student Approval Method
		System.out.println(prof.approveStudent());
		
		//This is for AddCourses 
		prof.addCourses();
		
		//This is to remove Course by id
		System.out.println("Enter Course Id: ");
		int id =sc.nextInt();
		System.out.println(prof.removeCourse(1));
		
		
	}

	
}
