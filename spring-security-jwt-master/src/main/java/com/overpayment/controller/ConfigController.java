package com.overpayment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.overpayment.entity.PageConfig;
import com.overpayment.repository.ConfigRepository;

@RestController
public class ConfigController {
	
	@Autowired
	private ConfigRepository configRepository;
	
	
	@GetMapping("/config")
	public PageConfig getUsers(@RequestParam(name = "pageId") String pageId){
		return configRepository.findById(pageId).get();
	}
	
	
}
