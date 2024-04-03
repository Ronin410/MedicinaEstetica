package com.api.citas.repository;

import com.api.citas.dto.Citas;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author alejandro.bueno
 */
public interface CitasRepository extends MongoRepository<Citas, String> {

    public List<Citas> findByCliente(String cliente);

    public Optional<Citas> findByIdCita(int id);
    
    public List<Citas> findByClienteContaining(String cliente);
}
