package com.company;

    public abstract class Szamla extends BankiSzolgaltatas{


    private int aktualisEgyenleg;


    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.aktualisEgyenleg=0;
    }
    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }
    public void befizet(int osszeg){
        this.aktualisEgyenleg+=osszeg;
    }

    abstract boolean kivesz(int osszeg);
}
