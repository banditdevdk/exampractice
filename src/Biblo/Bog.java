package Biblo;

public class Bog implements  Comparable<Bog> {
    private String titel;
    private String forfatter;
    private int antalSider;
    private boolean erLaest;

    public Bog(String titel, String forfatter, int antalSider, boolean erLaest) {
        this.titel = titel;
        this.forfatter = forfatter;
        this.antalSider = antalSider;
        this.erLaest = false;
    }

    public String getTitel() {
        return titel;
    }

    public String getForfatter() {
        return forfatter;
    }

    public int getAntalSider() {
        return antalSider;
    }

    public boolean getErLaest() {
        return erLaest;
    }

    public void setAntalSider(int nytNummer) {
        antalSider = nytNummer;
    }

    public void markerSomLaest() {
        this.erLaest = true;
    }

    @Override
    public String toString() {
        return titel + " " + forfatter + " " + antalSider + " " + erLaest;
    }

    @Override
    public int compareTo(Bog o) {
        return Integer.compare(this.antalSider, o.antalSider);
    }
}
