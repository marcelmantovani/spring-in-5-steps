package com.in28minutes.jee;

public class UserValidationService {

	public boolean isUserValid(String name, String password) {
		
		if (name.equals("Marcel Mantovani") && password.equals("123"))
			return true;
		return false;
	}
}
