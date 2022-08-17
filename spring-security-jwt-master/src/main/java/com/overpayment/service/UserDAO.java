package com.overpayment.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.overpayment.entity.Users;

@Repository
interface UserDAO extends CrudRepository<Users, Long> {
	List<Users> findAll();
	
	Users findByUsername(String username);
	
	Users findByEmail(String email);
	
	Users findByUserId(Long id);
	
	Users save(Users user);
}