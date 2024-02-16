package org.example.controller;

import org.example.model.ClienteBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

public interface Cliente {

    @RequestMapping(value = "/cliente",
            produces = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<?> obtenerInformacionCliente(@RequestBody ClienteBody body) throws IOException;
}
