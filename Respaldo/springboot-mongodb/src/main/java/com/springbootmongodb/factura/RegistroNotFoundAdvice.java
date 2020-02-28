package com.springbootmongodb.factura;

import com.springbootmongodb.factura.RegistroNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class RegistroNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(RegistroNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(RegistroNotFoundException ex) {
        return ex.getMessage();
    }
}
