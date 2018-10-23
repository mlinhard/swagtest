package com.dnastack.swagtest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Hidden;

@Hidden
public interface GenericSearchResource extends GenericReadResource {

    @GET
    @Path("/")    
    @Produces(MediaType.APPLICATION_JSON)
    Response find();
}
