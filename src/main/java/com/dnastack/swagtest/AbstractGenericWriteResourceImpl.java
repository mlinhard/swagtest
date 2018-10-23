package com.dnastack.swagtest;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public abstract class AbstractGenericWriteResourceImpl implements GenericWriteResource {

    @Override
    public Response find() {
        JsonObjectBuilder jsonBuilder = Json.createObjectBuilder();
        jsonBuilder.add("search", "result");
        return Response.status(Status.OK).entity(jsonBuilder.build()).build();
    }

}
