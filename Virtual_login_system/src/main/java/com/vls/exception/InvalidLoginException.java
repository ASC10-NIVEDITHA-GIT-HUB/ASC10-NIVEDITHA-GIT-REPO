package com.vls.exception;

/** Thrown when login credentials are invalid. */
public class InvalidLoginException extends RuntimeException {
    public InvalidLoginException(String message) {
        super(message);
    }
}
