package com.vr.greetings;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class GreetingResource {

    @Inject
    GreetingService service;

    @GET
    @Path("/hello-resteasy")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Path("/greeting/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String greetings(@PathParam(value = "name") String name){
        return service.greeting(name);
    }


}