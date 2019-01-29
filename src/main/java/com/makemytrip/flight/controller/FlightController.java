package com.makemytrip.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.makemytrip.flight.exception.FlightNotFoundException;
import com.makemytrip.flight.model.ApiResponse;
import com.makemytrip.flight.model.Flight;
import com.makemytrip.flight.model.SearchFlight;
import com.makemytrip.flight.service.FlightService;

@RestController
public class FlightController {

	@Autowired
	private FlightService flightService;
	
	@PostMapping("/flight")
	public ApiResponse<List<Flight>> getAllFlights(@RequestBody SearchFlight searchFlights){
		
		try {
		
			return new ApiResponse<>(HttpStatus.OK.value(), "Flight List", flightService.getAllFlights(searchFlights));
		} catch (Exception e) {
		
			throw new FlightNotFoundException("No flights availables for this route");
		}
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		
		return new RestTemplate();
	}
}
