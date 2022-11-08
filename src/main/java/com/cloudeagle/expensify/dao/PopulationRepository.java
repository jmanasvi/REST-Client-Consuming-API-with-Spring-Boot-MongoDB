package com.cloudeagle.expensify.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cloudeagle.expensify.model.Population;

@Repository
public interface PopulationRepository extends MongoRepository<Population, Integer> {

}
