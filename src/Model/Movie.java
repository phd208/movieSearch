package Model;

public class Movie {

    private String title;
    private String year;
    private String imdbID;
    private String type;
    private String poster;
    private String plot;
    private String director;
    private String genre;
    private String actors;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String displayResult() {

        return this.getTitle() + " (" + this.getYear() + ")\n " + this.poster;
    }

    public String displaySummary() {
        return this.getTitle() + " (" + this.getYear() + ") - " + this.getGenre()
                + "\nDirector: " + this.getDirector()
                + "\nActors: " + this.getActors()
                + "\nPlot: " + this.getPlot()
                + "\nPoster: " + this.getPoster();
    }


}
