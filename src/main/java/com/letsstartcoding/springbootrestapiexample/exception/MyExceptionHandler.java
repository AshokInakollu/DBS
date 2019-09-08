package com.letsstartcoding.springbootrestapiexample.exception;

import java.nio.file.AccessDeniedException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {

	/*
	 * @RequestMapping(produces = "application/json")
	 * 
	 * @ExceptionHandler(AccessDeniedException.class)
	 * 
	 * @ResponseStatus(value = "403") public
	 * handleAuthorizationException(AccessDeniedException ex) { // build a response
	 * body out of ex, and return that }
	 */
}
