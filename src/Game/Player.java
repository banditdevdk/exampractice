package Game;

public class Player implements Comparable<Player>{
    private String name;
    private int level;
    private int score;

    public Player(String name, int level, int score) {
        this.name = name;
        this.level = level;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public void setName() {
        this.name = name;
    }

    @Override
    public String toString() {
        return " " + name + " " + level + " " + score + " ";
    }

    //compareTo() string "name"
    @Override
    public int compareTo(Player other) {
        return Integer.compare(this.level, other.level);
    }
}
