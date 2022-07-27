package com.example.testresttemplate;

public class Dog {
    private String message;
    private String status;

    private Dog(){}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "message='" + message + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
