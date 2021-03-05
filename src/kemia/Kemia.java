package kemia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kemia {

    public static void main(String[] args) throws IOException {
        
        List<String> sorok = Files.readAllLines(Paths.get("felfedezesek.csv"));
        
        ArrayList<Elem> elemek = new ArrayList<>();
        for (int i = 1; i < sorok.size(); i++) {
            elemek.add(new Elem(sorok.get(i)));
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
        
        
        
        
        
        
        
        
        
    }
    
}
