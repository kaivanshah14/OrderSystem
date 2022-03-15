package ecommerceordersystem.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class ErrorDetails {
	private java.util.Date date;
	private int error_code;
	private HttpStatus error;
	private String message;
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public int getError_code() {
		return error_code;
	}
	public void setError_code(int error_code) {
		this.error_code = error_code;
	}
	public HttpStatus getError() {
		return error;
	}
	public void setError(HttpStatus error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ErrorDetails(Date date, int error_code, HttpStatus error, String message) {
		super();
		this.date = date;
		this.error_code = error_code;
		this.error = error;
		this.message = message;
	}

	
	
}
