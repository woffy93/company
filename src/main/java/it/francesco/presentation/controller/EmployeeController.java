package it.francesco.presentation.controller;


import it.francesco.presentation.domain.dto.DevDto;
import it.francesco.presentation.domain.service.IRetrieveService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("employees")
public class EmployeeController { //todo

    @Inject
    private IRetrieveService retrieveService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DevDto> devs() {

        List<DevDto> devs = retrieveService.retrieveAllDevs(); //test only
        return null; //todo json stuff

    }
}
