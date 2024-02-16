package org.example.services;

import org.example.model.Cliente;
import org.example.model.ClienteBody;

import java.io.IOException;

public interface ClienteService {
    Cliente obtenerInformacionCliente(ClienteBody body) throws IOException;
}
