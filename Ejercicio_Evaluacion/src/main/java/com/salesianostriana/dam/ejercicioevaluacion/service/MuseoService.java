package com.salesianostriana.dam.ejercicioevaluacion.service;


import com.salesianostriana.dam.ejercicioevaluacion.model.Museo;
import com.salesianostriana.dam.ejercicioevaluacion.repository.MuseoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MuseoService {
    private MuseoRepository museoRepository;

    public List<Museo> listAll(Museo museo){
        return museoRepository.findAll();
    }

    public Optional<Museo> findById(Long id){
        return museoRepository.findById(id);
    }

    public void delete(Museo museo){
        museoRepository.delete(museo);
    }
    public Museo save(Museo museo){
        return museoRepository.save(museo);
    }

}

