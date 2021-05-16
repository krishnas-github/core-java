package com.mycompany.multiplethrow;

public class BusinessException1 extends Exception{

    private String errorMessage;

    public BusinessException1(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
