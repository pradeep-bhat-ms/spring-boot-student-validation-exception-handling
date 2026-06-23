package com.example.FormValidation.Exception;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Map<String , String> handleValidation(MethodArgumentNotValidException ex){
		Map<String , String> errors= new HashMap<String, String>();
		
		ex.getBindingResult().getFieldErrors().forEach(error ->{
			errors.put(error.getField(),error.getDefaultMessage());
		});
		return errors;
	}
	
	
	 @ExceptionHandler(StudentNotFoundException.class)
	    @ResponseStatus(HttpStatus.NOT_FOUND)
	    public Map<String, String> handleStudentNotFound(StudentNotFoundException ex) {

	        Map<String, String> error = new HashMap<>();
	        error.put("message", ex.getMessage());

	        return error;
	    }
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public Map<String, String> handleGeneral(Exception ex){
		 Map<String, String> error = new HashMap<>();
		 error.put("message", "Something went wrong");
		 return error;		 
	}
}
