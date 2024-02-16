package org.example.controller;

import org.example.model.ClienteBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.example.services.ClienteService;

import java.io.IOException;

@RestController
public class ClienteController implements Cliente {

  private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    @Override
    public ResponseEntity<?> obtenerInformacionCliente(@RequestBody ClienteBody body) throws IOException {
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.obtenerInformacionCliente(body));
    }

}
