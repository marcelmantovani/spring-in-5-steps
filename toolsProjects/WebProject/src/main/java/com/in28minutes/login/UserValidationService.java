package com.in28minutes.login;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {

	public boolean isUserValid(String name, String password) {
		
		if (name.equals("Marcel Mantovani") && password.equals("123"))
			return true;
		return false;
	}
}
