package com.wosai.shouqianba.push.exception;

public class PushErrorException extends CommonBsmException {
	public PushErrorException(String message) {
		super(message);
	}

	public PushErrorException(String message, Throwable cause) {
		super(message, cause);
	}
}
