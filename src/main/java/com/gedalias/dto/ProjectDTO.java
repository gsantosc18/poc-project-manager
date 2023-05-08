package com.gedalias.dto;

public record ProjectDTO(
        Long id,
        String name,
        String description,
        int duration,
        String type
) {
}
