package Kontinente;

import Sort.Sort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main() {
        List<Kontinent> kontinente = new ArrayList<>();

        kontinente.add(new Kontinent("Afrika", 1400000000, 30370000, 54));
        kontinente.add(new Kontinent("Europa", 750000000, 10180000, 44));
        kontinente.add(new Kontinent("Asien", 470000000, 44580000, 49));
        kontinente.add(new Kontinent("Nordamerika", 600000000, 24709000, 23));
        kontinente.add(new Kontinent("Südamerika", 440000000, 17840000, 12));
        kontinente.add(new Kontinent("Ozeanien", 44000000, 8526000, 14));
        kontinente.add(new Kontinent("Antarktika", 0, 14000000, 0));


    }
}

