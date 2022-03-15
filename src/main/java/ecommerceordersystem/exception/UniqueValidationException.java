package ecommerceordersystem.exception;

public class UniqueValidationException extends RuntimeException{
	String message;

	public UniqueValidationException(String message) {
		super();
		this.message = message;
	}
}
