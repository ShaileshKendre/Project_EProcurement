package com.jbk.EProc.Vehicle.Service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)

public class LoginException extends RuntimeException {
	@Override
	public String getMessage() {
		
		return "enter correct username and password";
	}
	

}
