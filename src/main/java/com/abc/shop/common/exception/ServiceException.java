package com.abc.shop.common.exception;

public class ServiceException extends RuntimeException {
    public ServiceException() {
        super();
    }
    public ServiceException(String message) {
        super(message);
    }
    public ServiceException(Throwable cause) {
        super(cause);
    }

}
