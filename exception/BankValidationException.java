package com.wipro.bank.exception;

public class BankValidationException extends Exception {

    private static final long serialVersionUID = 1L;

    public BankValidationException(String error) {
        System.out.println(error);
    }
}