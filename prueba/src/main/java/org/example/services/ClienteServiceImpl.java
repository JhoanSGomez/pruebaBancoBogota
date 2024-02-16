package org.example.services;

import org.example.model.Cliente;
import org.example.model.ClienteBody;
import org.example.services.exceptions.DataInvalidException;
import org.example.services.exceptions.DataNotFoundException;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ClienteServiceImpl implements ClienteService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClienteServiceImpl.class);
    private final String TIPO_DOC_ERROR = "El tipo de documento no es válido";
    private final String NUM_DOC_ERROR = "El número de documento no existe";

    @Override
    public Cliente obtenerInformacionCliente(ClienteBody body) {

        String tipoDoc = body.getTypeDocument();
        String numDoc = body.getNumberDocument();

        if (!tipoDoc.equals("C") && !tipoDoc.equals("P")) {
            LOGGER.warn("El tipo de documento no es válido: {}", body);
            throw new DataInvalidException(TIPO_DOC_ERROR);
        }
        if (!numDoc.equals("23445322")) {
            LOGGER.warn("El número de documento no existe: {}", body);
            throw new DataNotFoundException(NUM_DOC_ERROR);
        }

        Cliente cliente = new Cliente();
        cliente.setPrimerNombre("Jhoan");
        cliente.setSegundoNombre("Sebastian");
        cliente.setPrimerApellido("Gomez");
        cliente.setSegundoApellido("Torres");
        cliente.setTelefono("1234567890");
        cliente.setDireccion("Calle 123");
        cliente.setCiudadResidencia("Bogotá");

        LOGGER.info("Búsqueda exitosa");

        return cliente;
    }
}
