package kemia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kemia {

    public static void main(String[] args) throws IOException {

        List<String> sorok = Files.readAllLines(Paths.get("felfedezesek.csv"));

        ArrayList<Elem> elemek = new ArrayList<>();
        for (int i = 1; i < sorok.size(); i++) {
            elemek.add(new Elem(sorok.get(i)));
        }

        //3.feladat
        System.out.println("3.feladat");
        int elemdb = 0;
        for (int i = 0; i < elemek.size(); i++) {
            elemdb++;
        }
        System.out.println("Elemek szám: " + elemdb);

        

    }
}
