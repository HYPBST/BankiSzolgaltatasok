package com.company;

public class BankiSzolgaltatas {
    private Tulajdonos tulajdonos;

    public Tulajdonos getTulajdonos() {
        return tulajdonos;
    }

    private BankiSzolgaltatas(Tulajdonos tulajdonos) {
        this.tulajdonos = tulajdonos;
    }
}
