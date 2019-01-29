package com.makemytrip.flight.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.makemytrip.flight.model.Flight;
import com.makemytrip.flight.model.SearchFlight;

@Service
public class FlightServiceImpl implements FlightService {

	private final String url="http://flight-data-service/flight";
	
	@Inject
	private RestTemplate restTemplate;
	
	@Override
	public List<Flight> getAllFlights(SearchFlight searchFlights) {
		
		return restTemplate.getForEntity(url, List.class).getBody();
		 
	}

}
