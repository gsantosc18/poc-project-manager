package com.gedalias.controller;

import com.gedalias.dto.ProjectDTO;
import com.gedalias.qualifier.DefaultService;
import com.gedalias.service.ProjectService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/project")
public class ProjectController {
    private final ProjectService projectService;

    @Inject
    public ProjectController(@DefaultService ProjectService projectService) {
        this.projectService = projectService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listAll(){
        return Response.ok(projectService.all()).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response add(ProjectDTO projectDTO) {
        projectService.save(projectDTO);
        return Response.ok().build();
    }
}
