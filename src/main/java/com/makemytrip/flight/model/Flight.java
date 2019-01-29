package com.makemytrip.flight.model;

import java.util.Date;

public class Flight {

	private long flightId;
	private String flightName;
	private String source;
	private String destination;
	private Date arrival;
	private Date departure;
	private double price;
	
	public Flight(String flightName, String source, String destination, Date arrival, Date departure, double price) {
		super();
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.arrival = arrival;
		this.departure = departure;
		this.price = price;
	}
	public Flight(long flightId, String flightName, String source, String destination, Date arrival, Date departure,
			double price) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.arrival = arrival;
		this.departure = departure;
		this.price = price;
	}
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getArrival() {
		return arrival;
	}
	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}
	public Date getDeparture() {
		return departure;
	}
	public void setDeparture(Date departure) {
		this.departure = departure;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
