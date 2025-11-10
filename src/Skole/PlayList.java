package Skole;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PlayList {
    ArrayList<Song> sange = new ArrayList<>();

    public static void main(String[] args) {
        PlayList list = new PlayList();

        Song s1 = new Song("Feel It Coming", "Daft Punk", 2);
        Song s2 = new Song("Timeless", "The Weekend", 3);
        Song s3 = new Song("Whatever", "Daft Punk", 5);

        list.sange.add(s1);
        list.sange.add(s2);
        list.sange.add(s3);

        Collections.sort(list.sange);
        System.out.println(list.sange);

        System.out.println(list.getTotalDuration());

//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();

        System.out.println(list.getSongFromMusician("Daft Punk"));

    }

    public int getTotalDuration() {
        int sum = 0;
        for (Song s : sange) {
            sum += s.getDuration();
        }
        return sum;
    }

    public ArrayList<Song> getSongFromMusician(String musician) {
        ArrayList<Song> result = new ArrayList<>();

        for (Song s : sange) {
            if (s.getMusician().equalsIgnoreCase(musician)) {
                result.add(s);
            }
        }
        return result;
    }
}


