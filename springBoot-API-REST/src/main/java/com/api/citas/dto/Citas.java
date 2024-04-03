package com.api.citas.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author alejandro.bueno
 */
@Document(collection = "ctl_citas")
public class Citas{

    @Getter
    @Setter
    private int idCita;
    
    @Getter
    @Setter
    private String cliente;
    
    @Getter
    @Setter
    private String doctora;
    
    @Getter
    @Setter
    private String fecha;

    public Citas(int idCita, String cliente, String doctora, String fecha) {
        this.idCita = idCita;
        this.cliente = cliente;
        this.doctora = doctora;
        this.fecha = fecha;
    }
}
