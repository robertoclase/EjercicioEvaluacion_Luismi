package com.salesianostriana.dam.ejercicioevaluacion.dto;


public record MuseoDto(
        String nombre,
        String ciudad,
        String anio,
        Integer numero_salas,
        String descripcion,
        String url,
        String imagen
) {}
