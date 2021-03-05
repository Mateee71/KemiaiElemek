package kemia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

        
        //5.feladat
        Scanner bekeres = new Scanner(System.in);
        List<String> beirtElemek = new ArrayList<>();
        int N = elemek.size();
        boolean talalt = true;
        while (talalt) {
            System.out.print("5.feladat Kérek egy vegyjelet: ");
            String vegyjel = bekeres.nextLine();
            if (vegyjel.length() <= 2 && vegyjel.length() >= 1 && vegyjel.matches(".*[a-z].*")) {
                beirtElemek.add(vegyjel);
            }else{
                talalt = false;
            }
        }
        
        System.out.print("7. feladat: ");
        int maxEv = 0;
        for (int i = 0; i < elemek.size()-1; i++) {
            if (!(elemek.get(i).getEv().equals("Ókor"))) {
                Integer.parseInt(elemek.get(i+1).getEv());
                if ((Integer.parseInt(elemek.get(i+1).getEv()) - Integer.parseInt(elemek.get(i).getEv())) > maxEv) {
                    maxEv = Integer.parseInt(elemek.get(i+1).getEv()) - Integer.parseInt(elemek.get(i).getEv());
                }
            }
            
        }
        System.out.println(maxEv + " év volt a leghosszabb időszak két elem felfedezése között.");
        
        
        System.out.println("8. feladat: Statisztika");
        HashMap<String, Integer> felfedezettElemek = new HashMap<>();
        for (Elem elem : elemek) {
            if (!(elem.getEv().equals("Ókor"))) {
                String kulcs = elem.getEv();
                if (!felfedezettElemek.containsKey(kulcs)) {
                    felfedezettElemek.put(kulcs, 1);
                }else{
                    int ertek = felfedezettElemek.get(kulcs);
                    felfedezettElemek.put(kulcs, ++ertek);
                }
            }
            
        }
        
        for (Map.Entry<String, Integer> entry : felfedezettElemek.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > 3) {
                System.out.println("\t"+key + ": " + value + "db");
            }
        }
        
    }
}
