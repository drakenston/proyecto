package com.springbootmongodb.factura;

public class RegistroNotFoundException extends RuntimeException {

    RegistroNotFoundException(String id) {
        super("Could not find registro " + id);
    }
}
