package com.gedalias.service;

import com.gedalias.dto.ProjectDTO;

import java.util.List;

public interface ProjectService {
    void save(ProjectDTO projectDTO);
    List<ProjectDTO> all();
    void delete(Long id);
}
