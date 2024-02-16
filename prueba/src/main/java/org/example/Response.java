package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response<T>{
    private String mensaje;

    public Response(String mensaje) {
        this.mensaje = mensaje;
    }
}