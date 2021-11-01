package com.company;

public class Szamla extends BankiSzolgaltatas{
    private int aktualisEgyenleg;


    public Szamla(Tulajdonos tulajdonos,int aktualisEgyenleg) {
        super(tulajdonos);
        this.aktualisEgyenleg = aktualisEgyenleg;
    }
}
