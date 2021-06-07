package com.sergio.api.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{


	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Resource not find. Id" + id);
	}
}
