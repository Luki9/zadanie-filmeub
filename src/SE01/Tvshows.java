package SE01;

public class Tvshows {

    private String title;
    private int seasons;
    private int parts;
    private String producer;
    private int rating;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getParts() {
        return parts;
    }

    public void setParts(int parts) {
        this.parts = parts;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Tvshows(String title, int seasons, int parts, String producer, int rating, String description) {
        this.title = title;
        this.seasons = seasons;
        this.parts = parts;
        this.producer = producer;
        this.rating = rating;
        this.description = description;
    }
}
