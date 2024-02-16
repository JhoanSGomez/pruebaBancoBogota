package org.example.controller;

import org.example.Response;
import org.example.services.exceptions.DataInvalidException;
import org.example.services.exceptions.DataNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<Response<String>> dataNotFound(DataNotFoundException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body( new Response<>(e.getMessage()) );
    }

    @ExceptionHandler(DataInvalidException.class)
    public ResponseEntity<Response<String>> dataInvalid(DataInvalidException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body( new Response<>(e.getMessage()) );
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response<String>> catchException(Exception e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body( new Response<>(e.getMessage()) );
    }

}
