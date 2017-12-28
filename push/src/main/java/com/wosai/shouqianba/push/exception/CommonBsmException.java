package com.wosai.shouqianba.push.exception;

public class CommonBsmException extends RuntimeException {

	public static final int DEFAULT_PARAMS = 40100;

	public int getCode() {
		return DEFAULT_PARAMS;
	}

	CommonBsmException(String message) {
		super(message);
	}

	CommonBsmException(String message, Throwable cause) {
		super(message, cause);
	}

}
