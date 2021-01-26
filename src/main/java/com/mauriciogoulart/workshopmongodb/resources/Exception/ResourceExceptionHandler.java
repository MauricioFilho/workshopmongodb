package com.mauriciogoulart.workshopmongodb.resources.Exception;

import java.security.Timestamp;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mauriciogoulart.workshopmongodb.services.exception.ObjectNotFindException;

@ControllerAdvice
public class ResourceExceptionHandler {
	@ExceptionHandler(ObjectNotFindException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFindException e, HttpServletRequest request){
		
		HttpStatus status = HttpStatus.NOT_FOUND;
		
		StandardError er = new StandardError(System.currentTimeMillis(), status.value(), "Não encontrado", e.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(status).body(er);
	}
	
}
