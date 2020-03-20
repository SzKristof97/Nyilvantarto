package classes;

import enums.Tipusok;

public class Folyoirat extends Irat{

    private int evfolyam;
    private int szam;

    public Folyoirat(String cim, String kiado, int evfolyam, int szam) {
        super(cim, kiado);
        this.evfolyam = evfolyam;
        this.szam = szam;
        super.tipus = Tipusok.FOLYOIRAT;
    }

    public int getEvfolyam() {
        return evfolyam;
    }

    public void setEvfolyam(int evfolyam) {
        this.evfolyam = evfolyam;
    }

    public int getSzam() {
        return szam;
    }

    public void setSzam(int szam) {
        this.szam = szam;
    }

    @Override
    public String toString() {
        return  "\n" + super.toString() +
                "\n\tevfolyam='" + evfolyam + '\''+
                "\n\tszam='" + szam + '\'';
    }
}
