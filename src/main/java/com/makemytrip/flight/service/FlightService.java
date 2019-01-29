package com.makemytrip.flight.service;


import java.util.List;

import com.makemytrip.flight.model.Flight;
import com.makemytrip.flight.model.SearchFlight;

public interface FlightService {
	
	public List<Flight> getAllFlights(SearchFlight searchFlights) throws Exception;
	
}
