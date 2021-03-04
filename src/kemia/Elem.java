package kemia;


public class Elem {
    private String ev, elem,vegyjel,felfedezo;
    private int rendszam;

    public Elem(String sor) {
        String[] s = sor.split(";");
        this.ev = s[0];
        this.elem = s[1];
        this.vegyjel = s[2];
        this.rendszam = Integer.parseInt(s[3]);
        this.felfedezo = s[4];
    }

    public String getEv() {
        return ev;
    }

    public String getElem() {
        return elem;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public String getFelfedezo() {
        return felfedezo;
    }

    public int getRendszam() {
        return rendszam;
    }

    @Override
    public String toString() {
        return "Elemek{" + "ev=" + ev + ", elem=" + elem + ", vegyjel=" + vegyjel + ", felfedezo=" + felfedezo + ", rendszam=" + rendszam + '}';
    }
    
    
    
    
}
