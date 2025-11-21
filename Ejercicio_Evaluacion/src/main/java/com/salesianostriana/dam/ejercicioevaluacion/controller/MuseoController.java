package com.salesianostriana.dam.ejercicioevaluacion.controller;

import com.salesianostriana.dam.ejercicioevaluacion.model.Museo;
import com.salesianostriana.dam.ejercicioevaluacion.repository.MuseoRepository;
import com.salesianostriana.dam.ejercicioevaluacion.service.MuseoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Controller
public class MuseoController {
    private MuseoService museoService;

    @PostMapping("/crear/")
    @Operation(summary = "Crear museos ")
    @ApiResponse()
    public Museo save(Museo museo) {
        return museoService.save(museo);

    }

    @GetMapping("/listar/")
    @Tag(name = "Museos", description = "Manejar peticiones museos")
    @Operation(summary = "Mostrar lista de museos")
    public List<Museo> listAll(Museo museo) {
        return museoService.listAll(museo);
    }

    @DeleteMapping("/borrar/")
    @Operation(summary = "Borrar museos")
    public void delete(Museo museo) {
        museoService.delete(museo);
    }
    @PutMapping("/buscar/")
    @Operation(summary = "Borrar museo por id")
    public Optional<Museo> findById(Long id){
        return museoService.findById(id);
    }

}
