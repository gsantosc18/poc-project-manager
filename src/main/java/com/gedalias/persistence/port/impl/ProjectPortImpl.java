package com.gedalias.persistence.port.impl;

import com.gedalias.dto.ProjectDTO;
import com.gedalias.persistence.entity.ProjectEntity;
import com.gedalias.persistence.mapper.ProjectMapper;
import com.gedalias.persistence.port.ProjectPort;
import jakarta.enterprise.context.RequestScoped;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class ProjectPortImpl implements ProjectPort {
    @Override
    @Transactional
    public void save(ProjectDTO projectDTO) {
        final ProjectEntity projectEntity = ProjectMapper.toEntity(projectDTO);
        projectEntity.persist();
    }

    @Override
    public List<ProjectDTO> all() {
        return ProjectEntity.listAll()
                .stream()
                .map(p -> ProjectMapper.toDTO((ProjectEntity) p))
                .collect(Collectors.toList());
    }
}
