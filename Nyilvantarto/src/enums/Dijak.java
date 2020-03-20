package enums;

public enum Dijak {

    ALAPDIJ,
    KIEGESZITO_KONYV,
    KIEGESZITO_FOLYOIRAT;

    public int getValue(){
        switch (this){
            default:
            case ALAPDIJ: return 100;
            case KIEGESZITO_KONYV: return 110;
            case KIEGESZITO_FOLYOIRAT: return 23;
        }
    }
}
