package com.aladin.exceptions;

public class BoardCreationException extends RuntimeException {
	public BoardCreationException(String message) {
		super(message);
	}

	public BoardCreationException(String message, Throwable cause) {
		super(message, cause);
	}
}
