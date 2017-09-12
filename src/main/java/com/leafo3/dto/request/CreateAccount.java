package com.leafo3.dto.request;

public class CreateAccount {
    private String name;
    private String email;
    private String password;
    private String isoCode;
    private String fcmId;

    public CreateAccount() {
    }

    public CreateAccount(String name, String email, String password, String isoCode, String fcmId) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isoCode = isoCode;
        this.fcmId = fcmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getFcmId() {
        return fcmId;
    }

    public void setFcmId(String fcmId) {
        this.fcmId = fcmId;
    }
}
