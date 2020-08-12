package com.ocsc.poc.ulti;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class LoginException extends RuntimeException {

	public LoginException(String exceptionMsg) {
		super(exceptionMsg);
	}
}
