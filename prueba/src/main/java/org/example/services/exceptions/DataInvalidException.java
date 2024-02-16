package org.example.services.exceptions;

public class DataInvalidException extends RuntimeException {

    public DataInvalidException(String message) {
        super(message);
    }
}