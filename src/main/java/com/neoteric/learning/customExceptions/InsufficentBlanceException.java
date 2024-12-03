package com.neoteric.learning.customExceptions;

public class InsufficentBlanceException extends Exception {
    private String code;

    public InsufficentBlanceException(String code,String message,Throwable throwable){
        super(message,throwable);
        this.code =code;
    }

    public InsufficentBlanceException(String code,String message){
        super(message);
        this.code =code;
    }
    public String getCode() {
        return code;
    }
}
