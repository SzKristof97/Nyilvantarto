package classes;

import enums.Tipusok;

public class Irat {

    private String cim;
    private String kiado;
    protected Tipusok tipus;

    public Irat(String cim, String kiado) {
        this.cim = cim;
        this.kiado = kiado;
        this.tipus = Tipusok.IRAT;
    }

    public Tipusok getTipus() {
        return tipus;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getKiado() {
        return kiado;
    }

    public void setKiado(String kiado) {
        this.kiado = kiado;
    }

    @Override
    public String toString() {
        return "\tcim='" + cim  + '\''+
                "\n\tkiado='" + kiado  + '\'' +
                "\n\ttipus='" + tipus + '\'';
    }
}
