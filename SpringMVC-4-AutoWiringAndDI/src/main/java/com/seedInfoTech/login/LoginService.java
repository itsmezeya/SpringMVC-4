package com.seedInfoTech.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("seedInfoTech") && password.equals("dummy");
	}

}