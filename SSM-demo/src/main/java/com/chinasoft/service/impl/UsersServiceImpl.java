package com.chinasoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.mapper.UsersMapper;
import com.chinasoft.pojo.Users;
import com.chinasoft.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersMapper um;
	
	public UsersMapper getUm() {
		return um;
	}

	public void setUm(UsersMapper um) {
		this.um = um;
	}

	@Override
	public Users checkLogin(String username, String password) {
		// TODO Auto-generated method stub
		return um.selectByUsernameAndPassword(username, password);
	}

}
