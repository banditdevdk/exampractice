package Movie;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieCollection {
    private  ArrayList<Movie> film = new ArrayList<>();

    public static void main(String[] args) {
        Movie en = new Movie("John", "Horror", 9);
        Movie to = new Movie("Hitler", "Action", 4);
        Movie tre = new Movie("Sex", "Horror", 5);
        System.out.println(en);

        ArrayList<Movie> film = new ArrayList<>(Arrays.asList(en, to, tre));
        System.out.println(film);


        MovieCollection movieCollection = new MovieCollection();
        System.out.println(movieCollection.getAverageRating());
        System.out.println(movieCollection.getMoviesFromGenre("Horror"));

    }

    public int getAverageRating() {
        int sum = 0;
        for (Movie m: film) {
            sum += m.getRating();
        }
        return sum;
    }

    public String getMoviesFromGenre(String genre) {
        ArrayList<String> gen = new ArrayList<>();
        for (Movie m: film) {
            if (m.getGenre().equalsIgnoreCase(genre)) {
                gen.add(genre);
            }
        }
        return genre;
    }

}
