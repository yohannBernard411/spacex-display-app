package com.formation.capsule.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.formation.capsule.dao.InfoAPIDAO;
import com.formation.capsule.models.Info;


@Repository
public class InfoAPIDAOImpl implements InfoAPIDAO{
	
	private static final String URL_API_OPEN_DATA = "https://api.spacexdata.com/v3/info";

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public Info getInfos() {
		return restTemplate.getForObject(URL_API_OPEN_DATA, Info.class);
	}


}