package com.fstn;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class ValidateInvoice {

	private final String wsURL = "http://127.0.0.1:8080/";
	private final String wsAction = "validateInvoice";

	@POST
	@Path("/validateInvoice")
	@Produces("application/json")
	@Consumes("application/json")
	public Context validate(Context context) {
		System.out.println("world/"+wsAction);
		Context result = null;
		context.addCall(new StackCall("world/"+wsAction));
		Client client = ClientBuilder.newBuilder().build();
		result = client.target(wsURL + "eu/"+wsAction).request()
				.post(Entity.entity(context, MediaType.APPLICATION_JSON), Context.class);

		return result;
	}

	@GET
	@Path("/check")
	public Response check() {
		return Response.ok().build();
	}

	@GET
	@Path("/get")
	@Produces("application/json")
	public Invoice get() {
		return new Invoice("2015-12-35569", 10300.60, new Date());
	}

}