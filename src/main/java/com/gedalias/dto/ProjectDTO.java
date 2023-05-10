package com.gedalias.dto;

import com.gedalias.types.DurationType;

public record ProjectDTO(
        Long id,
        String name,
        String description,
        int duration,
        DurationType type
) {
}
