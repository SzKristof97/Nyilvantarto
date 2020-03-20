package managers;

import classes.Irat;

import java.util.ArrayList;
import java.util.List;

public class Nyilvantarto {

    private List<Irat> iratok;

    public Nyilvantarto() {
        iratok = new ArrayList<>();
    }

    public List<Irat> getIratok() {
        return iratok;
    }

    public void addIrat(Irat irat){
        iratok.add(irat);
    }

    /**
     * Cím szerinti keresés (Részlet is elég)
     *
     * @param cim Szöveg típusú változó
     * @return A visszatérési érték a találatok listája.
     */
    public List<Irat> keresCim(String cim){
        //Ebben a változóban tárolok minden olyan iratot ami megfelel a keresési feltételeknek
        List<Irat> talalatok = new ArrayList<>();

        //Keresés a listában
        for(Irat i : iratok){
            //Cím eggyezésének tesztelése (Részlet is elég)
            if(i.getCim().contains(cim)){
                talalatok.add(i); //Ha talált hozzá adja
            }
        }
        return talalatok; //Vissza tér a találatok listájával!
    }
}
