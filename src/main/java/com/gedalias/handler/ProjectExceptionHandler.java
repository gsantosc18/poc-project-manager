package com.gedalias.handler;

import com.gedalias.exception.ProjectNotFoundException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ProjectExceptionHandler implements ExceptionMapper<ProjectNotFoundException> {
    @Override
    public Response toResponse(ProjectNotFoundException exception) {
        return Response
                .status(Response.Status.NOT_FOUND)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .build();
    }
}
