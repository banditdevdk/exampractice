package Biblo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Boghylde {
    private ArrayList<Bog> boeger = new ArrayList<>();

    public static void main(String[] args) {
        Boghylde boghylde = new Boghylde();

        Bog b1 = new Bog("John Eventyr", "Hendrix", 45, false);
        Bog b2 = new Bog("IT", "JohnXoX", 103, false);
        Bog b3 = new Bog("Hunger Games", "Hendrix", 22, false);
        System.out.println(b1);

        boghylde.boeger.add(b1);
        boghylde.boeger.add(b2);
        boghylde.tilfoegBog(b3);

        System.out.println(boghylde.boeger);

        System.out.println("Samlet antal sider: " + boghylde.beregnSamletAntalSider());

        b1.markerSomLaest();
        System.out.println("Ulæste bøger: " + boghylde.hentUlaesteBoeger());

        System.out.println("Længe bog: " + boghylde.findLaengsteBog());

        Collections.sort(boghylde.boeger);
        Collections.reverse(boghylde.boeger);

        System.out.println("Sorteret efter int - antal sider: " + boghylde.boeger);
    }

    public void tilfoegBog(Bog bog) {
        boeger.add(bog);
    }

    public int beregnSamletAntalSider() {
        int sum = 0;
        for (Bog b : boeger) {
            sum += b.getAntalSider();
        }
        return sum;
    }

    public ArrayList<Bog> hentUlaesteBoeger() {
        ArrayList<Bog> result = new ArrayList<>();
        for (Bog b : boeger) {
            if (!b.getErLaest()) {
                result.add(b);
            }
        }
        return result;
    }

    public Bog findLaengsteBog() {
        if (boeger.isEmpty()) {
            return null;
        }
            Bog result = boeger.getFirst();
            for (Bog b : boeger) {
                if (result.getAntalSider() < b.getAntalSider()) {
                    result = b;
                }

            }
            return result;
        }
    }
