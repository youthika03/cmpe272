package com.sjsu.cmpe272.controller;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReservoirController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

   
    @RequestMapping(value="/test", method=RequestMethod.GET)
    public @ResponseBody String sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return "some value-> Test";
    }
    
    @RequestMapping(value="/reservoirs", method=RequestMethod.GET)
    public @ResponseBody String getReservoirs(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
    	return "no Reservoirs...";
    }

}