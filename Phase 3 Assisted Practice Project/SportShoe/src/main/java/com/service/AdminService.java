package com.service;

import com.model.Admin;

public interface AdminService {

	Admin findByUsername(String username);
	void updateAdmin(String username, Admin admin);
	boolean verifyAdmin(Admin adminForm);
}
