package com.venkat.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudenRestExceptionHandler {
	
	//add an exception handler using @ExceptionHanndler
	
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){
			
			//create StudentErrorResponse
			StudentErrorResponse error=new StudentErrorResponse();
			error.setStatus(HttpStatus.NOT_FOUND.value());
			error.setMessege(exc.getMessage());
			error.setTimeStamp(System.currentTimeMillis());

			
			 //return response entity
			return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
			 
		}
		
		//add another Exception handler......to catch any exception (catch all)
		
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponse> handleException(Exception exc){
			
			//create StudentErrorResponse
					StudentErrorResponse error=new StudentErrorResponse();
					error.setStatus(HttpStatus.BAD_REQUEST.value());
					error.setMessege(exc.getMessage());
					error.setTimeStamp(System.currentTimeMillis());

					
					 //return response entity
					return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
		}

}
