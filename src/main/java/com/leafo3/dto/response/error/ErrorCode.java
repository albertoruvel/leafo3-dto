package com.leafo3.dto.response.error;

public enum ErrorCode {
    UNKNOWN("leaf-000"),
    PERSISTENCE("leaf-001"),
    INVALID_LEAF_ID("leaf-002"),
    INVALID_REQUEST_BODY("leaf-003"),
    INVALID_REQUEST_PROPERTY("leaf-004");
    String errorCode;
    ErrorCode(String code){
        this.errorCode = code;
    }
}
