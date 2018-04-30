package restWebservice;
import javax.ws.rs.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/Movies")
public class RestController{
	
	@GET
	@Path("/get/{movieName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Movie getMovieDetails(@PathParam("movieName") String nameOfMovie){
		Movie movie=null;
		if(nameOfMovie!=null && nameOfMovie.contains("Ragnarok")){
			System.out.println("If part...");
			movie = new Movie("Thor-Ragnarok","Released on 3 November 2017 in India");
		}else{
			System.out.println("else part...");
			movie = new Movie("Thor","Released on 29 April 2011 in India");
		}
		
		
		return movie;
	}
	
	@POST
	public Response saveMovieDetails(@QueryParam("movieName") String nameOfMovie, @QueryParam("releaseDate") String dateOfRelease){
		String finalSave = nameOfMovie + " and it's release Information "+ dateOfRelease;
		System.out.print("You are hitting the POST API");
		return Response.status(200).entity(finalSave).build();
	}
	
}


