package com.wosai.shouqianba.push.exception;

public class InvalidParamsException extends CommonBsmException {

	private int code = DEFAULT_PARAMS;

	public static final int invalidOrNullParams = 40200;	// 无效参数

	public InvalidParamsException(String message) {
		super(message);
	}

	public InvalidParamsException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidParamsException(int code, String message) {
		super(message);
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}