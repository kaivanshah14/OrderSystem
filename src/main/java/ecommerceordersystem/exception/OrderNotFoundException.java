package ecommerceordersystem.exception;

public class OrderNotFoundException extends RuntimeException{
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
