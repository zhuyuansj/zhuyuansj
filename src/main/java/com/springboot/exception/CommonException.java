package com.springboot.exception;


import com.springboot.Utils.ResponseCode;

public class CommonException extends Exception {
    private ResponseCode responseCode;

    /**
     * Source Throwable, message, status code and info about the cause
     */
    public CommonException(Throwable throwable, ResponseCode responseCode) {
        super(responseCode.getMesg(), throwable);
        this.responseCode = responseCode;
    }

    /**
     * error message, status code and info about the cause
     */
    public CommonException(ResponseCode responseCode) {
        super(responseCode.getMesg());
        this.responseCode = responseCode;
    }

    public ResponseCode getResponseCode() {
        return responseCode;
    }
}
