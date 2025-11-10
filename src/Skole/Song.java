package Skole;

public class Song implements Comparable<Song>{
    private String name;
    private String musician;
    private int duration;

    public Song(String name, String musician, int duration) {
        this.name = name;
        this.musician = musician;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getMusician() {
        return musician;
    }
    public int getDuration() {
        return duration;
    }

    public void setName() {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Navn: " + name + " Kunstner: " + musician + " Minutter: " + duration + " ";
    }

    @Override
    public int compareTo(Song o) {
        return Integer.compare(this.duration, o.duration);
    }
}
