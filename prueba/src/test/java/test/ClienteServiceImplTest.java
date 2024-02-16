package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.example.model.Cliente;
import org.example.model.ClienteBody;
import org.example.services.ClienteServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ClienteServiceImplTest {

    @Test
    public void testObtenerInformacionCliente() {
        ClienteServiceImpl clienteService = new ClienteServiceImpl();
        ClienteBody body = new ClienteBody();
        body.setTypeDocument("C");
        body.setNumberDocument("23445322");

        Cliente cliente = clienteService.obtenerInformacionCliente(body);

        assertNotNull(cliente);
        assertEquals("Jhoan", cliente.getPrimerNombre());
        assertEquals("Sebastian", cliente.getSegundoNombre());
        assertEquals("Gomez", cliente.getPrimerApellido());
        assertEquals("Torres", cliente.getSegundoApellido());
        assertEquals("1234567890", cliente.getTelefono());
        assertEquals("Calle 123", cliente.getDireccion());
        assertEquals("Bogotá", cliente.getCiudadResidencia());
    }
}

