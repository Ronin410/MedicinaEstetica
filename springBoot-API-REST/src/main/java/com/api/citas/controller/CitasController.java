package com.api.citas.controller;

import com.api.citas.dto.Citas;
import com.api.citas.entities.Respuesta;
import com.api.citas.service.CitasService;
import com.api.citas.util.Meta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/citas")
public class CitasController {
    
    @Autowired
    CitasService citasService;
    
    private final Meta metaOk = new Meta(UUID.randomUUID().toString(), "OK", 200);

    @GetMapping("/consultar/todos")
    public Respuesta ConsultarCitas(){
        return new Respuesta(metaOk,citasService.ConsultarCitas());
    }
    
    @GetMapping("/consultar/cita")
    public Respuesta ConsultarCita(@RequestParam int id){
        return new Respuesta(metaOk,citasService.ConsultarCita(id));
    }
    
    @GetMapping("/consultar/cita/nombre")
    public Respuesta ConsultarCitaNombre(@RequestParam String nombre){
        return new Respuesta(metaOk,citasService.ConsultarCitaNombre(nombre));
    }
    
    @GetMapping("/agregar")
    public Respuesta AgregarCita(@RequestBody Citas cita){
        return new Respuesta(metaOk,citasService.AgregarCita(cita));
    }
}
