package com.mauriciogoulart.workshopmongodb.services.exception;

public class ObjectNotFindException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFindException (String msg) {
		super(msg);
	}

}
