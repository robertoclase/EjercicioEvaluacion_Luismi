package com.salesianostriana.dam.ejercicioevaluacion.repository;

import com.salesianostriana.dam.ejercicioevaluacion.model.Museo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuseoRepository extends JpaRepository<Museo, Long> {

}
