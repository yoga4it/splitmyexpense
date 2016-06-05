package com.works.onkar_test.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.works.onkar_test.model.AppRequest;
import com.works.onkar_test.model.AppResponse;

@Path("/")
public class AppService {

	@POST
	@Path("/getSumService")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response service(AppRequest appRequest) {

		System.out.println("Service invoked");
		return Response.status(200).entity(new AppResponse(appRequest.getNumber1(), appRequest.getNumber2())).build();
	}

}