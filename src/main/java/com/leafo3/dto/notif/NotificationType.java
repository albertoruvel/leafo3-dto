package com.leafo3.dto.notif;

public enum NotificationType {
    FILE_UPLOAD("file_upload");
    String value;
    NotificationType(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
