package com.thinkbig.rest_d.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StoreSellerExceptionHandler {
	
	@ExceptionHandler(value = {StoreSellerNotFoundException.class})
	public ResponseEntity<Object> handleStoreSellerNotFoundException(
			StoreSellerNotFoundException storeSellerNotFoundException){
		
		StoreSellerException storeSellerException = new StoreSellerException(
				storeSellerNotFoundException.getMessage(),
				storeSellerNotFoundException.getCause(),
				HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(storeSellerException, HttpStatus.NOT_FOUND);
	
	}
}
