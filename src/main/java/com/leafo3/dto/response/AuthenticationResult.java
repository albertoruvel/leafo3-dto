package com.leafo3.dto.response;

public class AuthenticationResult {
    private String authenticationToken;
    private String date;
    private boolean success;

    public AuthenticationResult() {
    }

    public AuthenticationResult(String authenticationToken, String date, boolean success) {
        this.authenticationToken = authenticationToken;
        this.date = date;
        this.success = success;
    }

    public String getAuthenticationToken() {
        return authenticationToken;
    }

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
