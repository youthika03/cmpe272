package com.sjsu.cmpe272.svc;

import java.util.List;

import com.sjsu.cmpe272.entity.Reservoir;

public interface MongoSvc {
	
	public void insert(List<Reservoir> documents);
	public Reservoir findReservoirByName(String name);
}
