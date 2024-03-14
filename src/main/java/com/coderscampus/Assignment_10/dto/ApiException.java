package com.coderscampus.Assignment_10.dto;

public class ApiException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public ApiException(String message, Throwable cause) {
        super(message, cause);
    }
}