package com.seedInfoTech.login;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("seedInfoTech") && password.equals("dummy");
	}

}