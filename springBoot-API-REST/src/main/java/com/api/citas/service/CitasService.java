package com.api.citas.service;

import com.api.citas.dto.Citas;
import com.api.citas.repository.CitasRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alejandro.bueno
 */
@Service
public class CitasService {
    
    @Autowired
    CitasRepository citasRepository;
        
    public List<Citas> ConsultarCitas(){
        List<Citas> citas = citasRepository.findAll();
        return citas;
    }
    
    public Optional<Citas> ConsultarCita(int id){
        Optional<Citas> cita = citasRepository.findByIdCita(id);
        return cita;
    }
    
    public List<Citas> ConsultarCitaNombre(String cliente){
        List<Citas> cita = citasRepository.findByClienteContaining(cliente);
        return cita;
    }
    
    public boolean AgregarCita(Citas cita){
        citasRepository.insert(cita);
        return true;
    }
 
 
}
