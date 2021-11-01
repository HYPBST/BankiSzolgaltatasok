package com.company;

public class HitelSzamla extends Szamla {
    public int getHitelKeret() {
        return hitelKeret;
    }

    private int hitelKeret;
    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    @Override
    boolean kivesz(int osszeg) {
        if((this.getAktualisEgyenleg()-osszeg)<this.getHitelKeret()){
            return false;
        }else {
            this.befizet(osszeg*-1);
            return true;
        }
    }
}
