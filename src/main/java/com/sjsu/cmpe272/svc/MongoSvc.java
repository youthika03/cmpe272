package com.sjsu.cmpe272.svc;

import java.util.List;

import com.sjsu.cmpe272.entity.CalReservoir;

public interface MongoSvc {

	public void insert(List<CalReservoir> documents);

	public CalReservoir findReservoirByName(String name);
}
