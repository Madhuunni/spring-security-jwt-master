package com.overpayment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.overpayment.entity.Users;

@Service
public class OPUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDAO userDao;
	

	public List<Users> findAllUsers() {
		return userDao.findAll();
	}


	public Users findByUserName(String userName) {
		return userDao.findByUsername(userName);
	}
	
	public Users findByEmail(String emailId) {
		return userDao.findByEmail(emailId);
	}


	public Users save(Users user) {
		return userDao.save(user);
	}
	
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    	Users users =  userDao.findByEmail(userName);
    	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    	String encodedPassword = passwordEncoder.encode(users.getPassword());
    	
        return new User(users.getEmail(), encodedPassword,
                new ArrayList<>());
    }
}