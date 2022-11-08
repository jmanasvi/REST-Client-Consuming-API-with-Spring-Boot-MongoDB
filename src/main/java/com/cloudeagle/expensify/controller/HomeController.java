package com.cloudeagle.expensify.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudeagle.expensify.model.Data;
import com.cloudeagle.expensify.service.PopulationService;


@RestController
public class HomeController {

	 private static final Logger logger = LogManager.getLogger(HomeController.class);
	
	@Autowired
	PopulationService populationService;
	
	ResponseEntity<Data> responseEntity;
	
	@GetMapping("/")
	 public ResponseEntity<Data> getPopulationHistory()
	{
		logger.debug("Inside getPopulatioHistory Mthod in HomeController");
		
		try {
			responseEntity = new ResponseEntity<>(populationService.getPopulation(),HttpStatus.OK);
		}
		catch(Exception ex)
		{
			logger.error(ex.getMessage());
		}
		
		return responseEntity;
	}
	
}
