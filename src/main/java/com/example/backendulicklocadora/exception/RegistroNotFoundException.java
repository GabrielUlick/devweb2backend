package com.example.backendulicklocadora.exception;

public class RegistroNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public RegistroNotFoundException(String msg) {
        super(msg);
    }
}
