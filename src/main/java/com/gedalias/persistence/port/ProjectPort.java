package com.gedalias.persistence.port;

import com.gedalias.dto.ProjectDTO;

import java.util.List;

public interface ProjectPort {
    void save(ProjectDTO projectDTO);
    List<ProjectDTO> all();
}
