package com.gedalias.persistence.mapper;

import com.gedalias.dto.ProjectDTO;
import com.gedalias.persistence.entity.ProjectEntity;

public class ProjectMapper {
    public static ProjectEntity toEntity(ProjectDTO projectDTO) {
        return new ProjectEntity(
            projectDTO.id(),
            projectDTO.name(),
            projectDTO.description(),
            projectDTO.duration(),
            projectDTO.type()
        );
    }

    public static ProjectDTO toDTO(ProjectEntity projectEntity) {
        return new ProjectDTO(
                projectEntity.getId(),
                projectEntity.getName(),
                projectEntity.getDescription(),
                projectEntity.getDuration(),
                projectEntity.getDurationType()
        );
    }
}
