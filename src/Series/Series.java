package Series;

public class Series {
    private String title;
    private String author;
    private double imdbScore;

    public Series(String title, String author, double imdbScore) {
        this.title = title;
        this.author = author;
        this.imdbScore = imdbScore;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getImdbScore() {
        return imdbScore;
    }

    public void setTitle() {
        this.title = title;
    }

    @Override
    public String toString() {
        return title + " " + author + " " + imdbScore + " ";
    }



}
