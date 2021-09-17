package Model;

import java.util.ArrayList;

public class MovieList {

    private ArrayList<Movie> movieList;

    public MovieList() {
        this.movieList = new ArrayList<>();
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(ArrayList<Movie> movieList) {
        this.movieList = movieList;
    }

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public void removeMovie(Movie movie) {
        movieList.remove(movie);
    }

}
