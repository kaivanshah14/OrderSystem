package ecommerceordersystem.exception;

import java.util.NoSuchElementException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;

@ControllerAdvice
public class CustomExceptionHandler extends DefaultHandlerExceptionResolver{
	@ExceptionHandler(value=OrderNotFoundException.class)
	public ResponseEntity<Object> exception(OrderNotFoundException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=IllegalArgumentException.class)
	public ResponseEntity<Object> exception(IllegalArgumentException e){
		e.printStackTrace();
		return new ResponseEntity<>("Enter the required arguments"+e.getLocalizedMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value=NoSuchElementException.class)
	public ResponseEntity<Object> exception(NoSuchElementException e){
		return new ResponseEntity<>("Mentioned Order ID doesn't exist",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value=EmptyResultDataAccessException.class)
	public ResponseEntity<Object> exception(EmptyResultDataAccessException e){
		return new ResponseEntity<>("Mentioned Order ID doesn't exist",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
