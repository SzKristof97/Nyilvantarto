package classes;

import enums.Tipusok;

public class Konyv extends Irat{

    private String szerzo;
    private int oldalszam;

    public Konyv(String cim, String kiado, String szerzo, int oldalszam) {
        super(cim, kiado);
        this.szerzo = szerzo;
        this.oldalszam = oldalszam;
        super.tipus = Tipusok.KONYV;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public int getOldalszam() {
        return oldalszam;
    }

    public void setOldalszam(int oldalszam) {
        this.oldalszam = oldalszam;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() +
                "\n\tszerzo='" + szerzo + '\'' +
                "\n\toldalszam='" + oldalszam + '\'';
    }
}
