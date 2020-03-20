package enums;

import java.util.ArrayList;
import java.util.List;

public enum Tipusok {

    IRAT,
    KONYV,
    FOLYOIRAT;

    public List<Tipusok> getTipusok(){
        List<Tipusok> tipusok = new ArrayList<>();
        tipusok.add(IRAT);
        tipusok.add(KONYV);
        tipusok.add(FOLYOIRAT);
        return tipusok;
    }
}
