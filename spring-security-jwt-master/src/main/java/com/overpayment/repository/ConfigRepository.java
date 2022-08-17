package com.overpayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.overpayment.entity.PageConfig;

@Repository
public interface ConfigRepository extends JpaRepository<PageConfig, String> {

	
}
