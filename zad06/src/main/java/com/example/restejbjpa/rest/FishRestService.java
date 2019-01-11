package com.example.restejbjpa.rest;

import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.restejbjpa.domain.Fish;
import com.example.restejbjpa.service.FishManager;



@Path("fish")
@Stateless
public class FishRestService {

	@EJB
	FishManager manager;
	
	@GET
	@Path(value = "/{FishID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Fish getFish(@PathParam("FishID") long id) {
		Fish fish = manager.getFish(id);
		return fish;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Fish> getFishes(){
		return manager.getAllFish();
	}
	
	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test(){
		return "REST Service is running now!";
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addFish(Fish fish) {
		System.out.println(fish.toString());
		manager.addFish(fish);
		
		
		return Response.status(201).entity("Fish").build();
	}
	
	@DELETE
	public Response deleteFish() {
		manager.deleteAll();
		return Response.status(200).build();
	}
	
	
}
