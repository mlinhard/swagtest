package com.dnastack.swagtest;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/swagtest")
public class SwaggerResourceImpl extends AbstractGenericWriteResourceImpl implements SwaggerResource {

    @Override
    public Response get(Long id) {
        JsonObjectBuilder jsonBuilder = Json.createObjectBuilder();
        jsonBuilder.add("id", id);
        return Response.status(Status.OK).entity(jsonBuilder.build()).build();
    }

    @Override
    public Response edit(Long id, JsonObject json) {
        return Response.status(Status.OK).entity(json).build();
    }
}
