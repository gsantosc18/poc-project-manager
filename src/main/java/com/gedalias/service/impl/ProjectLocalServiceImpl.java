package com.gedalias.service.impl;

import com.gedalias.dto.ProjectDTO;
import com.gedalias.service.ProjectService;
import com.gedalias.qualifier.ServiceLocal;
import jakarta.inject.Singleton;

import java.util.LinkedList;
import java.util.List;

@Singleton
@ServiceLocal
public class ProjectLocalServiceImpl implements ProjectService {
    private static final List<ProjectDTO> projects;
    static {
        projects = new LinkedList<>();
    }

    @Override
    public void save(ProjectDTO projectDTO) {
        projects.add(projectDTO);
    }

    @Override
    public List<ProjectDTO> all() {
        return projects;
    }
}
