package Series;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SeriesCollection {
    private ArrayList<Series> series = new ArrayList<>();

    public static void main(String[] args) {
        SeriesCollection objekt = new SeriesCollection();

        Series s1 = new Series("TWD", "Borne", 7.9);
        Series s2 = new Series("FUNFIC", "Bossman", 8.9);
        Series s3 = new Series("DAD", "David", 7.3);

        objekt.series.add(s1);
        objekt.series.add(s2);
        objekt.series.add(s3);

        System.out.println(objekt.series);

        System.out.println(objekt.getAverageRating());
        System.out.println(objekt.findFromAuthor("David"));


    }

    public double getAverageRating() {
        double sum = 0;
        for (Series s: series) {
            sum += s.getImdbScore();
        }
        double total = sum / series.size();
        return total;
    }

    public ArrayList<Series> findFromAuthor(String input) {
        ArrayList<Series> result = new ArrayList<>();
        for (Series s : series) {
            if (s.getAuthor().equalsIgnoreCase(input)) {
                result.add(s);
            }
        }
        return result;
    }

}
