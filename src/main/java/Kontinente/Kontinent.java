package Kontinente;

public class Kontinent {
    private int anzahlEinwohner;
    private double fläche;
    private int anzahlLänder;
    private String name;

    public Kontinent(String  name, int anzahlEinwohner, double fläche, int anzahlLänder) {
        this.anzahlEinwohner = anzahlEinwohner;
        this.fläche = fläche;
        this.anzahlLänder = anzahlLänder;
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public int getAnzahlEinwohner() {
        return anzahlEinwohner;
    }

    public double getFläche() {
        return fläche;
    }

    public int getAnzahlLänder() {
        return anzahlLänder;
    }
}
