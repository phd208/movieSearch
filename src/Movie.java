public class Movie {

    private String Title;
    private int Year;
    private String imdbID;
    private String Type;
    private String Poster;

    public Movie(String title, int year, String imdbID, String type, String poster) {
        this.Title = title;
        this.Year = year;
        this.imdbID = imdbID;
        this.Type = type;
        this.Poster = poster;
    }

    public Movie() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        this.Year = year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String poster) {
        this.Poster = poster;
    }
}
