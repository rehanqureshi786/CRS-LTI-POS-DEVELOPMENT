package com.lt.business;

import com.lt.bean.User;

public class UserImpl implements UserInterface {

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String login(String username, String password) {
		// TODO Auto-generated method stub
		String response = "Fail";

		if (username.equals("admin") && password.equals("admin")) {
			response = "Success";
		}

		return response;
	}

}
