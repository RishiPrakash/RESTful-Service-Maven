package restWebservice;

public class Movie{

 String movieName;
 String movieReleaseDate;

public Movie(String name,String date){
this.movieName = name;
this.movieReleaseDate = date;

}


public String getMovieName() {
	return movieName;
}


public void setMovieName(String movieName) {
	this.movieName = movieName;
}


public String getMovieReleaseDate() {
	return movieReleaseDate;
}


public void setMovieReleaseDate(String movieReleaseDate) {
	this.movieReleaseDate = movieReleaseDate;
}


public void displayMovieInfo(){
System.out.println( this.movieName+" and "+ this.movieReleaseDate);
}


}