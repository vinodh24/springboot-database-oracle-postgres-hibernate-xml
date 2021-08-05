package com.vinodh.service;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vinodh.user.model.User;

@Service
public class UserDetailService {

	@Autowired
	private SessionFactory oracleSessionFactory;

	@Transactional("oracletransactionManager")
	public String insertUserInfo(User user) {
		user.setCreateDate(new Date());
		Long userId = (Long) oracleSessionFactory.getCurrentSession().save(user);
		return "User information saved successfully with user_ID " + userId;
	}

}
