package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.HomeService;

@RestController
public class HomeController {
	
	
	@Autowired private HomeService homeService;
	
	@RequestMapping("/")
	public String getTest() {
		return homeService.getHomeService();
	}

}
