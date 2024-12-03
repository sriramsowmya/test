package com.neoteric.learning.customExceptions;

public enum TransferEnum {
    INSUFFICIENT_BALANCE("TS_1000","Insufficient balance in your account %s");

    private String code;

    private String label;
    TransferEnum(String code,String label){
        this.code = code;
        this.label = label;

    }


    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }
}
