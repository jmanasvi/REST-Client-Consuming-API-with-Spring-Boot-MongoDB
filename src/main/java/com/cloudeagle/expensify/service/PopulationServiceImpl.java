package com.cloudeagle.expensify.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.cloudeagle.expensify.constants.Constants;
import com.cloudeagle.expensify.controller.HomeController;
import com.cloudeagle.expensify.dao.PopulationDao;
import com.cloudeagle.expensify.model.Data;

@Service
public class PopulationServiceImpl implements PopulationService {
	
	Logger logger = LogManager.getLogger(PopulationServiceImpl.class);
	private Data data;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private PopulationDao populationDao;

	@Override
	public Data getPopulation() {
		
		logger.debug("Inside getPopulation Method in PopulationServiceImpl");
		
		try {
			data = restTemplate.getForObject(Constants.url, Data.class);
			populationDao.saveData(data);
		}
		catch(Exception ex)
		{
			logger.error(ex.getMessage());
		}
		return data;
	}

}
