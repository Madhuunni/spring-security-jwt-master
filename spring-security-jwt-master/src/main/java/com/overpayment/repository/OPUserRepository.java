package com.overpayment.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.overpayment.entity.Users;

@Repository
public interface OPUserRepository extends JpaRepository<Users, Integer> {

		@Query("select u from Users u where u.email like %?%1 and u.username like %?%2")
		Page<Users> findByEmailAndName(String email,String username, Pageable pageable);
		
		
		Users findByEmail(String email);
}
