package com.sjsu.cmpe272;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sjsu.cmpe272.entity.CalReservoir;
import com.sjsu.cmpe272.fetcher.ReservoirFetcher;
import com.sjsu.cmpe272.svc.MongoSvc;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Main implements CommandLineRunner {

	@Autowired
	MongoSvc mongoSvc;

	@Autowired
	ReservoirFetcher reservoirFetcher;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Main.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		List<CalReservoir> allReservoirs = reservoirFetcher.getAllReservoirs();
		mongoSvc.insert(allReservoirs);
		// Reservoir r = mongoSvc.findReservoirByName("SHASTA DAM (USBR)");
		// System.out.println(r);
	}
}
