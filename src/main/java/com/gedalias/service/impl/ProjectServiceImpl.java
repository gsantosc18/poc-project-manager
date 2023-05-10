package com.gedalias.service.impl;

import com.gedalias.dto.ProjectDTO;
import com.gedalias.persistence.port.ProjectPort;
import com.gedalias.qualifier.DefaultService;
import com.gedalias.service.ProjectService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

import java.util.List;

@RequestScoped
@DefaultService
public class ProjectServiceImpl implements ProjectService {
    private final ProjectPort projectPort;

    @Inject
    public ProjectServiceImpl(ProjectPort projectPort) {
        this.projectPort = projectPort;
    }

    @Override
    public void save(ProjectDTO projectDTO) {
        projectPort.save(projectDTO);
    }

    @Override
    public List<ProjectDTO> all() {
        return projectPort.all();
    }

    @Override
    public void delete(Long id) {
        projectPort.delete(id);
    }
}
