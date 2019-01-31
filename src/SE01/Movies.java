package SE01;

public class Movies {

    private String title;

    public Movies(String title, String director, String genres, String description, int rating) {
        this.title = title;
        this.director = director;
        this.genres = genres;
        this.description = description;
        this.rating = rating;
    }

    private String director;
    private String genres;
    private String description;
    private int rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}