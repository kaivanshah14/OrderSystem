package ecommerceordersystem.exception;

import java.util.NoSuchElementException;

public class OrderNotFoundException extends NoSuchElementException{
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public OrderNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	
}
