package Movie;

public class Movie {
    private String title;
    private String genre;
    private int rating;

    public Movie(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }
    public int getRating() {
        return rating;
    }

    public String setTitle() {
        return title;
    }

    @Override
    public String toString() {
        return " " + title + " " + genre + " " + rating + " ";
    }


}
