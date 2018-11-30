package pl.mkrause.rest.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pl.mkrause.rest.domain.Fish;
import pl.mkrause.rest.service.FishManager;

@Path("fish")
@Stateless
public class FishRESTService {

	@Inject
	private FishManager pm;

	@GET
	@Path("/{fishId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Fish getFish(@PathParam("fishId") Integer id) {
		Fish f = pm.getFish(id);
		return f;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Fish> getPluralfish() {
		return pm.getAllFish();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addFish(Fish fish) {
		pm.addFish(fish);

		return Response.status(201).entity("Fish").build();
	}

	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		return "REST API /fish is running today!";
	}

	@DELETE
	public Response clearFish() {
		pm.deleteAllFish();
		return Response.status(200).build();
	}

}
