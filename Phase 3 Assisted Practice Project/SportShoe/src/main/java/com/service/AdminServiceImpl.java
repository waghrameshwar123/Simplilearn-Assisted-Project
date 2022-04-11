package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Admin;
import com.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public Admin findByUsername(String username) {
		return adminRepository.findByUsername(username);
	}

	@Override
	public void updateAdmin(String username, Admin admin) {
		Admin tempAdmin = findByUsername(username);
		tempAdmin.setPassword(admin.getPassword());
		if(tempAdmin != null)
		{
			adminRepository.save(tempAdmin);
		}
	}

	@Override
	public boolean verifyAdmin(Admin admin) {
		Admin admindb = findByUsername(admin.getUsername());
		if((admindb != null) && (admindb.getPassword().equals(admin.getPassword())))
		{
			return true;
		}
		
		return false;
	}

}
