package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class ClienteBody {
    @JsonProperty("tipoDocumento")
    private String typeDocument;
    @JsonProperty("numeroDocumento")
    private String numberDocument;

    public String getTypeDocument() {
        return typeDocument;
    }

    public String getNumberDocument() {
        return numberDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public void setNumberDocument(String numberDocument) {
        this.numberDocument = numberDocument;
    }
}
