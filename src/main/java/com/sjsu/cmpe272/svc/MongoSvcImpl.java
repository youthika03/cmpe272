package com.sjsu.cmpe272.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.sjsu.cmpe272.entity.Reservoir;

@Component
public class MongoSvcImpl implements MongoSvc {
	@Autowired
	MongoOperations mongoOps;

	@Override
	public void insert(List<Reservoir> documents) {
		mongoOps.insertAll(documents);
	}

	@Override
	public Reservoir findReservoirByName(String name) {
		
		Criteria criteria = new Criteria("name");
		criteria.in(name);
		Query query = new Query(criteria);
		Reservoir reservoir = mongoOps.findOne(query, Reservoir.class);
		return reservoir;
	}

	
}
