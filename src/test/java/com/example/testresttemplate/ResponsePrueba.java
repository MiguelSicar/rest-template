package com.example.testresttemplate;

public class ResponsePrueba {
    private int code;
    private String message;

    private ResponsePrueba(){};

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponsePrueba{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
