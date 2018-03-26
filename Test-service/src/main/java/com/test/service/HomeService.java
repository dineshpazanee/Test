package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.dao.HomeDaoAccess;

@Component
public class HomeService {
	
	@Autowired private HomeDaoAccess homeDaoAccess;
	
	public String getHomeService() {
		return homeDaoAccess.getHomeDao();
	}

}
