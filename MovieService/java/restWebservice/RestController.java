package restWebservice;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/Movies")
class RestController{
	
	@GET
	@Path("/{movieName}")
	public Movie getMovieDetails(@PathParam("{movieName}") String nameOfMovie){
		Movie movie=null;
		if(nameOfMovie.contains("Ragnarok")){
				new Movie("Thor-Ragnarok","Released on 3 November 2017 in India");
		}else{
			new Movie("Thor","Released on 29 April 2011 in India");
		}
		return movie;
	}
	
	@POST
	public Response saveMovieDetails(@QueryParam("movieName") String nameOfMovie, @QueryParam("releaseDate") String dateOfRelease){
		String finalSave = nameOfMovie + " and it's release Information "+ dateOfRelease;
		
		return Response.status(200).entity(finalSave).build();
	}
	
}


class Movie{

private String movieName;
private String movieReleaseDate;

public Movie(String name,String date){
this.movieName = name;
this.movieReleaseDate = date;

}


public void displayMovieInfo(){
System.out.println( this.movieName+" and "+ this.movieReleaseDate);
}


}