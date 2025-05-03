package com.thinkbig.rest_d.exception;

public class StoreSellerNotFoundException extends RuntimeException{

	
	public StoreSellerNotFoundException(String message) {
		super(message);
		
	}
	
	public StoreSellerNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

}
