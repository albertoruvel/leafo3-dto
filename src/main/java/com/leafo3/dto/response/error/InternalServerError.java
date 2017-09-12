package com.leafo3.dto.response.error;

public class InternalServerError {
    private String message;
    private String date;
    private String errorCode;

    public InternalServerError(String message, String date, ErrorCode errorCode) {
        this.message = message;
        this.date = date;
        this.errorCode = errorCode.errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
