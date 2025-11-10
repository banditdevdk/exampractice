package Game;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game {
    private ArrayList<Player> players = new ArrayList<>();

    //empty
    public Game() {
    }

    public static void main(String[] args) {
        Game game = new Game();

        Player p1 = new Player("John", 10, 10);
        Player p2 = new Player("Bent", 20, 15);
        Player p3 = new Player("Jone", 25, 5);

        game.players.add(p1);
        game.players.add(p2);
        game.players.add(p3);

        System.out.println(game.players);

        System.out.println(game.getTotalScore());

        Collections.sort(game.players);
        System.out.println(game.players);

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv lvl du vil tjekke");
        int value = Integer.parseInt(sc.nextLine());

        System.out.println(game.getPlayerAboveLevel(value));

    }

    public int getTotalScore() {
        int total = 0;
        for (Player p: players) {
            total += p.getScore();
        }
        return total;
    }

    public ArrayList<Player> getPlayerAboveLevel(int level) {
        ArrayList<Player> result = new ArrayList<>();
        for (Player p: players) {
            int currentLvl = p.getLevel();
            if (currentLvl >= level) {
                result.add(p);
            }
        }
        return result;
    }
}
