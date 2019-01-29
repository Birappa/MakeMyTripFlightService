package com.makemytrip.flight.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.makemytrip.flight.model.ApiResponse;

//ControllerErrorHandler class handle all the exception for the UserController Rest Service
@ControllerAdvice
public class ControllerErrorHandler {

	@ExceptionHandler(FlightNotFoundException.class)
	public ApiResponse<Object> handleFlightNotFoundException(FlightNotFoundException exception) {
		
		//ErrorResponse errorResponse=new ErrorResponse(new Date(),HttpStatus.NOT_FOUND.value(),exception.getMessage());
		return new ApiResponse<>(HttpStatus.NOT_FOUND.value(),exception.getMessage(),null);
	}
	
	@ExceptionHandler(Exception.class)
	public ApiResponse<Object> handleAllExceptions(Exception exception) {
		
		/*ErrorResponse errorResponse=new ErrorResponse(new Date(),HttpStatus.INTERNAL_SERVER_ERROR.value(),"Internal Server Error");
		return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);*/
		return new ApiResponse<>(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Internal Server Error",null);
	}
	
}
