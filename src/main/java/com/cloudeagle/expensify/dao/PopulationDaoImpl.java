package com.cloudeagle.expensify.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cloudeagle.expensify.model.Data;
import com.cloudeagle.expensify.model.Population;
import com.cloudeagle.expensify.service.PopulationServiceImpl;

@Repository
public class PopulationDaoImpl implements PopulationDao {

	Logger logger = LogManager.getLogger(PopulationDaoImpl.class);

	@Autowired
	PopulationRepository populationRepository;

	Population population[];

	public void saveData(Data data) {
		logger.debug("Inside saveData method in PopulationDaoImple class");

		try {
			population = data.getData();
			for (Population entry : population) {
				this.populationRepository.save(entry);
			}
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}

	}

}
