package com.mark1708.consumer;

public class MessageRequest {
    private String message;

    public MessageRequest(String message) {
        this.message = message;
    }

    public MessageRequest() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
